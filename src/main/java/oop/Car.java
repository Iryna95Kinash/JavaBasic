package main.java.oop;

import java.time.LocalDate;

public class Car {
    LocalDate productionDate;
    String model;
    String country;
    int maxSpeed;
    int sitsCount;
    boolean engineOn;

    public Car() {
    }

    public Car(String model, String country) {
        this.model = model;
        this.country = country;
    }

    public Car(int maxSpeed, int sitsCount, String country) {
        this.maxSpeed = maxSpeed;
        this.sitsCount = sitsCount;
        this.country = country;
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

    public void includingPassengers(int sitsCount) {
        System.out.println(sitsCount + " passengers can sit in the car");
    }

    public void madeCauntry(String country, String model) {
        System.out.println(model + " made in " + country);
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

    public int getSitsCount() {
        return sitsCount;
    }

    public void setSitsCount(int sitsCount) {
        this.sitsCount = sitsCount;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "productionDate=" + productionDate +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", engineOn=" + engineOn +
                ", sitsCount=" + sitsCount +
                ", country='" + country + '\'' +
                '}';
    }
}