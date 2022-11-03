package main.java.oop;

import java.time.LocalDate;

public class Car {
    private LocalDate productionDate;
    String model;
    int maxSpeed;
    boolean engineOn;

    public Car() {
    }

    public void startEngine() {
        engineOn = true;
        System.out.println("Engine started...");
    }

    public void drive() {
        if (engineOn) {
            System.out.println("Car is driving...");
        } else {
            System.out.println("Start engine first");
        }
    }

    public void drivingWithMaxSpeed() {
        System.out.println("You can drive with max speed");
    }

    public void stopDriving() {
        System.out.println("Stop your car...");
    }

    public void stopEngine() {
        engineOn = false;
        System.out.println("Engine is stoped");
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isEngineOn() {
        return engineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionDate=" + productionDate +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineOn=" + engineOn +
                '}';
    }
}