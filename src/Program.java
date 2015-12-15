/*
File name: Program.java
Author's name: Syed Kazmi
Date: 15 Dec 2015 
App description: Driver Class
*/

import javax.swing.JFrame;

public class Program {


	public static void main(String[] args) {

		HeartRateCalculator HRA = new HeartRateCalculator(); //create instance of Heart Rate Class
		HRA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HRA.setSize(500, 500);
		HRA.setVisible(true);

	}

}
