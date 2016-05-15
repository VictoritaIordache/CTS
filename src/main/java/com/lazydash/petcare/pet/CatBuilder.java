package com.lazydash.petcare.pet;

/**
 * Created by valiuv on 11.06.2015.
 */
public class CatBuilder {
    private String name;
    private String color;
    private int age;
    private int weight;

    public CatBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CatBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CatBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CatBuilder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Cat build(){
        Cat cat = new Cat();
        cat.setName(name);
        cat.setAge(age);
        cat.setWeight(weight);
        cat.setColor(color);
        return cat;
    }

}
