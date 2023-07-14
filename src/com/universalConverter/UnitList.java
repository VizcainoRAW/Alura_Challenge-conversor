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
