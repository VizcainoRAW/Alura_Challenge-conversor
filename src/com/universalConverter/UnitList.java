package com.universalConverter;

import java.util.ArrayList;
import com.universalConverter.model.*;

public class UnitList {
	
	public static ArrayList<CurrencyUnit> currencyList=new ArrayList<CurrencyUnit>();
	public static ArrayList<TemperatureUnit> temperatureList=new ArrayList<TemperatureUnit>();
	
	public UnitList() {
		
		currencyList.add(new CurrencyUnit("USD", 1));
		currencyList.add(new CurrencyUnit("COl", 4200));
		currencyList.add(new CurrencyUnit("YEN", 143));
		currencyList.add(new CurrencyUnit("EUR", 0.9));
		currencyList.add(new CurrencyUnit("CNY", 7.22));
		currencyList.add(new CurrencyUnit("WOM", 1300));
		currencyList.add(new CurrencyUnit("GBP", 0.80));
		
		temperatureList.add(new TemperatureUnit("Celciuns", 1));
		temperatureList.add(new TemperatureUnit("Kelvin", 1));
		temperatureList.add(new TemperatureUnit("Fahrenheit", 1.8));
		
		
		
	}
	
	
}
