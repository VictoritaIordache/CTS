package com.lazydash.petcare.monitor;

import java.util.Observable;
import java.util.Observer;


public class WebCamera implements Observer {
    private int catNumber = 0;

    public int getCatNumber() {
        return catNumber;
    }

    public void update(Observable o, Object arg) {
        String catAction = (String) arg;
        updateCatNumber(catAction);
    }

    private void updateCatNumber(String catAction) {
        if (catAction.equals("enter")){
            catNumber++;
        } else if (catAction.equals("exit")){
            catNumber--;
        } else if (catAction.equals("evacuation")){
            catNumber=0;
        }
    }
}
