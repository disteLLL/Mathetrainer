package main.gui;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.io.File;
import java.io.IOException;

public class TutorialGUI implements ActionListener, WindowListener {
	
	public JFrame frame;
	private String[] divisionNames = {"Einleitung","Beispiele","Division mit Rest","Schriftliche Division","Lösungsweg","Schriftliche Division mit Rest"};
	private String[] fractionNames = {"Einleitung","größter gemeinsamer Teiler","Teilermengen","Euklidischer Algorithmus","Beispiel"};
	private String[] percentNames = {"Einleitung","Grundwert, Prozentwert, Prozentsatz","Prozent Schreibweisen","Formeln und Beispiele"};
	private String divisionPath = "resources/division/";
	private String fractionPath = "resources/fraction/";
	private String percentPath = "resources/percent/";
	
	public TutorialGUI () {
		
		frame = new JFrame();
		frame.setLocation (300,0);
	    frame.addWindowListener(this);
		frame.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE); // siehe windowClosing()
		frame.setVisible(false);
		initialize();
	}
	
	public void initialize() {
		
		frame.getContentPane().removeAll();
		frame.setTitle("Tutorials");
		
		JPanel jPanel = new JPanel(new GridLayout(3,1));
	    jPanel.setPreferredSize(new Dimension(260,150));
	    
	    JButton jButton1 = new JButton("Division");
	    JButton jButton2 = new JButton("Brüche kürzen");
	    JButton jButton3 = new JButton("Prozentrechnung");
	    Font buttonFont = new Font(Font.DIALOG,Font.BOLD,14); 
	    jButton1.setFont(buttonFont);
	    jButton2.setFont(buttonFont);
	    jButton3.setFont(buttonFont);
	    jButton1.addActionListener(this);
	    jButton1.setActionCommand("division");
	    jButton2.addActionListener(this);
	    jButton2.setActionCommand("fraction");
	    jButton3.addActionListener(this);
	    jButton3.setActionCommand("percent");
	    jPanel.add(jButton1);
	    jPanel.add(jButton2);
	    jPanel.add(jButton3);
		
	    frame.add(jPanel);
	    frame.pack ();   	
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String ac = e.getActionCommand();
		if (ac.equals("division")) {
			tutorialPanel(divisionNames,divisionPath);
			frame.setTitle("Division");
		}
		if (ac.equals("fraction")) {
			tutorialPanel(fractionNames,fractionPath);
			frame.setTitle("Brüche kürzen");
		}
		if (ac.equals("percent")) {
			tutorialPanel(percentNames,percentPath);
			frame.setTitle("Prozentrechnung");
		}
		if (ac.equals("back")) initialize();	
	  }
	
	public void tutorialPanel (String[] names, String filePath) {
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel = new JPanel();
		UIManager.put("TabbedPane.contentAreaColor", ColorUIResource.WHITE);
		UIManager.put("TabbedPane.selected", ColorUIResource.WHITE);
		JTabbedPane jTPane = new JTabbedPane(JTabbedPane.TOP);
		
		// füllt das JTabbedPane mit den Bildern aus resources/*
		for (int i=0;i<names.length;i++) {
			try {
				BufferedImage image = ImageIO.read(new File(filePath+names[i]+".png"));
				JLabel picLabel = new JLabel(new ImageIcon(image));
				jTPane.addTab(names[i], picLabel);	
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		jPanel.add(jTPane);
		
		JButton back = new JButton("Zurück zur Tutorialübersicht");
		back.addActionListener(this);
		back.setActionCommand("back");	
		JPanel jPanel2 = new JPanel();
		jPanel2.add(back);
		
		frame.add(jPanel);
		frame.add(jPanel2,BorderLayout.SOUTH);
		frame.pack();
	}
	
	public void windowClosing (WindowEvent e) {
		initialize();
		frame.setVisible(false);	
	}
	
	public void windowClosed (WindowEvent e) {}
	public void windowActivated (WindowEvent e) {}
	public void windowDeactivated (WindowEvent e) {}
	public void windowIconified (WindowEvent e) {}
	public void windowDeiconified (WindowEvent e) {}
	public void windowOpened (WindowEvent e) {} 	
}
