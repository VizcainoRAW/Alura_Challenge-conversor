package com.universalConverter.model;

public abstract class Unit {
	private String notation;
	private Double converterRatio;
	
	
	public Unit(String notation, double converterRatio) {
		this.notation=notation;
		this.converterRatio=converterRatio;
	}
	
	
	public double convertTo(Unit unit) {
		return unit.getConverterRario()/this.getConverterRario();
	}
	
	public double convertTo(Unit unit, double value) {
		return  convertTo(unit)*value;
	}
	
	public String getNotation() {
		return this.notation;
	}
	
	public double getConverterRario() {
		return this.converterRatio;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Unit other = (Unit) obj;
	    return this.getNotation().equals(other.getNotation());
	}
		
	@Override
	public String toString() {
		return this.notation;
	}

}
