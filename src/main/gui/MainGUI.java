package main.gui;

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;


public class MainGUI implements ActionListener {
  
	TutorialGUI tutorial;
	TaskGUI task;
	JFrame frame;
	

  public static void main(String[] args) {
    new MainGUI();
  }
  
  private MainGUI() {
    
    frame = new JFrame();
    initialize();
    this.tutorial = new TutorialGUI();
    this.task = new TaskGUI();
    
  }

  private void initialize() {
    
    // -------------------------------------------------------------- GridLayout
    GridLayout gridLayout = new GridLayout(2,1);
    frame.setLayout(gridLayout);
    frame.setPreferredSize(new Dimension(300,220));
    frame.setTitle("Mathetrainer");
    
    // GridRow1 --------------------------------------------------------------
    JPanel jPanel1 = new JPanel();
    JButton jButton1 = new JButton("Tutorials");
    jButton1.setPreferredSize(new Dimension(270,70));
    jButton1.setFont(new Font(Font.DIALOG,Font.BOLD,14));
    jPanel1.add(jButton1);
    frame.add(jPanel1);
      
    // GridRow2 --------------------------------------------------------------
    JPanel jPanel2 = new JPanel();
    TitledBorder title = BorderFactory.createTitledBorder("Freies Üben");
    title.setTitleFont(new Font(Font.DIALOG,Font.BOLD,14));
    jPanel2.setBorder(title);
    jPanel2.setLayout(new GridLayout (3,2));
    frame.add(jPanel2);
     
    JCheckBox jCheckBox1 = new JCheckBox("Division",true);
    JRadioButton jRadioButton1 = new JRadioButton("Level 1",true);
    jPanel2.add(jCheckBox1);
    jPanel2.add(jRadioButton1);
  
    JCheckBox jCheckBox2 = new JCheckBox("Brüche kürzen",true);
    JRadioButton jRadioButton2 = new JRadioButton("Level 2");
    jPanel2.add(jCheckBox2);
    jPanel2.add(jRadioButton2);
      
    JCheckBox jCheckBox3 = new JCheckBox("Prozentrechnung",true);
    JButton jButton2 = new JButton("Start");
    jPanel2.add(jCheckBox3);
    jPanel2.add(jButton2);
    // -------------------------------------------------------------- GridLayout  
       
    ButtonGroup btGroup = new ButtonGroup();
    btGroup.add(jRadioButton1);
    btGroup.add(jRadioButton2);
    
    jButton1.addActionListener(this);
    jButton1.setActionCommand("tutorials");
    jButton2.addActionListener(this);
    jButton2.setActionCommand("start");
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent ae) {
    String ac = ae.getActionCommand();
    if (ac.equals("tutorials")) {
    	tutorial.frame.setVisible(true);
    }
    if (ac.equals("start")) {
    	task.frame.setVisible(true);
    }   
  } 
}