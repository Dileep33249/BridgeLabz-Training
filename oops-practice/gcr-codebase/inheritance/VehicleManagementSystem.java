package com.inhertence;

// Interface (multiple behavior)
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayVehicleInfo() {
        System.out.println(
            "Model: " + model +
            ", Max Speed: " + maxSpeed + " km/h"
        );
    }
}

// Electric Vehicle
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Electric vehicle is charging");
    }
}

// Petrol Vehicle (Hybrid Inheritance)
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled");
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {

        Vehicle v1 = new ElectricVehicle("Tesla Model 3", 225);
        Vehicle v2 = new PetrolVehicle("Honda City", 180);

        v1.displayVehicleInfo();
        ((ElectricVehicle) v1).charge();

        v2.displayVehicleInfo();
        ((PetrolVehicle) v2).refuel();
    }
}
