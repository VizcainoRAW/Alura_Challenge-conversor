package com.universalConverter.model;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;


public class ConverterButton extends JButton{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConverterButton() {
		initialize();
		
	}

	public ConverterButton(String text) {
		super(text);
		initialize();
		
	}
	
	public ConverterButton(String text, String url) {
		this(text);
		setResizedIcon(url);
		
	}
	
	public ConverterButton(String text, String url, ConverterFrame frame) {
		this(text,url);
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				frame.setVisible(true);
			}
		});
		
	}
	
    private void initialize() {
        setFocusable(false);
        setHorizontalTextPosition(JButton.CENTER);
        setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
        setVerticalTextPosition(JButton.BOTTOM);
        setSize(150, 150);
        
    }
	
	private ImageIcon getImageIcon(String name) {
		return new ImageIcon(System.getProperty("user.dir") + "\\src\\com\\universalConverter\\media\\img\\" +name);
	}
	
	public void setResizedIcon(String iconName) {
		Image originalImageIcon=getImageIcon(iconName).getImage();
		int buttonWidth = getWidth();
		int buttonHeight = getHeight();

		Image resizedImage = originalImageIcon.getScaledInstance(buttonWidth/2, buttonHeight/2, Image.SCALE_SMOOTH);
		setIcon(new ImageIcon(resizedImage));
	}
	
}

