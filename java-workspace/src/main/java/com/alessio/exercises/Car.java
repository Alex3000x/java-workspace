package com.alessio.exercises;

public class Car {
    boolean isOn;
    String licensePlate;

    public Car(boolean isOn, String licensePlate) {
        this.isOn = isOn;
        this.licensePlate = licensePlate;
    }

    public void turnOn(){
        isOn = true;
    }

    public void turnOff(){
        isOn = false;
        System.out.println("click!");
    }
}
