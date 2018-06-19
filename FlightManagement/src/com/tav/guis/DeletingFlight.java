package com.tav.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.tav.store.AddDeleteFlight;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeletingFlight extends JFrame {

	private JPanel contentPane;
	private JTextField textField_delete;
	
	private int deleteNum;
	public static String silinecek;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeletingFlight frame = new DeletingFlight();
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
	public DeletingFlight() {
		setTitle("Delete Flight");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteByFlight = new JLabel("Delete by Flight Number");
		lblDeleteByFlight.setBounds(57, 193, 148, 27);
		contentPane.add(lblDeleteByFlight);
		
		textField_delete = new JTextField();
		textField_delete.setBounds(240, 193, 64, 27);
		contentPane.add(textField_delete);
		textField_delete.setColumns(10);
		
		JButton btnNewButton = new JButton("Delete Flight");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteNum=Integer.parseInt(textField_delete.getText());
				silinecek="DELETE FROM flight WHERE flightno = "+deleteNum;
				AddDeleteFlight.wannaDelete();
				System.out.println(silinecek+" in the deleting flight");
			}
		});
		btnNewButton.setBounds(240, 233, 112, 34);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\isa\\flightmanagement\\logos\\tavlivesmile.jpg"));
		lblNewLabel.setBounds(142, 13, 226, 141);
		contentPane.add(lblNewLabel);
	}

}
