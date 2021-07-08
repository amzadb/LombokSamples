package com.lombok.practice;

import java.util.ArrayList;
import java.util.Collection;

public class CarCollection {
	public static Collection<Car> getCars() {
		Collection<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Ford", "EcoSport", Color.White));
		cars.add(new Car("Hyundai", "Alcazar", Color.Blue));
		cars.add(new Car("Maruti Suzuki", "Baleno", Color.Grey));
		cars.add(new Car("Toyota", "Innova", Color.Black));
		cars.add(new Car("Maruti Suzuki", "Swift", Color.Red));
		cars.add(new Car("Honda", "Amaze", Color.White));
		cars.add(new Car("Ford", "Endeavour", Color.Silver));
		cars.add(new Car("Hyundai", "Creta", Color.Green));
		cars.add(new Car("Toyota", "Fortuner", Color.White));
		cars.add(new Car("Ford", "Freestyle", Color.Black));
		cars.add(new Car("Mahindra", "Scorpio", Color.Green));
		cars.add(new Car("Hyundai", "Tucson", Color.Silver));
		cars.add(new Car("Toyota", "Innova Crysta", Color.Silver));
		cars.add(new Car("Kia", "Seltos", Color.Black));
		cars.add(new Car("MG", "Hector", Color.White));
		cars.add(new Car("Toyota", "Camry", Color.White));
		cars.add(new Car("MG", "Hector Plus", Color.Blue));
		cars.add(new Car("Tata", "Harrier", Color.Green));
		cars.add(new Car("Toyota", "Glanza", Color.Green));
		cars.add(new Car("Nissan", "Sunny", Color.White));
		cars.add(new Car("Hyundai", "Venue", Color.Red));
		cars.add(new Car("Tata", "Nexon", Color.Blue));
		cars.add(new Car("Mitsubhishi", "Lancer", Color.Silver));
		cars.add(new Car("Maruti Suzuki", "Celerio", Color.Blue));
		cars.add(new Car("Hyundai", "i20", Color.Silver));
		cars.add(new Car("MG", "Gloster", Color.Red));
		cars.add(new Car("Mahindra", "Thar", Color.White));
		cars.add(new Car("Maruti Suzuki", "Alto", Color.Red));
		cars.add(new Car("Honda", "City", Color.Grey));
		cars.add(new Car("Nissan", "Kicks", Color.Black));
		cars.add(new Car("Mahindra", "XUV-500", Color.White));
		cars.add(new Car("Hyundai", "i10", Color.Black));
		cars.add(new Car("Renault", "Duster", Color.Green));
		cars.add(new Car("Honda", "CR-V", Color.Black));
		cars.add(new Car("Audi", "A6", Color.Black));
		cars.add(new Car("Hyundai", "Santro", Color.Grey));
		cars.add(new Car("Honda", "WR-V", Color.Red));
		cars.add(new Car("Mahindra", "Alturas", Color.Blue));
		cars.add(new Car("Kia", "Carnival", Color.White));
		cars.add(new Car("Renault", "Kwid", Color.Red));
		cars.add(new Car("Maruti Suzuki", "Ertiga", Color.Grey));
		cars.add(new Car("Audi", "Q8", Color.White));
		cars.add(new Car("Jeep", "Compass", Color.Black));
		cars.add(new Car("Hyundai", "Verna", Color.Blue));
		cars.add(new Car("Mahindra", "KUV-100", Color.Grey));
		cars.add(new Car("Maruti Suzuki", "Swift DZire", Color.White));
		cars.add(new Car("Skoda", "Octavia", Color.Red));
		cars.add(new Car("Honda", "Jazz", Color.Yellow));
		cars.add(new Car("Renault", "Triber", Color.Blue));
		cars.add(new Car("Jeep", "Wrangler", Color.Yellow));
		cars.add(new Car("Hyundai", "Elantra", Color.Grey));
		cars.add(new Car("Maruti Suzuki", "Vitara Brezza", Color.White));
		cars.add(new Car("Skoda", "Rapid", Color.Blue));
		cars.add(new Car("Tata", "Indica", Color.Silver));
		cars.add(new Car("Maruti Suzuki", "Vitara Brezza", Color.White)); // duplicate
		cars.add(new Car("Skoda", "Superb", Color.White));
		cars.add(new Car("Mahindra", "TUV-300", Color.Black));
		cars.add(new Car("Ford", "EcoSport", Color.White)); // duplicate
		cars.add(new Car("Tata", "Nano", Color.Yellow));
		cars.add(new Car("Mahindra", "Bolero", Color.Silver));
		
		return cars;
	}
}
