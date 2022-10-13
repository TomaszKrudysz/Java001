package com.example.oop.basics.methods;

class Radio {
    int yearProduction;
    int volume;
    String station;

    Radio() {
        this.yearProduction = 2000;
        volume = 100;
    }
    Radio(int yearProduction) {
        this();
        this.yearProduction = yearProduction;
        this.changeStation("Rock");
    }

    public  void  changeStation(String newStation) {
        this.station = newStation;
    }

    public Radio getRadio() {
        return this;
    }

    public void  printRadioInfo(Radio radio) {
        System.out.println("Radio production year: " + radio.yearProduction);
    }
}
/**
 * Created by tkrud on 13.10.2022.
 */
public class ThisUsage {
    public static void main(String[] args) {
        Radio oldRadio = new Radio(1996);
        Radio newRadio = new Radio(2010);

        newRadio.printRadioInfo(oldRadio);
        newRadio.printRadioInfo(newRadio);
        oldRadio.printRadioInfo(oldRadio);
        oldRadio.printRadioInfo(newRadio);
    }
}
