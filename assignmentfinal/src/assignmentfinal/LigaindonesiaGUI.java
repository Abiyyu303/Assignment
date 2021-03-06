package assignmentfinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LigaindonesiaGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LigaindonesiaGUI frame = new LigaindonesiaGUI();
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
	public LigaindonesiaGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("TABLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LigaindonesiaTable table = new LigaindonesiaTable();
				dispose();
				table.setVisible(true);
			}
		});
		btnNewButton.setBounds(193, 230, 105, 47);
		contentPane.add(btnNewButton);
		
		JButton btnPlayers = new JButton("PLAYERS");
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LigaindonesiaPlayers players = new LigaindonesiaPlayers();
				dispose();
				players.setVisible(true);
			}
		});
		btnPlayers.setBounds(398, 230, 105, 47);
		contentPane.add(btnPlayers);
		
		JButton btnMatches = new JButton("MATCHES");
		btnMatches.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LigaindonesiaMatches matches = new LigaindonesiaMatches();
				dispose();
				matches.setVisible(true);
			}
		});
		btnMatches.setBounds(193, 302, 105, 47);
		contentPane.add(btnMatches);
		
		JButton btnResults = new JButton("RESULTS");
		btnResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LigaindonesiaResults results = new LigaindonesiaResults();
				dispose();
				results.setVisible(true);
			}
		});
		btnResults.setBounds(398, 302, 105, 47);
		contentPane.add(btnResults);
		
		JButton btnNewButton_4 = new JButton("return");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				MainMenuSport.main(null);
			}
		});
		btnNewButton_4.setBounds(544, 384, 85, 21);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LigaindonesiaGUI.class.getResource("/Image/liga-shopee-_x300.png")));
		lblNewLabel.setBounds(193, -23, 321, 282);
		contentPane.add(lblNewLabel);
	}

}
