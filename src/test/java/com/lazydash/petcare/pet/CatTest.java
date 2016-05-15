package com.lazydash.petcare.pet;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by valiuv on 12.06.2015.
 */
public class CatTest {

    @Test
    public void testEquals(){
        Cat cat1 = new Cat();
        cat1.setAge(11);
        cat1.setName("fifi");
        cat1.setWeight(3);
        cat1.setColor("black");

        Cat cat2 = new Cat();
        cat2.setAge(11);
        cat2.setName("fifi");
        cat2.setWeight(3);
        cat2.setColor("black");

        Assert.assertEquals(cat1, cat2);
        Assert.assertTrue(cat1 != cat2);

    }
}
