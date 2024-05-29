package br.com.guitest.bean;

import javax.swing.*;
import java.awt.*;

public class guiTest extends JFrame {
	public guiTest() {

		setTitle("Test");
		setVisible(true);
		setSize(650, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);

		JButton jbutton = new JButton("Clique aqui");
		jbutton.setBounds(100, 200, 250, 70);
		Font font = new Font("Arial", Font.BOLD, 40);
		jbutton.setFont(font);
		jbutton.setForeground(new Color(255, 255, 255));
		jbutton.setBackground(new Color(9, 9, 9));


		add(jbutton);

	}
}
