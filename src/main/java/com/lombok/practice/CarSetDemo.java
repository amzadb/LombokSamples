package com.lombok.practice;

import static java.util.stream.Collectors.toSet;

import java.util.Collection;
import java.util.Set;
import java.util.function.Predicate;

public class CarSetDemo {

	public static void main(String[] args) {
		Collection<Car> cars = CarCollection.getCars();
		
		System.out.println("Total Cars: " + cars.size());
		System.out.println();

		Predicate<Car> modelPredicate = car -> car.getBrand().equals("Ford");
		long fordCount = cars.stream().filter(modelPredicate).count();
		System.out.println("Total count of Ford cars: " + fordCount);
		
		Set<Car> fordCarsSet = cars.stream().filter(modelPredicate).collect(toSet());
		System.out.println("Set of Ford cars: " + fordCarsSet.size());
		fordCarsSet.forEach(car -> System.out.println(car));
		System.out.println();

		Predicate<Car> colorPredicate = car -> car.getColor().equals(Color.White);
		long whiteCount = cars.stream().filter(colorPredicate).count();
		System.out.println("Total count of White cars: " + whiteCount);
		Set<Car> whiteCarsSet = cars.stream().filter(colorPredicate).collect(toSet());
		System.out.println("Set of White cars: " + whiteCarsSet.size());
		whiteCarsSet.forEach(car -> System.out.println(car));
		System.out.println();
	}

}
