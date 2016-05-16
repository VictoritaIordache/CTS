package com.lazydash.petcare.room;

import com.lazydash.petcare.pet.Cat;
import org.junit.Assert;
import org.junit.Test;


public class CatRoomTest {

    @Test
    public void testRoomEvacuation(){
        CatRoom catRoom = new CatRoom();
        catRoom.addCat(new Cat());
        catRoom.addCat(new Cat());
        catRoom.addCat(new Cat());

        Assert.assertEquals(catRoom.getCatNumber(), 3);
        catRoom.evacuation();

        Assert.assertEquals(catRoom.getCatNumber(), 0);
    }
}
