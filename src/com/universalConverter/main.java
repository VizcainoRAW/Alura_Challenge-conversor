package com.universalConverter;



import javax.swing.JFrame;

import com.universalConverter.view.MenuFrame;
import com.universalConverter.view.CurrencyConverterFrame;
import com.universalConverter.view.TemperatureConverterFrame;
import com.universalConverter.view.WeightConveterFrame;



public class main {
	private static MenuFrame menu =new MenuFrame();
	private static UnitList unitList=new UnitList();
	
	private static CurrencyConverterFrame currencyFrame = new CurrencyConverterFrame();
	private static TemperatureConverterFrame temperatureFrame = new TemperatureConverterFrame();
	private static WeightConveterFrame weightFrame= new WeightConveterFrame();
	
	
	public static void main(String[] args) {
		menu.setVisible(true);
	}
	
	
	public static WeightConveterFrame getWeightFrame() {
		return weightFrame;
	}


	public static void setWeightFrame(WeightConveterFrame weightFrame) {
		main.weightFrame = weightFrame;
	}


	public static void setVisible(JFrame frame,boolean e){
		frame.setVisible(e);
	}

	public static MenuFrame getMenu() {
		return menu;
	}
	
	public static void setUnitList(UnitList unitList) {
		main.unitList = unitList;
	}

	public static CurrencyConverterFrame getCurrencyFrame() {
		return currencyFrame;
	}


	public static TemperatureConverterFrame getTemperatureFrame() {
		return temperatureFrame;
	}


	
	

}
