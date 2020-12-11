package com.java3;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {
    private ArrayList<T> box = new ArrayList();

    public float getWeight(){
        float weight=0f;
        for(T o : box){
            weight += o.getWeight();
        }
        return weight;
    }
    public void pourTo(FruitBox <T>anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public boolean compare(FruitBox anotherBox) {
        if(getWeight() == anotherBox.getWeight()) return true;
        return false;
    }

    public void addFruit(T fruit, int amount){
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }
}
