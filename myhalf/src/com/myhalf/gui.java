package com.myhalf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;

public class gui {

	private JFrame frame;
	private JTextField txtIdentifiant;
	private JTextField txtMotDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui window = new gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 780, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 240, 240));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnDressing = new JButton("DRESSING");
		btnDressing.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnDressing.setBounds(327, 311, 439, 32);
		panel.add(btnDressing);
		
		JButton btnTendances = new JButton("TENDANCES");
		btnTendances.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnTendances.setBounds(327, 362, 439, 32);
		panel.add(btnTendances);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(100, 149, 237));
		panel_1.setBounds(0, 0, 159, 419);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		txtIdentifiant = new JTextField();
		txtIdentifiant.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtIdentifiant.setBounds(32, 105, 96, 19);
		panel_1.add(txtIdentifiant);
		txtIdentifiant.setText("Identifiant");
		txtIdentifiant.setColumns(10);
		
		txtMotDePasse = new JTextField();
		txtMotDePasse.setBounds(32, 148, 96, 19);
		panel_1.add(txtMotDePasse);
		txtMotDePasse.setText("Mot de passe");
		txtMotDePasse.setColumns(10);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		btnValider.setBounds(32, 211, 85, 21);
		panel_1.add(btnValider);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(47, 79, 79));
		panel_2.setBounds(159, 0, 607, 419);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblMyHalf = new JLabel("My Half");
		lblMyHalf.setBounds(229, 27, 174, 68);
		panel_2.add(lblMyHalf);
		lblMyHalf.setForeground(new Color(124, 252, 0));
		lblMyHalf.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 51));
		
		JButton btnMeteo = new JButton("METEO");
		btnMeteo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		btnMeteo.setBounds(169, 148, 438, 36);
		panel_2.add(btnMeteo);
		
		JButton btnCalendrier = new JButton("CALENDRIER");
		btnCalendrier.setBounds(169, 259, 438, 32);
		panel_2.add(btnCalendrier);
		btnCalendrier.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
		
		JButton btnProfil = new JButton("PROFIL");
		btnProfil.setBounds(169, 207, 439, 30);
		panel_2.add(btnProfil);
		btnProfil.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 29));
	}
}
