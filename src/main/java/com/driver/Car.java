package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    public int getGears(){
        return gears;
    }
    private boolean isManual(){
        return isManual;
    }
    private int getCurrentGear(){
        return currentGear;
    }
    private int getSeats(){
        return seats;
    }
    private boolean isManual;
    private int  currentGear;

    public int getWheels(){
        return wheels;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getDoors(){
        return doors;
    }

    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;

        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
