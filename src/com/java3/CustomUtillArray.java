package com.java3;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomUtillArray<T> {
    /**
     *
     * @param arr  массив в котором меняем местами элементы
     * @param key1 элемент1
     * @param key2 элемент 2
     * @return
     */
    public T[] modifyingArray(T[] arr, int key1,int key2){
        if(arr[key1] != null && arr[key2] != null){
            T temp = arr[key1];
            arr[key1]=arr[key2];
            arr[key2]=temp;
        }
        return arr;
    }

    public ArrayList<T> toArrayList(T[] arr){
        ArrayList<T> arrList = new ArrayList<T>(Arrays.asList(arr));
        return arrList;
    }

}
