package com.universalConverter;

import com.universalConverter.model.*;
import java.util.ArrayList;

public class UnitList {
	
	public static ArrayList<ArrayList<? extends Unit>> unitList=new ArrayList<ArrayList<? extends Unit>>();
	
	public UnitList() {
		
		ArrayList<CurrencyUnit> currencyList = new ArrayList<CurrencyUnit>();
		currencyList.add(new CurrencyUnit("USD", 1));
		currencyList.add(new CurrencyUnit("COl", 4200));
		currencyList.add(new CurrencyUnit("YEN", 143));
		currencyList.add(new CurrencyUnit("EUR", 0.9));
		currencyList.add(new CurrencyUnit("CNY", 7.22));
		currencyList.add(new CurrencyUnit("WOM", 1300));
		currencyList.add(new CurrencyUnit("GBP", 0.80));
		unitList.add(currencyList);
		
		ArrayList<TemperatureUnit> temperatureList = new ArrayList<TemperatureUnit>();
		temperatureList.add(new TemperatureUnit("Celsius", 1));
		temperatureList.add(new TemperatureUnit("Kelvin", 1));
		temperatureList.add(new TemperatureUnit("Fahrenheit", 1.8));
		unitList.add(temperatureList);
		
		ArrayList<WeightUnit> weightList = new ArrayList<WeightUnit>();
		weightList.add(new WeightUnit("Kilogram", 1));
		weightList.add(new WeightUnit("Pound", 2.20462));
		weightList.add(new WeightUnit("Ounce", 35.274));
		weightList.add(new WeightUnit("Stone", 0.1575));
		weightList.add(new WeightUnit("UK Ton", 0.000984));
		weightList.add(new WeightUnit("US Ton", 0.0011));
		weightList.add(new WeightUnit("Tonne", 0.001));
		weightList.add(new WeightUnit("Gram", 1000));
		weightList.add(new WeightUnit("Milligram", 1000000));
		unitList.add(weightList);
		
		ArrayList<TimeUnit> timeList = new ArrayList<TimeUnit>();
		timeList.add(new TimeUnit("Second", 1));
		timeList.add(new TimeUnit("Minute", (1.0/60) ));
		timeList.add(new TimeUnit("Hour", (1.0/3600) ));
		timeList.add(new TimeUnit("Day", (1.0/86400) ));
		timeList.add(new TimeUnit("Week", (1.0/604800) ));
		timeList.add(new TimeUnit("Month", (1.0/2628000000L) ));
		timeList.add(new TimeUnit("Year", (1.0/31540000000L) ));
		timeList.add(new TimeUnit("Millisecond", 1000 ));
		timeList.add(new TimeUnit("Millisecond", 1000000 ));
		unitList.add(timeList);
		
		ArrayList<VolumeUnit> volumeList = new ArrayList<VolumeUnit>();
		volumeList.add(new VolumeUnit("Liter", 1));
		volumeList.add(new VolumeUnit("Milliliter", 1000));
		volumeList.add(new VolumeUnit("Cubic Meter", (1.0/1000) ));
		volumeList.add(new VolumeUnit("Cubic Centimeter", 1000 ));
		volumeList.add(new VolumeUnit("Cubic Foot", (1.0/28.317) ));
		volumeList.add(new VolumeUnit("Cubic Inch", 61.024 ));
		volumeList.add(new VolumeUnit("Fluit Ounce", 33.814 ));
		volumeList.add(new VolumeUnit("UK Gallon", (1.0/4.546) ));
		volumeList.add(new VolumeUnit("UK Quart", 1.136 ));
		volumeList.add(new VolumeUnit("UK Pint", 1.75975 ));
		volumeList.add(new VolumeUnit("UK Cup", 3.52 ));
		volumeList.add(new VolumeUnit("US Gallon", (1.0/3.785) ));
		volumeList.add(new VolumeUnit("US Quart", 1.057 ));
		volumeList.add(new VolumeUnit("US Pint", 2.113 ));
		volumeList.add(new VolumeUnit("US Cup", 4.16667 ));
		unitList.add(volumeList);
		
		ArrayList<LenghtUnit> lenghtList = new ArrayList<LenghtUnit>();
		lenghtList.add(new LenghtUnit("Meter", 1));
		lenghtList.add(new LenghtUnit("Centimeter", 100));
		lenghtList.add(new LenghtUnit("Millimeter", 1000));
		lenghtList.add(new LenghtUnit("Kilometer", (1.0/1000) ));
		lenghtList.add(new LenghtUnit("Mile", (1.0/1609) ));
		lenghtList.add(new LenghtUnit("Yard", 1.094 ));
		lenghtList.add(new LenghtUnit("Foot", 3.281 ));
		lenghtList.add(new LenghtUnit("Inch", 39.37 ));
		lenghtList.add(new LenghtUnit("Natural Mile", (1.0/1852) ));
		unitList.add(lenghtList);
		
	}
	
	public static ArrayList<? extends Unit> getListByType(Class<? extends Unit> unitClass){
		for(ArrayList<? extends Unit> list : unitList) {
			
			if(unitClass.equals(list.get(0).getClass())){		
				return list;
			}
		}
		throw new IllegalArgumentException("Dont found '" + unitClass + "' list. make sure it exists and has been added at UniList.uniList.");
	}
	
	public static ArrayList<ArrayList<? extends Unit>> getUnitList() {
		return unitList;
	}

	
	
	
}
