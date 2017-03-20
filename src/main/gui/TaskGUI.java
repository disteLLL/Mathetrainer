package main.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;

public class TaskGUI implements ActionListener, WindowListener {
	JFrame frame;
	JButton check;
	JLabel result;
	Font font1 = new Font(Font.DIALOG,Font.PLAIN,17);
    Font font2 = new Font(Font.DIALOG,Font.BOLD,17);
	
	public TaskGUI () {
		
		frame = new JFrame();
		frame.setTitle("Übung");
		frame.setLocation (4,225);
		frame.setResizable(false);
	    frame.addWindowListener(this);
		frame.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(false);
		
		//divisionGUI();
		//fractionGUI();
		percentGUI();
	}
	
	
	public void divisionGUI() {
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setPreferredSize(new Dimension(210,80));
		TitledBorder title1 = BorderFactory.createTitledBorder("Division");
	    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel1.setBorder(title1);
		JLabel dividend = new JLabel("230");
		JLabel divideSymbol = new JLabel("\u00F7");
		JLabel divisor = new JLabel("5");
		JLabel equals = new JLabel("=");
		dividend.setFont(font1);
		divideSymbol.setFont(font1);
		divisor.setFont(font1);
		equals.setFont(font1);
		JTextField answer = new JTextField(3);
		jPanel1.add(dividend);
		jPanel1.add(divideSymbol);
		jPanel1.add(divisor);
		jPanel1.add(equals);
		jPanel1.add(answer);
		frame.add(jPanel1,BorderLayout.BEFORE_FIRST_LINE);
		
		
		JPanel jPanel2 = new JPanel();
		TitledBorder title2 = BorderFactory.createTitledBorder("Ergebnis");
	    title2.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel2.setBorder(title2);
	    result = new JLabel("");
	    result.setFont(font1);
	    jPanel2.add(result);
	    frame.add(jPanel2);
		
		JPanel jPanel3 = new JPanel();
		check = new JButton("Check");
		check.addActionListener(this);
		check.setActionCommand("check");
		jPanel3.add(check);
		frame.add(jPanel3,BorderLayout.AFTER_LAST_LINE);
		
		frame.pack();
	}
	
	public void fractionGUI() {
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setPreferredSize(new Dimension(350,120));
		TitledBorder title1 = BorderFactory.createTitledBorder("Brüche kürzen");
	    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel1.setBorder(title1);
		
		JPanel jPanelTask = new JPanel();
	    JLabel firstText = new JLabel("Kürzen Sie");
	    JLabel numerator = new JLabel("10");
	    JLabel divideSymbol1 = new JLabel("/");
	    JLabel denumerator = new JLabel("40");
	    JLabel secondText = new JLabel("soweit wie möglich.");
	    firstText.setFont(font1);
	    numerator.setFont(font2);
	    divideSymbol1.setFont(font2);
	    denumerator.setFont(font2);
	    secondText.setFont(font1);
	    jPanelTask.add(firstText);
	    jPanelTask.add(numerator);
	    jPanelTask.add(divideSymbol1);
	    jPanelTask.add(denumerator);
	    jPanelTask.add(secondText);
	    
	    JPanel jPanelAnswer = new JPanel();
	    JLabel answerText = new JLabel("Antwort:");
	    JTextField answer1 = new JTextField(2);
	    JLabel divideSymbol2 = new JLabel("/"); 
	    JTextField answer2 = new JTextField(2);
	    answerText.setFont(font1);
	    divideSymbol2.setFont(font2);
	    jPanelAnswer.add(answerText);
	    jPanelAnswer.add(answer1);
	    jPanelAnswer.add(divideSymbol2);
	    jPanelAnswer.add(answer2);
	    
	    jPanel1.add(jPanelTask);
	    jPanel1.add(jPanelAnswer);
	    frame.add(jPanel1,BorderLayout.BEFORE_FIRST_LINE);
	    
	    JPanel jPanel2 = new JPanel();
		TitledBorder title2 = BorderFactory.createTitledBorder("Ergebnis");
	    title2.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel2.setBorder(title2);
	    result = new JLabel("");
	    result.setFont(font1);
	    jPanel2.add(result);
	    frame.add(jPanel2);
		
		JPanel jPanel3 = new JPanel();
		check = new JButton("Check");
		check.addActionListener(this);
		check.setActionCommand("check");
		jPanel3.add(check);
		frame.add(jPanel3,BorderLayout.AFTER_LAST_LINE);
	  
	    frame.pack();
	}
	
	public void percentGUI() {
		
		frame.getContentPane().removeAll();
		
		if (true) {
			JPanel jPanel1 = new JPanel();
			jPanel1.setPreferredSize(new Dimension(210,80));
			TitledBorder title1 = BorderFactory.createTitledBorder("Prozentrechnung");
		    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
		    jPanel1.setBorder(title1);
			JLabel percent = new JLabel("30"+"%");
			JLabel von = new JLabel("von");
			JLabel base = new JLabel("500");
			JLabel equals = new JLabel("=");
			percent.setFont(font1);
			von.setFont(font1);
			base.setFont(font1);
			equals.setFont(font1);
			JTextField answer = new JTextField(3);
			jPanel1.add(percent);
			jPanel1.add(von);
			jPanel1.add(base);
			jPanel1.add(equals);
			jPanel1.add(answer);
			frame.add(jPanel1,BorderLayout.BEFORE_FIRST_LINE);
		}
		
		
		JPanel jPanel2 = new JPanel();
		TitledBorder title2 = BorderFactory.createTitledBorder("Ergebnis");
	    title2.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel2.setBorder(title2);
	    result = new JLabel("");
	    result.setFont(font1);
	    jPanel2.add(result);
	    frame.add(jPanel2);
		
		JPanel jPanel3 = new JPanel();
		check = new JButton("Check");
		check.addActionListener(this);
		check.setActionCommand("check");
		jPanel3.add(check);
		frame.add(jPanel3,BorderLayout.AFTER_LAST_LINE);
		
		frame.pack();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if (ac.equals("check")) {
			check.setText("Nächste Aufgabe");
			check.setActionCommand("next");
			check.setBackground(Color.GREEN);
			result.setText("1/4");
			frame.pack();
		}
		if (ac.equals("next")) {
			check.setText("Check");
			check.setActionCommand("check");
			check.setBackground(UIManager.getColor("Button.background"));
			result.setText("");
			frame.pack();
		}
	}

	@Override
	public void windowClosing(WindowEvent e) {frame.setVisible(false);}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
}
