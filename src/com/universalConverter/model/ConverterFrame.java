package com.universalConverter.model;

import com.universalConverter.*;
import javax.swing.*;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;


public abstract class  ConverterFrame extends JFrame{
	
	private final int width=480;
	private final int height=360;
	
	private final int componentWidth=200;
	private final int componentHeight=60;
	
	private JPanel contentPane;
	
	private JTextField firstTextField=new JTextField();
	private JTextField secondTextField=new JTextField();
	
	private JComboBox<?> firstComboBox=new JComboBox();
	private JComboBox<?> secondComboBox=new JComboBox();
	
	
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
		backToMenu.setBounds(10,10,90,25);
		backToMenu.addActionListener(e -> backToMenu());
		
	}
	
	public ConverterFrame(Class <? extends Unit> unit) {
		this();
		this.fillConverterComboBox(unit);
		
	}
	
	
	public void fillComboBox(Class<? extends Unit> unit, JComboBox comboBox) {
		ArrayList<? extends Unit> list = UnitList.getListByType(unit);
		for(Unit item :list) {
			comboBox.addItem(item);
		}
		
	}
	
	public void fillConverterComboBox(Class<? extends Unit> unit){
		fillComboBox(unit, this.getFirtsComboBox());
		fillComboBox(unit, this.getSecondComboBox());
		
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
		main.setVisible(main.getMenu(), true);
	}

}
