package main.java.oop;


public class House {
    int roomCount;
    String address;
    String color;
    String roofColor;
    boolean serenaOff;

    public void serena() {
        serenaOff = true;
        System.out.println("Your house in safe");
    }

    public void serenaOn() {
        if (serenaOff == true) {
            System.out.println("Serena ON");
        } else
            System.out.println("Serena OFF, please turn it ON");
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

    public boolean isSerenaOff() {
        return serenaOff;
    }

    public void setSerenaOff(boolean serenaOff) {
        this.serenaOff = serenaOff;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomCount=" + roomCount +
                ", address='" + address + '\'' +
                ", color='" + color + '\'' +
                ", roofColor='" + roofColor + '\'' +
                ", serenaOff=" + serenaOff +
                '}';
    }
}
