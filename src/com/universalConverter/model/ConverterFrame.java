package com.universalConverter.model;

import com.universalConverter.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


public class ConverterFrame extends JFrame {
    
	private final int width = 480;
    private final int height = 360;
    
    private final int componentWidth = 200;
    private final int componentHeight = 60;
    
    private JPanel contentPane;
    
    private JTextField inputTextField = new JTextField();
    private JTextField outputTextField = new JTextField();
    
    private JComboBox<?> inputComboBox = new JComboBox<>();
    private JComboBox<?> outputComboBox = new JComboBox<>();
    
    
    public ConverterFrame() {
        initialize();   
    }
    
    public ConverterFrame(String title) {
    	super(title);
    	initialize();
    	
    }
    
    public ConverterFrame(Class<? extends Unit> unit) {
        this();
        this.fillConverterComboBox(unit);
    }
    
    public ConverterFrame(String title,Class<? extends Unit> unit) {
        this(title);
        this.fillConverterComboBox(unit);
    }
    
    private void initialize() {
    	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setSize(this.width, this.height);
         setLocationRelativeTo(null);
         setResizable(false);

         
         contentPane = new JPanel();
         
         contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
         contentPane.setLayout(null);
         
         setContentPane(contentPane);
         
         
         getInputTextField().setBounds(25, 60, componentWidth, componentHeight);
         getInputComboBox().setBounds(240, 60, componentWidth, componentHeight);
         getOutputTextField().setBounds(25, 160, componentWidth, componentHeight);
         getOutputComboBox().setBounds(240, 160, componentWidth, componentHeight);
         
         contentPane.add(getInputTextField());
         contentPane.add(getInputComboBox());
         contentPane.add(getOutputTextField());
         contentPane.add(getOutputComboBox());
         
         
         JButton backToMenu = new JButton("Back");
         contentPane.add(backToMenu);
         backToMenu.setBounds(10, 10, 90, 25);
         backToMenu.addActionListener(e -> backToMenu());
         
         getInputTextField().getDocument().addDocumentListener(new DocumentListener() {
         	
             public void insertUpdate(DocumentEvent e) {
                 updateOutputValues();
             }

             public void removeUpdate(DocumentEvent e) {
                 updateOutputValues();
             }

             public void changedUpdate(DocumentEvent e) {
                 updateOutputValues();
             }
         });

         getInputComboBox().addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 updateOutputValues();
             }
         });
         
         getOutputComboBox().addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent e) {
                 updateOutputValues();
             }
         });
    	
    }
    
    public double convertValue(Unit sourceUnit, Unit targetUnit, double value) {
        return sourceUnit.convertTo(targetUnit, value);
    }
    
    public void fillComboBox(Class<? extends Unit> unit, JComboBox comboBox) {
        ArrayList<? extends Unit> list = UnitList.getListByType(unit);
        for (Unit item : list) {
            comboBox.addItem(item);
        }
    }
    
    public void fillConverterComboBox(Class<? extends Unit> unit) {
        fillComboBox(unit, getInputComboBox());
        fillComboBox(unit, getOutputComboBox());
    }
    
    private void updateOutputValues() {
    	getInputTextField().requestFocus();
    	
    	try {
            Double inputValue = Double.parseDouble(getInputTextField().getText());
            if (inputValue == null || inputValue.isNaN()) {
                return;
            }
            
            Unit inputUnit =  (Unit) getInputComboBox().getSelectedItem();
            Unit outputUnit = (Unit) getOutputComboBox().getSelectedItem();
            
            getOutputTextField().setText(
                String.valueOf(convertValue(inputUnit, outputUnit, inputValue)));
        } catch (NumberFormatException e) {
            return;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    public JTextField getInputTextField() {
        return inputTextField;
    }
    
    public void setInputTextField(JTextField inputTextField) {
        this.inputTextField = inputTextField;
    }
    
    public JTextField getOutputTextField() {
        return outputTextField;
    }
    
    public void setOutputTextField(JTextField outputTextField) {
        this.outputTextField = outputTextField;
    }
    
    public JComboBox<?> getInputComboBox() {
        return inputComboBox;
    }
    
    public void setInputComboBox(JComboBox<?> inputComboBox) {
        this.inputComboBox = inputComboBox;
    }
    
    public JComboBox<?> getOutputComboBox() {
        return outputComboBox;
    }
    
    public void setOutputComboBox(JComboBox<?> outputComboBox) {
        this.outputComboBox = outputComboBox;
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

