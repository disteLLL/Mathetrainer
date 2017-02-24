package main.gui;

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainGUI extends JFrame implements ActionListener {
  
	TutorialGUI tutorial;
	

  public static void main(String[] args) {
    
    MainGUI main = new MainGUI();
  }
  
  private MainGUI() {
    
    super("Mathetrainer");
    initialize();
    this.tutorial = new TutorialGUI();
    
  }

  private void initialize() {
    
    // -------------------------------------------------------------- GridLayout
    GridLayout gridLayout = new GridLayout(3,1);
    Container cp = getContentPane();
    cp.setLayout(gridLayout);
    setPreferredSize(new Dimension(300,300));
    
    // GridRow1 --------------------------------------------------------------
    JPanel jPanel1 = new JPanel();
    JButton jButton1 = new JButton("Tutorials");
    jButton1.setPreferredSize(new Dimension(274,70));
    jButton1.setFont(new Font(Font.DIALOG,Font.BOLD,14));
    jPanel1.add(jButton1);
    cp.add(jPanel1);
    
    // GridRow2 --------------------------------------------------------------
    JPanel jPanel2 = new JPanel();
    TitledBorder title1 = BorderFactory.createTitledBorder("Übungsaufgaben");
    title1.setTitleFont(new Font(Font.DIALOG,Font.BOLD,14));
    jPanel2.setBorder(title1);
    jPanel2.setLayout(new GridLayout (3,2));
    cp.add(jPanel2);
    
    JCheckBox jCheckBox1 = new JCheckBox("Division");
    JRadioButton jRadioButton1 = new JRadioButton("Level 1",true);
    jPanel2.add(jCheckBox1);
    jPanel2.add(jRadioButton1);
      
    JCheckBox jCheckBox2 = new JCheckBox("Brüche kürzen");
    JRadioButton jRadioButton2 = new JRadioButton("Level 2");
    jPanel2.add(jCheckBox2);
    jPanel2.add(jRadioButton2);
      
    JCheckBox jCheckBox3 = new JCheckBox("Prozentrechnung");
    JButton jButton2 = new JButton("Start");
    
    jPanel2.add(jCheckBox3);
    jPanel2.add(jButton2);
      
    // GridRow3 --------------------------------------------------------------
    JPanel jPanel3 = new JPanel();
    TitledBorder title2 = BorderFactory.createTitledBorder("Freies Üben");
    title2.setTitleFont(new Font(Font.DIALOG,Font.BOLD,14));
    jPanel3.setBorder(title2);
    jPanel3.setLayout(new GridLayout (3,2));
    cp.add(jPanel3);
     
    JCheckBox jCheckBox4 = new JCheckBox("Division");
    JRadioButton jRadioButton3 = new JRadioButton("Level 1",true);
    jPanel3.add(jCheckBox4);
    jPanel3.add(jRadioButton3);
  
    JCheckBox jCheckBox5 = new JCheckBox("Brüche kürzen");
    JRadioButton jRadioButton4 = new JRadioButton("Level 2");
    jPanel3.add(jCheckBox5);
    jPanel3.add(jRadioButton4);
      
    JCheckBox jCheckBox6 = new JCheckBox("Prozentrechnung");
    JButton jButton3 = new JButton("Start");
    jPanel3.add(jCheckBox6);
    jPanel3.add(jButton3);
    // -------------------------------------------------------------- GridLayout  
       
    ButtonGroup btGroup1 = new ButtonGroup();
    ButtonGroup btGroup2 = new ButtonGroup();
    btGroup1.add(jRadioButton1);
    btGroup1.add(jRadioButton2);
    btGroup2.add(jRadioButton3);
    btGroup2.add(jRadioButton4);
    
    jButton1.addActionListener(this);
    jButton1.setActionCommand("tutorials");
    jButton2.addActionListener(this);
    jButton2.setActionCommand("startUebung");
    jButton3.addActionListener(this);
    jButton3.setActionCommand("startFrei");
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae) {
    String ac = ae.getActionCommand();
    if (ac.equals("tutorials")) {
    	tutorial.setVisible(true);
    }
    else if (ac.equals("startUebung")) {
    	
    }
    else if (ac.equals("startFrei")) {
    	
    }
  } 
}