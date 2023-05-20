package org.example.GUIExample;

import java.awt.*;
import javax.swing.*;

import org.example.Model.*;

public class GameTablePanel extends JPanel {

	private Player player;
	private Dealer dealer;
	private ImageIcon cardBackImage;

	public GameTablePanel(Dealer dealer, Player player) {

		setBackground(Color.GREEN);
		setPreferredSize(new Dimension(1024, 768));

		cardBackImage = new ImageIcon("images/back.png");
		this.dealer = dealer;
		this.player = player;
	    
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		int x = 50;
		int y = 70;

		int i = 0;
		for (Card c : dealer.getCardsOnHand()) {
			// display dealer cards
			if (i == 0d) {
				cardBackImage.paintIcon(this, g, x, y);
				i++;

			} else {
				c.paintIcon(this, g, x, y);
			}

			x += 200;
		}

		// display player cards
		x = 50;
		y = 550;

		for (Card c : player.getCardsOnHand()) {
			// display dealer cards
			c.paintIcon(this, g, x, y);
			x += 200;
		}
	}
}
