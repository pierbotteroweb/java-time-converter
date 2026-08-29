package com.pierbotteroweb.timeconverter;

public class Main {
    public static void main(String[] args){
        TimeConverter converter = new TimeConverter(6672);

        int minutes = converter.convertToMinutes();
        String timeInMinutes = converter.convertToTime();

        System.out.println("Tempo em minutos: "+minutes);
        System.out.println("Tempo em string: "+timeInMinutes);

    }

}