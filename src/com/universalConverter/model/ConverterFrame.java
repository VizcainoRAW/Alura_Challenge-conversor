package com.universalConverter.model;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public abstract class  ConverterFrame extends JFrame{
	
	private final int width=480;
	private final int height=360;
	
	private final int componentWidth=200;
	private final int componentHeight=60;
	
	private JPanel contentPane;
	
	private JTextField firstTextField=new JTextField();
	private JTextField secondTextField=new JTextField();
	
	private JComboBox firstComboBox=new JComboBox();
	private JComboBox secondComboBox=new JComboBox();
	
	
	
	public ConverterFrame() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(this.width, this.height);
		setLocationRelativeTo(null);
		setResizable(false);
		
		contentPane = new JPanel();

        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		
		getFirstTextField().setBounds(25,60,componentWidth, componentHeight);
		getFirtsComboBox().setBounds(240,60,componentWidth, componentHeight);
		getSecondTextField().setBounds(25,160,componentWidth, componentHeight);
		getSecondComboBox().setBounds(240,160,componentWidth, componentHeight);
		
		contentPane.add(getFirstTextField());
		contentPane.add(getFirtsComboBox());
		contentPane.add(getSecondTextField());
		contentPane.add(getSecondComboBox());
	
		
		JButton backToMenu = new JButton("Back");
		contentPane.add(backToMenu);
		backToMenu.addActionListener(e -> backToMenu());
		
	}
	
	
	
	public JTextField getFirstTextField() {
		return firstTextField;
	}



	public void setFirstTextField(JTextField firstTextField) {
		this.firstTextField = firstTextField;
	}



	public JTextField getSecondTextField() {
		return secondTextField;
	}



	public void setSecondTextField(JTextField secondTextField) {
		this.secondTextField = secondTextField;
	}



	public JComboBox getFirtsComboBox() {
		return firstComboBox;
	}



	public void setFirtsComboBox(JComboBox firtsComboBox) {
		this.firstComboBox = firtsComboBox;
	}



	public JComboBox getSecondComboBox() {
		return secondComboBox;
	}



	public void setSecondComboBox(JComboBox secondComboBox) {
		this.secondComboBox = secondComboBox;
	}



	public int getWidth() {
		return width;
	}



	public int getHeight() {
		return height;
	}



	public void backToMenu() {
		setVisible(false);
		com.universalConverter.main.setVisible(com.universalConverter.main.getMenu(), true);
	}

}
