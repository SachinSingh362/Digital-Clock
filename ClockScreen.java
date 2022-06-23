package com.ss.digitalclock.main;

import java.awt.BorderLayout;
import javax.swing.Timer;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ClockScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 * 
	
	 */
	JLabel clockLabel = new JLabel("Clock");
	public ClockScreen() {
		setResizable(false);
		setTitle("My Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("My Digi Clock");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(55, 27, 340, 69);
		contentPane.add(lblNewLabel);
		clockLabel.setFont(new Font("Dubai", Font.BOLD, 21));
		
		
		clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
		clockLabel.setBounds(10, 116, 414, 146);
		contentPane.add(clockLabel);
		setLocationRelativeTo(null);
		setVisible(true);
		this.startClock();
	}
	
	

	
	public void startClock() {
		 Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String dateTime=new Date().toLocaleString();
				clockLabel.setText(dateTime);
				
			}
			
		});
		 timer.start();
		
		
	}
}
