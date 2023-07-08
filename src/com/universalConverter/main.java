package com.universalConverter;

import javax.swing.JFrame;

import com.universalConverter.view.CurrencyConverterFrame;
import com.universalConverter.view.MenuFrame;
import com.universalConverter.view.TemperatureConverterFrame;

public class main {
	private static MenuFrame menu =new MenuFrame();
	private static CurrencyConverterFrame currencyFrame = new CurrencyConverterFrame();
	private static TemperatureConverterFrame temperatureFrame = new TemperatureConverterFrame();

	public static void main(String[] args) {
		menu.setVisible(true);
	}
	
	public static void setVisible(JFrame frame,boolean e){
		frame.setVisible(e);
	}

	public static MenuFrame getMenu() {
		return menu;
	}

	public static CurrencyConverterFrame getCurrencyFrame() {
		return currencyFrame;
	}


	public static TemperatureConverterFrame getTemperatureFrame() {
		return temperatureFrame;
	}


	
	

}
