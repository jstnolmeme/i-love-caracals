package org.example;

import org.example.GUIExample.GameTableFrame;
import org.example.Model.*;

public class GUI_Example {

	private Dealer dealer;
	private Player player;
	private GameTableFrame app;
	
	 //testing of game table UI
	public GUI_Example() {
       player = new Player("tester1","",10000);
       dealer = new Dealer();
	}
	
	public void run() {
		dealer.shuffleCards();
		app = new GameTableFrame(dealer,player);
	    app.run();
	}
	
	public static void main(String[] args) {
		new GUI_Example().run();
	}
}
