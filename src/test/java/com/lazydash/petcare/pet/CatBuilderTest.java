package com.lazydash.petcare.pet;

import org.junit.Assert;
import org.junit.Test;


public class CatBuilderTest {

    @Test
    public void testCatBuilder(){
        String name = "fifi";
        int age = 2;
        String color = "black";
        int weight = 4;

        Cat cat1 = new Cat();
        cat1.setName(name);
        cat1.setAge(age);
        cat1.setColor(color);
        cat1.setWeight(weight);

        CatBuilder catBuilder = new CatBuilder();
        Cat cat2 = catBuilder.setName(name)
                .setWeight(weight)
                .setColor(color)
                .setAge(age)
                .build();

        Assert.assertEquals(cat1, cat2);

    }
}
