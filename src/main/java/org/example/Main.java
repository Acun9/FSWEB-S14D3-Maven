package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car car = new Car(8, "Base car");

        System.out.println(car.startEngine());

        System.out.println(car.accelerate());

        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        System.out.println(mitsubishi.startEngine());

        System.out.println(mitsubishi.accelerate());

        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());

        System.out.println(ford.accelerate());

        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        /***********************************************************************************/
        System.out.println("**********************************************");

        ElectricCar electricCar = new ElectricCar("My Electric Car","description", 50.2,15);
        GasPoweredCar gasPoweredCar = new GasPoweredCar("My Gas Car", "desc 2", 123,6);
        HybridCar hybridCar = new HybridCar("My Hybrid", "desc 3", 1234, 5,4);
        System.out.println(electricCar.getBatterySize());
        System.out.println(gasPoweredCar.getDescription());
        hybridCar.startEngine();
        electricCar.drive();
        CarSkeleton gasCar = new GasPoweredCar("gas2","desc gas2", 999,9);
        gasCar.startEngine();
        System.out.println(gasCar.getDescription());



    }
}