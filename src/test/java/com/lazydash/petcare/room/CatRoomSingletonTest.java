package com.lazydash.petcare.room;

import org.junit.Assert;
import org.junit.Test;


public class CatRoomSingletonTest {

    @Test
    public void testSingleton(){
        CatRoom catRoom1 = CatRoomSingleton.getInstance();
        CatRoom catRoom2 = CatRoomSingleton.getInstance();

        Assert.assertTrue(catRoom1 == catRoom2);
    }
}
