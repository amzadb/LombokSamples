package com.lombok.practice;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarMapDemo {

	public static void main(String[] args) {
		Collection<Car> cars = CarCollection.getCars();
		
		System.out.println("Total Cars: " + cars.size());
		System.out.println();

		Map<Color, List<Car>> carsMapByColor = cars.stream().collect(Collectors.groupingBy(Car::getColor));
		System.out.println("Cars Map by Color: " + carsMapByColor.size());
		carsMapByColor.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
		System.out.println();
		carsMapByColor.forEach((key, list) -> {
			System.out.println("List of " + key + " cars: " + list.size());
			list.forEach(car -> System.out.println(car));
			System.out.println();
		});
		
		
		Map<String, List<Car>> carsMapByBrand = cars.stream().collect(Collectors.groupingBy(Car::getBrand));
		System.out.println("Cars Map by Brand: " + carsMapByBrand.size());
		carsMapByBrand.forEach((key, list) -> {
			System.out.println("List of " + key + " cars: " + list.size());
			list.forEach(car -> System.out.println(car));
			System.out.println();
		});
	}

}
