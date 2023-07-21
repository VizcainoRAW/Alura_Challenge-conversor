package com.universalConverter.view;

import com.universalConverter.main;

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
		setBounds(100, 100, 360, 240);
		setResizable(false);
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) contentPane.getLayout();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		Button TemperatureButton = new Button("Temperature");
		TemperatureButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				main.setVisible(main.getTemperatureFrame(), true);
			}
		});
		
		contentPane.add(TemperatureButton);
		
		Button currencyButton = new Button("Currency");
		currencyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				main.setVisible(main.getCurrencyFrame(), true);
			}
		});
		
		contentPane.add(currencyButton);
		
		Button weightButton = new Button("Weight");
		weightButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				main.setVisible(main.getWeightFrame(), true);
			}
		});
		
		contentPane.add(weightButton);
		
		Button timeButton = new Button("Time");
		timeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				main.setVisible(main.getTimeFrame(), true);
			}
		});
		
		contentPane.add(timeButton);
	}

}
