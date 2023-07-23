package com.universalConverter.view;

import com.universalConverter.main;
import com.universalConverter.model.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;



public class MenuFrame extends JFrame {
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame frame = new MenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.S
	 */
	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 395);
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		 ConverterButton currencyButton = new ConverterButton("Currency","currencyIcon.png");
		 currencyButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getCurrencyFrame(), true);
				}
		 });
		 currencyButton.setLocation(20, 20);
		 contentPane.add(currencyButton);
		 
		 
		 ConverterButton temperatureButton = new ConverterButton("Temperature","temperatureIcon.png");
		 temperatureButton.setLocation(190, 20);
		 temperatureButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getTemperatureFrame(), true);
				}
		 });
		 contentPane.add(temperatureButton);
		 
		 
		 ConverterButton weightButton = new ConverterButton("Weight","weightIcon.png");
		 weightButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getWeightFrame(), true);
				}
		 });
		 weightButton.setLocation(360, 20);
		 contentPane.add(weightButton);
		 
		 
		 ConverterButton timeButton = new ConverterButton("Time","timeIcon.png");
		 timeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getTimeFrame(), true);
				}
		 });
		 timeButton.setLocation(20, 190);
		 contentPane.add(timeButton);
		 
		 
		 ConverterButton volumeButton = new ConverterButton("Volume","volumeIcon.png");
		 volumeButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getVolumeFrame(), true);
				}
		 });
		 volumeButton.setLocation(190, 190);
		 contentPane.add(volumeButton);
		 
		 
		 ConverterButton lenghtButton = new ConverterButton("Lenght","lenghtIcon.png");
		 lenghtButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					main.setVisible(main.getLenghtFrame(), true);
				}
		 });
		 lenghtButton.setLocation(360, 190);
		 contentPane.add(lenghtButton);
		 
		 
		 
	}
	
	
	
	
}
