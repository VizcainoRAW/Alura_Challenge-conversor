package com.universalConverter.model;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public abstract class  ConverterFrame extends JFrame{
	
	private final int width=800;
	private final int height=600;
	
	private JTextField firstTextField=new JTextField();
	private JTextField secondTextField=new JTextField();
	
	private JComboBox firtsComboBox=new JComboBox();
	private JComboBox secondComboBox=new JComboBox();
	
	
	
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
		com.universalConverter.main.setVisible(com.universalConverter.main.getMenu(), true);
	}

}
