package main.gui;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class TutorialGUI implements ActionListener, WindowListener {
	
	JFrame frame;
	
	public TutorialGUI () {
		
		frame = new JFrame();
		initialize();
	}
	
	public void initialize() {
		
		GridLayout gridLayout = new GridLayout(3,1);
	    frame.setLayout(gridLayout);
	    frame.setPreferredSize(new Dimension(300,300));
	    frame.setLocation (300,0);
	    frame.setTitle("Tutorials");
	    
	    JButton jButton1 = new JButton("Division");
	    JButton jButton2 = new JButton("Brüche kürzen");
	    JButton jButton3 = new JButton("Prozentrechnung");
	    jButton1.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    jButton2.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    jButton3.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    jButton1.addActionListener(this);
	    jButton1.setActionCommand("division");
	    frame.add(jButton1);
	    frame.add(jButton2);
	    frame.add(jButton3);
		
	    frame.addWindowListener(this);
		frame.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
	    frame.pack ();
	    frame.setVisible(false);	
	}
	
	public void actionPerformed(ActionEvent ae) {
		String ac = ae.getActionCommand();
		if (ac.equals("division")) {
			frame.getContentPane().removeAll();
			frame.repaint();
		}
	  }
	
	public void windowClosing (WindowEvent e) {frame.dispose();}
	public void windowClosed (WindowEvent e) {}
	public void windowActivated (WindowEvent e) {}
	public void windowDeactivated (WindowEvent e) {}
	public void windowIconified (WindowEvent e) {}
	public void windowDeiconified (WindowEvent e) {}
	public void windowOpened (WindowEvent e) {} 
	
}
