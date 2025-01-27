package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric car started engine");
    }

    @Override
    public void drive() {
        System.out.println("Electric car is driving");
    }

    public int getBatterySize() {
        return batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }
}
