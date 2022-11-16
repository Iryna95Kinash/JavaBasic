package main.java.oop.car;

import main.java.oop.Colorable;
import main.java.oop.Printer;

import java.time.LocalDate;

public class Car implements Colorable {

    private LocalDate productionDate;
    private String model;
    private String country;
    private String color;
    private int maxSpeed;
    private int sitsCount;
    private boolean engineOn;
    private static int carCounter = 0;

    public Car() {
        carCounter++;
    }

    public Car(String model, String country) {
        this.model = model;
        this.country = country;
        carCounter++;
    }

    public Car(int maxSpeed, int sitsCount, String country, String color) {
        this.maxSpeed = maxSpeed;
        this.sitsCount = sitsCount;
        this.country = country;
        this.color = color;
        carCounter++;
    }

    public void cleanWindow() {
        System.out.println("Car window cleaning by wipers...");
    }

    public void showColor() {
        System.out.println("Color of car is " + this.color);
    }

    public void countCars() {
        Printer.printParam("Amount of cars is " + carCounter);
    }

    public void startEngine() {
        engineOn = true;
        Printer.printParam("Engine started...");
    }


    public void drive() {
        if (engineOn) {
            Printer.printParam("Car is driving...");
        } else {
            Printer.printParam("Start engine first");
        }
    }

    public void drivingWithMaxSpeed() {
        Printer.printParam("You can drive with max speed");
    }

    public void stopDriving() {
        Printer.printParam("Stop your car...");
    }

    public void stopEngine() {
        engineOn = false;
        Printer.printParam("Engine is stoped");
    }

    public void includingPassengers(int sitsCount) {
        Printer.printParam(sitsCount + " passengers can sit in the car");
    }

    public void madeCauntry(String country, String model) {
        Printer.printParam(model + " made in " + country);
    }


    private LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                ", color='" + color + '\'' +
                '}';
    }
}