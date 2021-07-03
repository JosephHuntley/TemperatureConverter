package com.joe.tempertureConverter;

public class Convert {
	
	public static double toFahrenheit(double c) {
		double value;
		value = c * 1.8 + 32;
		return value;
	}
	
	public static double toCelsius(double f) {
		double value;
		value = (f - 32) / 1.8;
		return value;
	}

}
