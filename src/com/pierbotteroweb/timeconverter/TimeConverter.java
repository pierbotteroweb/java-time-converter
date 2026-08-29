package com.pierbotteroweb.timeconverter;

public class TimeConverter {

    private int totalSeconds;

    public TimeConverter(int total) {
        this.totalSeconds = total;
    }

    public int convertToMinutes(){
        return totalSeconds/60;
    }

    public String convertToTime(){
        return totalSeconds/3600 + ":" + (totalSeconds%3600)/60 + ":" + (totalSeconds%3600)%60;
    }


    
}