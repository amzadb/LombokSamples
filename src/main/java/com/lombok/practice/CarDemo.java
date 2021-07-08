package com.lombok.practice;

public class CarDemo {

	public static void main(String[] args) {
		Car c1 = new Car("Ford", "EcoSport", Color.White);
		System.out.println("Car c1 details:");
		System.out.println(" brand: " + c1.getBrand());
		System.out.println(" model: " + c1.getModel());
		System.out.println(" color: " + c1.getColor());
		System.out.println();
		
		Car c2 = new Car("Hyundai", "Alcazar", Color.Blue);
		System.out.println("Car c2 details:");
		System.out.println(" brand: " + c2.getBrand());
		System.out.println(" model: " + c2.getModel());
		System.out.println(" color: " + c2.getColor());
		System.out.println();
		
		Car c3 = new Car("Maruti Suzuki", "Baleno", Color.Grey);
		System.out.println("Car c3 details:");
		System.out.println(" brand: " + c3.getBrand());
		System.out.println(" model: " + c3.getModel());
		System.out.println(" color: " + c3.getColor());
		System.out.println();
	}

}
