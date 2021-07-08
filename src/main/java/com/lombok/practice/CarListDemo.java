package com.lombok.practice;

import static java.util.stream.Collectors.toList;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CarListDemo {

	public static void main(String[] args) {
		Collection<Car> cars = CarCollection.getCars();
		
		System.out.println("Total Cars: " + cars.size());
		System.out.println();

		Predicate<Car> modelPredicate = car -> car.getBrand().equals("Ford");
		long fordCount = cars.stream().filter(modelPredicate).count();
		System.out.println("Total count of Ford cars: " + fordCount);
		
		List<Car> fordCarsList = cars.stream().filter(modelPredicate).collect(toList());
		System.out.println("List of Ford cars: " + fordCarsList.size());
		fordCarsList.forEach(car -> System.out.println(car));
		System.out.println();

		Predicate<Car> colorPredicate = car -> car.getColor().equals(Color.White);
		long whiteCount = cars.stream().filter(colorPredicate).count();
		System.out.println("Total count of White cars: " + whiteCount);
		
		List<Car> whiteCarsList = cars.stream().filter(colorPredicate).collect(toList());
		System.out.println("List of White cars: " + whiteCarsList.size());
		whiteCarsList.forEach(car -> System.out.println(car));
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
	}

}
