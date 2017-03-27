package main.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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

public class TaskGUI implements ActionListener, WindowListener,KeyListener {
	JFrame frame;
	JButton check;
	JLabel result;
	JTextField answer1;
	JTextField answer2;
	TitledBorder title1;
	String resultStr,fractionResult1,fractionResult2;
	Font font1 = new Font(Font.DIALOG,Font.PLAIN,17);
    Font font2 = new Font(Font.DIALOG,Font.BOLD,17);
    boolean radioButton,division,fraction,percent;
    boolean percentCheck = false;
	
	public TaskGUI () {
		
		frame = new JFrame();
		frame.setTitle("Übung");
		frame.setLocation (4,225);
		frame.setResizable(false);
	    frame.addWindowListener(this);
		frame.setDefaultCloseOperation (JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(false);
	}
	
	
	public void divisionGUI(int[] numbers) {
		
		String dividendStr = String.valueOf(numbers[0]);
		String divisorStr = String.valueOf(numbers[1]);
		resultStr = String.valueOf(numbers[2]);
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setPreferredSize(new Dimension(210,80));
		title1 = BorderFactory.createTitledBorder("Division");
	    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel1.setBorder(title1);
		JLabel dividend = new JLabel(dividendStr);
		JLabel divideSymbol = new JLabel("\u00F7");
		JLabel divisor = new JLabel(divisorStr);
		JLabel equals = new JLabel("=");
		dividend.setFont(font1);
		divideSymbol.setFont(font1);
		divisor.setFont(font1);
		equals.setFont(font1);
		answer1 = new JTextField(3);
		answer1.addKeyListener(this);
		jPanel1.add(dividend);
		jPanel1.add(divideSymbol);
		jPanel1.add(divisor);
		jPanel1.add(equals);
		jPanel1.add(answer1);
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
	
	public void fractionGUI(int[] numbers) {
		
		String numeratorStr = String.valueOf(numbers[0]);
		String denumeratorStr = String.valueOf(numbers[1]);
		fractionResult1 = String.valueOf(numbers[2]);
		fractionResult2 = String.valueOf(numbers[3]);
		resultStr = fractionResult1+"/"+fractionResult2;
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setPreferredSize(new Dimension(350,120));
		title1 = BorderFactory.createTitledBorder("Brüche kürzen");
	    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel1.setBorder(title1);
		
		JPanel jPanelTask = new JPanel();
	    JLabel firstText = new JLabel("Kürzen Sie");
	    JLabel numerator = new JLabel(numeratorStr);
	    JLabel divideSymbol1 = new JLabel("/");
	    JLabel denumerator = new JLabel(denumeratorStr);
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
	    answer1 = new JTextField(2);
	    answer1.addKeyListener(this);
	    JLabel divideSymbol2 = new JLabel("/"); 
	    answer2 = new JTextField(2);
	    answer2.addKeyListener(this);
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
	
	public void percentGUI(int[] numbers) {
		
		String percent1 = String.valueOf(numbers[0]);
		String percent2 = String.valueOf(numbers[1]);
		resultStr = String.valueOf(numbers[2]);
		
		frame.getContentPane().removeAll();
		
		JPanel jPanel1 = new JPanel();
		title1 = BorderFactory.createTitledBorder("Prozentrechnung");
	    title1.setTitleFont(new Font(Font.DIALOG,Font.PLAIN,15));
	    jPanel1.setBorder(title1);
		
	    if (numbers[3] == 0) {
				
			jPanel1.setPreferredSize(new Dimension(210,80));
			
			JLabel percent = new JLabel(percent1+"%");
			JLabel von = new JLabel("von");
			JLabel base = new JLabel(percent2);
			JLabel equals = new JLabel("=");
			percent.setFont(font1);
			von.setFont(font1);
			base.setFont(font1);
			equals.setFont(font1);
			answer1 = new JTextField(3);
			jPanel1.add(percent);
			jPanel1.add(von);
			jPanel1.add(base);
			jPanel1.add(equals);
			jPanel1.add(answer1);	
		}
	    
	    if (numbers[3] == 1) {
	     
	    	jPanel1.setPreferredSize(new Dimension(300,120));
	    	
	    	JPanel jPanelTask = new JPanel();
	    	JLabel text = new JLabel("Wieviel Prozent sind");
	    	JLabel fraction = new JLabel(percent1);
	    	JLabel von = new JLabel("von");
	    	JLabel base = new JLabel(percent2+"?");
	    	text.setFont(font1);
	    	fraction.setFont(font1);
	    	von.setFont(font1);
	    	base.setFont(font1);
	    	jPanelTask.add(text);
	    	jPanelTask.add(fraction);
	    	jPanelTask.add(von);
	    	jPanelTask.add(base);
	    	
	    	JPanel jPanelAnswer = new JPanel();
	    	JLabel answerText = new JLabel("Antwort:");
		    answer1 = new JTextField(3);
		    JLabel percent = new JLabel("%");
		    answerText.setFont(font1);
		    percent.setFont(font1);
		    jPanelAnswer.add(answerText);
		    jPanelAnswer.add(answer1);
		    jPanelAnswer.add(percent);
		    
		    jPanel1.add(jPanelTask);
		    jPanel1.add(jPanelAnswer);
		    percentCheck = true;
	    }
	    
	    if (numbers[3] == 2) {
	    	
	    	jPanel1.setPreferredSize(new Dimension(450,120));
	    	
	    	JPanel jPanelTask = new JPanel();
	    	JLabel wenn = new JLabel("Wenn");
	    	JLabel percent = new JLabel(percent1+"%");
	    	JLabel fraction = new JLabel(percent2);
	    	JLabel text = new JLabel("entsprechen, was entspricht dann 100%?");
	    	wenn.setFont(font1);
	    	percent.setFont(font1);
	    	fraction.setFont(font1);
	    	text.setFont(font1);
	    	jPanelTask.add(wenn);
	    	jPanelTask.add(percent);
	    	jPanelTask.add(fraction);
	    	jPanelTask.add(text);
	    	
	    	JPanel jPanelAnswer = new JPanel();
	    	JLabel answerText = new JLabel("Antwort:");
	    	answer1 = new JTextField(3);
	    	answerText.setFont(font1);
	    	jPanelAnswer.add(answerText);
	    	jPanelAnswer.add(answer1);
	    	
	    	jPanel1.add(jPanelTask);
	    	jPanel1.add(jPanelAnswer);
	    }
		
	    answer1.addKeyListener(this);
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
	
	public void checkTask (String taskType) {
		
		if (taskType.equals("Division")) {
			if (answer1.getText().equals(resultStr)) check.setBackground(Color.GREEN);
			else check.setBackground(Color.RED);
		}
		if (taskType.equals("Brüche kürzen")) {
			if (answer1.getText().equals(fractionResult1) && answer2.getText().equals(fractionResult2)) check.setBackground(Color.GREEN);
			else check.setBackground(Color.RED);
		}
		if (taskType.equals("Prozentrechnung")) {
			if (answer1.getText().equals(resultStr)) {
				if (percentCheck) {
					resultStr = resultStr+"%";
					percentCheck = false;
				}
				check.setBackground(Color.GREEN);
			}
			else check.setBackground(Color.RED);
		}
	}
	
	public void getCheckBoxes (boolean radioButton,boolean division,boolean fraction,boolean percent) {
		this.radioButton = radioButton;
		this.division = division;
		this.fraction = fraction;
		this.percent = percent;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		if (ac.equals("check")) {
			check.setText("Nächste Aufgabe");
			check.setActionCommand("next");
			checkTask(title1.getTitle());
			result.setText(resultStr);
			frame.pack();
		}
		if (ac.equals("next")) {
			check.setText("Check");
			check.setActionCommand("check");
			check.setBackground(UIManager.getColor("Button.background"));
			result.setText("");
			Select.selectTask(radioButton,division,fraction,percent,this);
			frame.pack();
			answer1.requestFocus();
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) check.doClick();
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
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
