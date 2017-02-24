package main.gui;

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*;

public class TutorialGUI extends JFrame implements ActionListener, WindowListener {
	
	public TutorialGUI () {
		
		super("Tutorials");
		initialize();
	}
	
	private void initialize() {
		
		GridLayout gridLayout = new GridLayout(3,1);
	    Container cp = getContentPane();
	    cp.setLayout(gridLayout);
	    setPreferredSize(new Dimension(300,300));
	    setLocation (300,0);
	    
	    JButton jButton1 = new JButton("Division");
	    JButton jButton2 = new JButton("Brüche kürzen");
	    JButton jButton3 = new JButton("Prozentrechnung");
	    jButton1.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    jButton2.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    jButton3.setFont(new Font(Font.DIALOG,Font.BOLD,14));
	    cp.add(jButton1);
	    cp.add(jButton2);
	    cp.add(jButton3);
		
	    this.addWindowListener(this);
		setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
	    pack ();
	    setVisible(false);	
	}
	
	public void actionPerformed(ActionEvent ae) {    
	  }
	
	public void windowClosing (WindowEvent e) {dispose();}
	public void windowClosed (WindowEvent e) {}
	public void windowActivated (WindowEvent e) {}
	public void windowDeactivated (WindowEvent e) {}
	public void windowIconified (WindowEvent e) {}
	public void windowDeiconified (WindowEvent e) {}
	public void windowOpened (WindowEvent e) {} 
	
}
