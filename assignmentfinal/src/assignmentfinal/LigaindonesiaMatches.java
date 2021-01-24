package assignmentfinal;



import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LigaindonesiaMatches extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eplMatches frame = new eplMatches();
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
	public LigaindonesiaMatches() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 269, 198);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Persija", "0200", "Bali united"},
				{"Persib", "0200", "Borneo Fc"},
				{"Arema", "0415", "Makassar FC"},
				{"Bonek", "0415", "Jayapura"},
				{"Sriwijaya", "0415", "Aceh United"},
			},
			new String[] {
				"HOME", "time", "AWAY"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("return");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				dispose();
				LigaindonesiaGUI.main(null);
			}
		});
		btnNewButton.setBounds(194, 242, 85, 21);
		contentPane.add(btnNewButton);
	}

}
