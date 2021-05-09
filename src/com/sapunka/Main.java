package com.sapunka;

public class Main {
// MULTILEVEL INHERITANCE
    public static void main(String[] args) {
	class Vehicle{
	    void travel(){
            System.out.println("\nPLEASE SHOW YOUR CHOICE OF TRAVEL");
        }
    }
    class Jeep extends Vehicle{
	    void drive(){
            System.out.println("\nQUESTION: Can yuo drive a jeep?");
            System.out.println("ANSWER: Yes I can drive a jeep.");
        }
        }
    class Bike extends Jeep{
	    void ride(){
            System.out.println("\nQUESTION: Can yuo ride a bike?");
            System.out.println("ANSWER: Yes I can ride a bike.\n");
        }
        }
        Vehicle vehicle = new Vehicle();
	    vehicle.travel();

	    Jeep jeep = new Jeep();
	    jeep.drive();

	    Bike bike = new Bike();
	    bike.ride();
    }
}
