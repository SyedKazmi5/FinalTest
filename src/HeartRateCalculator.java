/*
File name: HeartRateCalculator.java
Author's name: Syed Kazmi
Date: 15 Dec 2015 
App description: An application to calculate rate
*/


import java.awt.BorderLayout;



import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import javax.swing.JPanel;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
public class HeartRateCalculator extends JFrame {

	JFrame myFrame= new JFrame();
	JPanel myPanel = new JPanel();
	
	//Private Labels Declaration
	private JLabel _headingLabel;
	private JLabel _ageLabel;
	private JLabel _averageLabel;
	private JButton _calculateButton;
	
	//Text Fields Declaration
	private JTextField _ageField;
	
	//radio buttons
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;


	//Constructor
	public HeartRateCalculator() {

		_generateGUI();
		
		//_calculateButton handler = new _calculateButton();
		//this._calculateButton.addActionListener(handler);
	

	}

	private void _generateGUI() {
		
		setTitle("Heart Rate Calculator"); //Set Title
		
		getContentPane().setLayout(null);
		//this.setLayout(new FlowLayout());
		myPanel.setBorder(new EmptyBorder(5,5,5,5));
		myPanel.setLayout(new BorderLayout(0,0));
		myFrame.setContentPane(myPanel);
		myFrame.setVisible(true);
		
		_headingLabel = new JLabel("Target Heart Rate");
		_headingLabel.setForeground(Color.GREEN);
		_headingLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 18));
		_headingLabel.setBounds(110,0,250,21);
		getContentPane().add(_headingLabel);
		
		_ageLabel = new JLabel("My Age: ");
		_ageLabel.setForeground(Color.black);
		_ageLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_ageLabel.setBounds(84,27,121,21);
		getContentPane().add(_ageLabel);

		_ageField = new JTextField("",2);
		_ageField.setBounds(160,27,100,25);
		getContentPane().add(_ageField);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setSelected(true);
		rdbtnMale.setBounds(128, 65, 109, 23);
		getContentPane().add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(251, 65, 109, 23);
		getContentPane().add(rdbtnFemale);
		
		JLabel _targetHeartRateLabel = new JLabel("Target Heart Rate Zone ");
		_targetHeartRateLabel.setForeground(Color.BLACK);
		_targetHeartRateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_targetHeartRateLabel.setBounds(61, 145, 176, 21);
		getContentPane().add(_targetHeartRateLabel);
		
		JButton _calculateButton = new JButton("Calculate");
		_calculateButton.setBounds(181, 111, 89, 23);
		getContentPane().add(_calculateButton);
		
		JLabel _averageHeartRateLabel = new JLabel("Average Maximum Heart Rate");
		_averageHeartRateLabel.setForeground(Color.BLACK);
		_averageHeartRateLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_averageHeartRateLabel.setBounds(24, 176, 213, 21);
		getContentPane().add(_averageHeartRateLabel);
		
		JLabel _minLabel = new JLabel("0");
		_minLabel.setForeground(Color.BLACK);
		_minLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_minLabel.setBounds(248, 145, 57, 21);
		getContentPane().add(_minLabel);
		
		JLabel _maxLabel = new JLabel("0");
		_maxLabel.setForeground(Color.BLACK);
		_maxLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_maxLabel.setBounds(325, 145, 57, 21);
		getContentPane().add(_maxLabel);
		
		JLabel _averageLabel = new JLabel("0");
		_averageLabel.setForeground(Color.BLACK);
		_averageLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		_averageLabel.setBounds(251, 181, 57, 21);
		getContentPane().add(_averageLabel);

	}
	
	//Private  Action Listener
	private class _calculateButton implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			_displayHeartRateDetails();
		}
	}
	//Private Class to calucate and display heart rate
	private void _displayHeartRateDetails() {
		_averageLabel.setText("Test");
	}
}
