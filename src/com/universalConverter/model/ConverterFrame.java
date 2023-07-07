package com.universalConverter.model;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public abstract class  ConverterFrame extends JFrame{
	
	private final int width=800;
	private final int height=600;
	
	public ConverterFrame() {

		setBounds(100, 100, this.width, this.height);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		new JPanel();
		
		JButton backToMenu = new JButton("Back");
		getContentPane().add(backToMenu, BorderLayout.SOUTH);
		backToMenu.addActionListener(e -> backToMenu());

		
	}
	
	public void backToMenu() {
		setVisible(false);
		com.unviersalConverter.main.setVisible(com.unviersalConverter.main.getMenu(), true);
	}

}
