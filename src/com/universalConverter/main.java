package com.universalConverter;



import javax.swing.JFrame;

import com.universalConverter.view.*;

public class main {
	private static MenuFrame menu =new MenuFrame();
	private static UnitList unitList=new UnitList();
	
	private static CurrencyConverterFrame currencyFrame = new CurrencyConverterFrame();
	private static TemperatureConverterFrame temperatureFrame = new TemperatureConverterFrame();
	private static WeightConverterFrame weightFrame= new WeightConverterFrame();
	private static TimeConverterFrame timeFrame= new TimeConverterFrame();
	private static VolumeConverterFrame volumeFrame= new VolumeConverterFrame();
	private static LenghtConverterFrame lenghtFrame= new LenghtConverterFrame();
	
	public static void main(String[] args) {
		main.setVisible(menu, true);
	}
	
	public static LenghtConverterFrame getLenghtFrame() {
		return lenghtFrame;
	}


	public static void setLenghtFrame(LenghtConverterFrame lenghtFrame) {
		main.lenghtFrame = lenghtFrame;
	}
	
	public static VolumeConverterFrame getVolumeFrame() {
		return volumeFrame;
	}


	public static void setVolumeFrame(VolumeConverterFrame volumeFrame) {
		main.volumeFrame = volumeFrame;
	}


	public static TimeConverterFrame getTimeFrame() {
		return timeFrame;
	}


	public static void setTimeFrame(TimeConverterFrame timeFrame) {
		main.timeFrame = timeFrame;
	}


	public static WeightConverterFrame getWeightFrame() {
		return weightFrame;
	}


	public static void setWeightFrame(WeightConverterFrame weightFrame) {
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
