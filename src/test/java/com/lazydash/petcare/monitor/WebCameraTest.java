package com.lazydash.petcare.monitor;

import com.lazydash.petcare.pet.Cat;
import com.lazydash.petcare.room.CatRoom;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by valiuv on 12.06.2015.
 */
public class WebCameraTest {

    @Test
    public void testWebCamera(){
        WebCamera webCamera = new WebCamera();

        CatRoom catRoom = new CatRoom();
        catRoom.addObserver(webCamera);

        catRoom.addCat(new Cat());
        catRoom.addCat(new Cat());
        catRoom.addCat(new Cat());

        Assert.assertEquals(webCamera.getCatNumber(), catRoom.getCatNumber());
    }
}
