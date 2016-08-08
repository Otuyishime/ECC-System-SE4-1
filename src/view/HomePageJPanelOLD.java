package ecc_UI;

import java.awt.Font;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomePageJPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public HomePageJPanel(JFrame currentFrame) {
		
		setBounds(new Rectangle(0, 0, 1100, 700));
		setLayout(null);
		
		JLabel lblHomePage = new JLabel("Welcome to the ECC Home Page. Use the Menu for more options");
		lblHomePage.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblHomePage.setBounds(225, 83, 600, 40);
		add(lblHomePage);

	}
}
