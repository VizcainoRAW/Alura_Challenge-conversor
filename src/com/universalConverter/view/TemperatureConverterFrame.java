package com.universalConverter.view;

import com.universalConverter.model.TemperatureUnit;
import com.universalConverter.model.ConverterFrame;

public class TemperatureConverterFrame extends ConverterFrame {
	
	public TemperatureConverterFrame() {
		this.fillConverterComboBox(TemperatureUnit.class);
	}
	
}
