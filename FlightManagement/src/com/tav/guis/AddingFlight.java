package com.tav.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import com.tav.store.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.PreparedStatement;

public class AddingFlight extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_fn;
	private JTextField textField_d;
	private JTextField textField_a;
	
	private int pr_flightno;
	private String pr_destination;
	private String pr_airline;
	public static String eklenecek;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingFlight frame = new AddingFlight();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddingFlight() {
		setTitle("Flight Adder");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel flightNo = new JLabel("Flight No");
		flightNo.setBounds(216, 124, 65, 31);
		contentPane.add(flightNo);
		
		textField_fn = new JTextField();
		textField_fn.setBounds(314, 124, 123, 31);
		contentPane.add(textField_fn);
		textField_fn.setColumns(10);
		
		JLabel destination = new JLabel("Destination");
		destination.setBounds(216, 186, 65, 31);
		contentPane.add(destination);
		
		JLabel airline = new JLabel("Airline");
		airline.setBounds(216, 249, 65, 25);
		contentPane.add(airline);
		
		textField_d = new JTextField();
		textField_d.setBounds(314, 186, 123, 31);
		contentPane.add(textField_d);
		textField_d.setColumns(10);
		
		textField_a = new JTextField();
		textField_a.setBounds(314, 246, 123, 31);
		contentPane.add(textField_a);
		textField_a.setColumns(10);
		
		JButton adderButton = new JButton("Add the Flight");
		adderButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pr_flightno=Integer.parseInt(textField_fn.getText());
				pr_destination=textField_d.getText();
				pr_airline=textField_a.getText();
			    eklenecek="INSERT INTO flight(flightno,destination,airline) VALUES("+pr_flightno+","+"'"+pr_destination+"'"+","+"'"+pr_airline+"')";
				/*String sorgu="INSERT INTO flight(flightno,destination,airline)"+" VALUES(?,?,?)";
				PreparedStatement komut=conn.prepareStatement(sorgu);
				*/
				AddDeleteFlight.wannaAdd();
				System.out.println(eklenecek+"in the adding flight");
			}
		});
		adderButton.setBounds(314, 317, 123, 36);
		contentPane.add(adderButton);
	}
}
