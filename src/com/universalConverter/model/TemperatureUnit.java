package com.universalConverter.model;

public class TemperatureUnit extends Unit {
    public TemperatureUnit(String symbol, double conversionFactor) {
        super(symbol, conversionFactor);
    }
    
    public double convertTo(TemperatureUnit unit) {
    	return super.convertTo(unit);
	}
	
	public double convertTo(TemperatureUnit unit, double value) {
		if (this == unit) {
			return value;
		} else if (unit.getNotation().equals("Kelvin") && this.getNotation().equals("Fahrenheit")) {
			return (this.convertTo(unit) * (value - 32)) + 273.15;	
		} else if (unit.getNotation().equals("Kelvin")) {
			return (this.convertTo(unit) * value) + 273.15;
		} else if (unit.getNotation().equals("Fahrenheit") && this.getNotation().equals("Kelvin")) {
			return (this.convertTo(unit) * (value - 273.15)) + 32;
		} else if (unit.getNotation().equals("Fahrenheit")) {
			return (this.convertTo(unit) * value) + 32;
		} else {
			throw new IllegalArgumentException("Invalid temperature unit conversion. Only 'Celsius', 'Kelvin', and 'Fahrenheit' are supported.");
		}
	}
}

