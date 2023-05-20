package org.example;

import org.example.Controller.GameController;
import org.example.Model.Dealer;
import org.example.Model.Player;
import org.example.View.ViewController;

public class HighSum {

	private Dealer dealer;
	private Player player;
	private ViewController view;
    private GameController gc;
    
    public HighSum() {
    	//create all the required objects
    	this.dealer = new Dealer();
        this.player = new Player("IcePeak","password",50);
        this.view = new ViewController();
        //bring them together
    	this.gc = new GameController(this.dealer,this.player,this.view);
    }
	
    public void run() {
    	//starts the game!
    	gc.run();
    }
    
	public static void main(String[] args) {
	    new HighSum().run();
	}

}
