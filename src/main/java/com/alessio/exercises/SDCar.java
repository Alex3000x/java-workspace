package com.alessio.exercises;

public class SDCar extends Car {
    boolean isSelfDriving;

    public SDCar(boolean isOn, String licensePlate, boolean isSelfDriving) {
        super(isOn, licensePlate);
        this.isSelfDriving = isSelfDriving;
    }

    public void turnSDOn(){
        isSelfDriving = true;
    }

    public void turnSDOff() {
        isSelfDriving = false;
    }

    @Override
    public String toString() {
        return "SDCar{" +
                "isSelfDriving=" + isSelfDriving +
                ", isOn=" + isOn +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    @Override
    public void turnOff() {
        turnSDOff();
        super.turnOff();
    }

    @Override
    public void turnOn() {
        turnSDOff();
        super.turnOn();
    }
}
