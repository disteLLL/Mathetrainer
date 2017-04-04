package main.gui;

import java.awt.*; 
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;


public class MainGUI implements ActionListener {
  
	private TutorialGUI tutorial;
	private TaskGUI task;
	private JFrame frame;
	public JCheckBox jCheckBox1;
	public JCheckBox jCheckBox2;
	public JCheckBox jCheckBox3;
	public JRadioButton jRadioButton1;
	public JRadioButton jRadioButton2;
	

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
     
    jCheckBox1 = new JCheckBox("Division",true);
    jRadioButton1 = new JRadioButton("Level 1",true);
    jPanel2.add(jCheckBox1);
    jPanel2.add(jRadioButton1);
  
    jCheckBox2 = new JCheckBox("Brüche kürzen",true);
    jRadioButton2 = new JRadioButton("Level 2");
    jPanel2.add(jCheckBox2);
    jPanel2.add(jRadioButton2);
      
    jCheckBox3 = new JCheckBox("Prozentrechnung",true);
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
  
  public void actionPerformed(ActionEvent e) {
	  
    String ac = e.getActionCommand();
    if (ac.equals("tutorials")) {
    	tutorial.frame.setVisible(true);
    }
    if (ac.equals("start")) {
    	// wählt die erste Aufgabe aus	
    	Select.selectTask(jRadioButton1.isSelected(),jCheckBox1.isSelected(),jCheckBox2.isSelected(),jCheckBox3.isSelected(),task);
    	// übergibt der TaskGUI die Button-Selections
    	task.updateCheckBoxes(jRadioButton1.isSelected(),jCheckBox1.isSelected(),jCheckBox2.isSelected(),jCheckBox3.isSelected());	
    	task.frame.setVisible(true);
    }   
  }
}