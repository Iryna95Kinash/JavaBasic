package main.java.oop;


public class House {
    String address;
    String color;
    String roofColor;
    int roomCount;
    int constructionYear;
    boolean serenaOn;

    public House() {
    }

    public House(String color) {
        this.color = color;
    }

    public House(String address, int constructionYear, String color) {
        this.address = address;
        this.constructionYear = constructionYear;
        this.color = color;
    }

    public void turnOnSerena() {
        serenaOn = true;
        System.out.println("Your house in safe");
    }

    public void serenaOn() {
        if (serenaOn) {
            System.out.println("Serena ON");
        } else {
            System.out.println("Serena OFF, please turn it ON");
        }
    }

    public void locatedIn(String address) {
        System.out.println("The house is located in " + address);
    }

    public void builtIn(String roofColor, int constructionYear) {
        System.out.println("The house with " + roofColor + " was built in " + constructionYear + " year");
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