package com.lombok.practice;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
	private String brand;
	private String model;
	private Color color;
}

enum Color {
	White, Black, Red, Green, Blue, Grey, Silver, Yellow;
}