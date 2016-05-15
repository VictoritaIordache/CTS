package com.lazydash.petcare.room;

import com.lazydash.petcare.pet.Cat;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 * Created by valiuv on 11.06.2015.
 */
public class CatRoom extends Observable {
    private List<Cat> catList = new LinkedList<Cat>();

    public void addCat(Cat cat){
        setChanged();
        notifyObservers("enter");
        catList.add(cat);
    }

    public void removeCat(Cat cat){
        setChanged();
        notifyObservers("exit");
        catList.remove(cat);
    }

    public void evacuation(){
        setChanged();
        notifyObservers("evacuation");
        catList.clear();
    }

    public int getCatNumber(){
        return catList.size();
    }

}
