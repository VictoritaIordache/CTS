package com.lazydash.petcare.room;

import com.lazydash.petcare.pet.Cat;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 * Created by valiuv on 11.06.2015.
 */
public class CatRoomSingleton {
    private static CatRoom catRoom;

    public static CatRoom getInstance(){
        if (catRoom == null){
            catRoom = new CatRoom();
        }

        return catRoom;
    }

}
