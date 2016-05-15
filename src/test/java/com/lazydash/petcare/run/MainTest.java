package com.lazydash.petcare.run;

import com.lazydash.petcare.monitor.WebCamera;
import com.lazydash.petcare.pet.Cat;
import com.lazydash.petcare.pet.CatBuilder;
import com.lazydash.petcare.room.CatRoom;
import com.lazydash.petcare.room.CatRoomSingleton;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by valiuv on 12.06.2015.
 */
public class MainTest {

    @Before
    public void before(){
        CatRoom catRoom = CatRoomSingleton.getInstance();
        catRoom.evacuation();
    }

    @Test
    public void testStartWebCameraOneCatEnterOneCatLeaves(){
        WebCamera webCamera = new WebCamera();

        CatRoom catRoom = CatRoomSingleton.getInstance();
        catRoom.addObserver(webCamera);

        CatBuilder catBuilder = new CatBuilder();
        Cat miti = catBuilder.setName("miti")
                .setColor("black")
                .setWeight(2)
                .setAge(1)
                .build();

        catRoom.addCat(miti);
        Assert.assertEquals(1, catRoom.getCatNumber());
        Assert.assertEquals(1, webCamera.getCatNumber());

        catRoom.removeCat(miti);
        Assert.assertEquals(0, catRoom.getCatNumber());
        Assert.assertEquals(0, webCamera.getCatNumber());

    }

    @Test
    public void testStartWebCameraThreeCatsEnterTwoCatsLeave(){
        WebCamera webCamera = new WebCamera();

        CatRoom catRoom = CatRoomSingleton.getInstance();
        catRoom.addObserver(webCamera);

        CatBuilder catBuilder = new CatBuilder();
        Cat miti = catBuilder.setName("miti")
                .setColor("black")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat fifi = catBuilder.setName("fifi")
                .setColor("white")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat muki = catBuilder.setName("muki")
                .setColor("white")
                .setWeight(4)
                .setAge(8)
                .build();

        catRoom.addCat(miti);
        catRoom.addCat(fifi);
        catRoom.addCat(muki);
        Assert.assertEquals(3, catRoom.getCatNumber());
        Assert.assertEquals(3, webCamera.getCatNumber());

        catRoom.removeCat(miti);
        catRoom.removeCat(fifi);
        Assert.assertEquals(1, catRoom.getCatNumber());
        Assert.assertEquals(1, webCamera.getCatNumber());

    }

    @Test
    public void testStartTwoWebCamerasThreeCatsEnterTwoCatsLeave(){
        WebCamera webCameraOne = new WebCamera();
        WebCamera webCameraTwo = new WebCamera();

        CatRoom catRoom = CatRoomSingleton.getInstance();
        catRoom.addObserver(webCameraOne);
        catRoom.addObserver(webCameraTwo);

        CatBuilder catBuilder = new CatBuilder();
        Cat miti = catBuilder.setName("miti")
                .setColor("black")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat fifi = catBuilder.setName("fifi")
                .setColor("white")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat muki = catBuilder.setName("muki")
                .setColor("white")
                .setWeight(4)
                .setAge(8)
                .build();

        catRoom.addCat(miti);
        catRoom.addCat(fifi);
        catRoom.addCat(muki);
        Assert.assertEquals(3, catRoom.getCatNumber());
        Assert.assertEquals(3, webCameraOne.getCatNumber());
        Assert.assertEquals(3, webCameraTwo.getCatNumber());

        catRoom.removeCat(miti);
        catRoom.removeCat(fifi);
        Assert.assertEquals(1, catRoom.getCatNumber());
        Assert.assertEquals(1, webCameraOne.getCatNumber());
        Assert.assertEquals(1, webCameraTwo.getCatNumber());

    }

    @Test
    public void testThreeCatsEnterStarWebCameraTwoCatsLeave(){
        WebCamera webCamera = new WebCamera();

        CatRoom catRoom = CatRoomSingleton.getInstance();

        CatBuilder catBuilder = new CatBuilder();
        Cat miti = catBuilder.setName("miti")
                .setColor("black")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat fifi = catBuilder.setName("fifi")
                .setColor("white")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat muki = catBuilder.setName("muki")
                .setColor("white")
                .setWeight(4)
                .setAge(8)
                .build();

        catRoom.addCat(miti);
        catRoom.addCat(fifi);
        catRoom.addCat(muki);
        Assert.assertEquals(3, catRoom.getCatNumber());
        Assert.assertEquals(0, webCamera.getCatNumber());

        catRoom.addObserver(webCamera);

        catRoom.removeCat(miti);
        catRoom.removeCat(fifi);
        Assert.assertEquals(1, catRoom.getCatNumber());
        Assert.assertEquals(-2, webCamera.getCatNumber());

    }

    @Test
    public void testStarWebCameraThreeCatsEnterRoomEvacuation(){
        WebCamera webCamera = new WebCamera();

        CatRoom catRoom = CatRoomSingleton.getInstance();
        catRoom.addObserver(webCamera);

        CatBuilder catBuilder = new CatBuilder();
        Cat miti = catBuilder.setName("miti")
                .setColor("black")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat fifi = catBuilder.setName("fifi")
                .setColor("white")
                .setWeight(2)
                .setAge(1)
                .build();

        Cat muki = catBuilder.setName("muki")
                .setColor("white")
                .setWeight(4)
                .setAge(8)
                .build();

        catRoom.addCat(miti);
        catRoom.addCat(fifi);
        catRoom.addCat(muki);
        Assert.assertEquals(3, catRoom.getCatNumber());
        Assert.assertEquals(3, webCamera.getCatNumber());

        catRoom.evacuation();
        Assert.assertEquals(0, catRoom.getCatNumber());
        Assert.assertEquals(0, webCamera.getCatNumber());

    }
}
