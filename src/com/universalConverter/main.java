package com.universalConverter;

import com.universalConverter.model.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import com.universalConverter.view.*;

public class main {
	private static MenuFrame menu =new MenuFrame();
	private static UnitList unitList=new UnitList();
	
	private static ConverterFrame currencyFrame = new ConverterFrame("Currency Converter",CurrencyUnit.class);
	private static ConverterFrame temperatureFrame = new ConverterFrame("Temperature Conveter",TemperatureUnit.class);
	private static ConverterFrame weightFrame= new ConverterFrame("Weight Converter",WeightUnit.class);
	private static ConverterFrame timeFrame= new ConverterFrame("Time Conveter",TimeUnit.class);
	private static ConverterFrame volumeFrame= new ConverterFrame("Volume Converter",VolumeUnit.class);
	private static ConverterFrame lenghtFrame= new ConverterFrame("Lenght Converter",LenghtUnit.class);
	
	public static void main(String[] args) {  
		
		setMenu(new MenuFrame());

		getCurrencyFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/currencyIcon.png")).getImage());
		getTemperatureFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/temperatureIcon.png")).getImage());
		getWeightFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/weightIcon.png")).getImage());
		getTimeFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/timeIcon.png")).getImage());
		getVolumeFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/volumeIcon.png")).getImage());
		getLenghtFrame().setIconImage(new ImageIcon(main.class.getResource("/com/universalConverter/media/img/lenghtIcon.png")).getImage());
		
		main.setVisible(menu, true);
		 
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

	public static ConverterFrame getCurrencyFrame() {
		return currencyFrame;
	}

	public static void setCurrencyFrame(ConverterFrame currencyFrame) {
		main.currencyFrame = currencyFrame;
	}

	public static ConverterFrame getTemperatureFrame() {
		return temperatureFrame;
	}

	public static void setTemperatureFrame(ConverterFrame temperatureFrame) {
		main.temperatureFrame = temperatureFrame;
	}

	public static ConverterFrame getWeightFrame() {
		return weightFrame;
	}

	public static void setWeightFrame(ConverterFrame weightFrame) {
		main.weightFrame = weightFrame;
	}

	public static ConverterFrame getTimeFrame() {
		return timeFrame;
	}

	public static void setTimeFrame(ConverterFrame timeFrame) {
		main.timeFrame = timeFrame;
	}

	public static ConverterFrame getVolumeFrame() {
		return volumeFrame;
	}

	public static void setVolumeFrame(ConverterFrame volumeFrame) {
		main.volumeFrame = volumeFrame;
	}

	public static ConverterFrame getLenghtFrame() {
		return lenghtFrame;
	}

	public static void setLenghtFrame(ConverterFrame lenghtFrame) {
		main.lenghtFrame = lenghtFrame;
	}

	public static UnitList getUnitList() {
		return unitList;
	}

	public static void setMenu(MenuFrame menu) {
		main.menu = menu;
	}
	
	

	
	

}
