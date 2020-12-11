package com.java3;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //1 задание
	CustomUtillArray<String> customUtillArray = new CustomUtillArray();
	String[] stringArr = new String[5];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i]=getAlphaNumericString(5);
        }
        System.out.println(java.util.Arrays.toString(stringArr));
        stringArr=customUtillArray.modifyingArray(stringArr, 1,2);
        System.out.println(java.util.Arrays.toString(stringArr));

        //2 задание
        ArrayList arrayList= customUtillArray.toArrayList(stringArr);
        System.out.println(arrayList);

        // третие задание
        int appleCount1 = (int)(Math.random()*100);
        int appleCount2 = (int)(Math.random()*100);
        int orangeCount1 = (int)(Math.random()*100);
        System.out.println(appleCount1);
        Orange orange= new Orange();
        Apple apple= new Apple();
        FruitBox<Orange> orangeBox =new FruitBox<Orange>();
        orangeBox.addFruit(orange,orangeCount1);

        FruitBox<Apple> appleBox1 =new FruitBox<Apple>();
        appleBox1.addFruit(apple,appleCount1);

        FruitBox<Apple> appleBox2 =new FruitBox<Apple>();
        appleBox2.addFruit(apple,appleCount2);

        System.out.println("в ящике appleBox1");
        System.out.println(appleBox1.getWeight());

        System.out.println("в ящике appleBox2");
        System.out.println(appleBox2.getWeight());

        appleBox2.pourTo(appleBox1);

        System.out.println("в ящике appleBox1");
        System.out.println(appleBox1.getWeight());

        System.out.println("в ящике appleBox2");
        System.out.println(appleBox2.getWeight());

    }

    static String getAlphaNumericString(int n) {
        // выбрал символ случайный из этой строки
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // создаем StringBuffer размером AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            // генерируем случайное число между
            // 0 переменной длины AlphaNumericString
            int index
                    = (int) (AlphaNumericString.length()
                    * Math.random());
            // добавляем символ один за другим в конец sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }
        return sb.toString();
    }


}
