package com.tav.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.tav.store.*;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class FlightManagement extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightManagement frame = new FlightManagement();
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
	public FlightManagement() {
		setTitle("Flight Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(234, 0, 473, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton closeButton = new JButton("Logout");
		closeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				MysqlConnect.closeConnection();
				System.exit(0);
			}
		});
		closeButton.setBounds(360, 13, 97, 67);
		panel.add(closeButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(399, 81, 289, 71);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("New");
		btnNewButton.addActionListener(new ActionListener() {
			public String[] adding;

			public void actionPerformed(ActionEvent e) {
				AddingFlight.main(adding);
			}
		});
		btnNewButton.setBounds(19, 13, 123, 54);
		panel_1.add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener(){
			public String[] deleting;
			public void actionPerformed(ActionEvent e){
				DeletingFlight.main(deleting);
			}
		});
		btnDelete.setBounds(154, 13, 123, 54);
		panel_1.add(btnDelete);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 155, 676, 325);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Arrivals");
		tglbtnNewToggleButton.setBounds(27, 98, 183, 30);
		panel_2.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnDepartures = new JToggleButton("Departures");
		tglbtnDepartures.setBounds(208, 98, 183, 30);
		panel_2.add(tglbtnDepartures);
		
	//	table = new JTable();
	//	table.setBounds(12, 277, 599, -124);
	//	panel_2.add(table);
		JTable tblFlights = new JTable();
	//	tblFlights.
		tblFlights.setBounds(12, 277, 599, -124);
		panel_2.add(tblFlights);
		
		table_1 = new JTable();
		table_1.setBounds(27, 155, 370, 157);
		panel_2.add(table_1);
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(24, 13, 150, 129);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\isa\\flightmanagement\\logos\\tavtech.jpg"));
		lblNewLabel.setBounds(0, 0, 150, 129);
		panel_3.add(lblNewLabel);
	}
}
