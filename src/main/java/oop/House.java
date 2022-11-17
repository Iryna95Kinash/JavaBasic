package main.java.oop;


public class House implements Colorable {

    private String address;
    private String color;
    private String roofColor;
    private int roomCount;
    private int constructionYear;
    private boolean serenaOn;
    private static int houseCounter = 0;

    public House() {
        houseCounter++;
    }

    public House(String color) {
        this.color = color;
        houseCounter++;
    }

    public House(String address, int constructionYear, String color) {
        this.address = address;
        this.constructionYear = constructionYear;
        this.color = color;
        houseCounter++;
    }

    public void showColor() {
        System.out.println("Color of house is " + this.color);
    }

    public void countHouses() {
        Printer.printParam("Amount of houses is " + houseCounter);
    }

    public void turnOnSerena() {
        serenaOn = true;
        Printer.printParam("Your house in safe");
    }

    public void serenaOn() {
        if (serenaOn) {
            Printer.printParam("Serena ON");
        } else {
            Printer.printParam("Serena OFF, please turn it ON");
        }
    }

    public void locatedIn(String address) {
        Printer.printParam("The house is located in " + address);
    }

    public void builtIn(String roofColor, int constructionYear) {
        Printer.printParam("The house with " + roofColor + " was built in " + constructionYear + " year");
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRoofColor() {
        return roofColor;
    }

    public void setRoofColor(String roofColor) {
        this.roofColor = roofColor;
    }

    public boolean isSerenaOn() {
        return serenaOn;
    }

    public void setSerenaOn(boolean serenaOn) {
        this.serenaOn = serenaOn;
    }

    public int getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(int constructionYear) {
        this.constructionYear = constructionYear;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomCount=" + roomCount +
                ", address='" + address + '\'' +
                ", color='" + color + '\'' +
                ", roofColor='" + roofColor + '\'' +
                ", serenaOn=" + serenaOn +
                ", constructionYear=" + constructionYear +
                '}';
    }
}