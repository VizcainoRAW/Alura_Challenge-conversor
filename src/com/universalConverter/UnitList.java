package com.universalConverter;

import com.universalConverter.model.*;
import java.util.ArrayList;
import com.universalConverter.model.*;

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
