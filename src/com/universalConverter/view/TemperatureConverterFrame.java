package com.universalConverter.view;

import com.universalConverter.model.ConverterFrame;
import javax.swing.JFrame;


public class TemperatureConverterFrame extends ConverterFrame {
	public TemperatureConverterFrame() {
	
		getSecondComboBox().setLocation(240, 180);
		getSecondTextField().setLocation(25, 180);
		getFirtsComboBox().setLocation(240, 80);
		getFirstTextField().setLocation(25, 80);
	}
}
