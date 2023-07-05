package com.universalConverter.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

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
		setBounds(100, 100, 543, 304);
		contentPane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Button TemperatureButton = new Button("Temperature");
		TemperatureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				com.universalConverter.model.main.setVisible(com.universalConverter.model.main.getTemperatureFrame(), true);
			}
		});
		
		contentPane.add(TemperatureButton);
		
		Button currencyButton = new Button("Currency");
		currencyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				com.universalConverter.model.main.setVisible(com.universalConverter.model.main.getTemperatureFrame(), true);
			}
		});
		currencyButton.setLocation(1, 100);
		contentPane.add(currencyButton);
	}

}
