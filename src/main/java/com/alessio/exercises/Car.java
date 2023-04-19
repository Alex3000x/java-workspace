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

    @Override
    public String toString() {
        return "Car{" +
                "isOn=" + isOn +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public void turnOff(){
        isOn = false;
    }
}
