# Assn 3

## 1. Objectives:
On completion of this assignment a student should be able to write a Java application that:
* Makes use of Java API "Swing" and "AWT" packages
* Handle generated events
* Makes use of layout manager to organize the GUI components
* Know how to apply and design a program using object-oriented concepts

## 2. Tasks:
Enhance the one player java game "HighSum" with GUI components. The game is played as follows:
### 2.1 Login
The game starts by the player logging into the game.


### 2.2 Play Game
The game starts after the player click on “Login”.
First, the dealer will shuffle the deck.
(You may include animation in this frame to simulate “shuffle” effect as enhancement.)

Then the dealer deals two cards from the top of the deck to the player and itself.
Since the player’s last card is higher than the dealer’s last card, the player gets to Call the game.

Assume the player states 10 as the bet chips. The player’s chip will be deducted by 10.

The chips on table will be updated to 20 and the dealer deals cards for next round.
Assume the dealer’s last card is higher than the player’s last card.
The dealer Call the game and the player gets to choose to Follow or Quit the game.
If the player follows the game, 10 chips will be deducted from the player’s balance chips.
(Assume the dealer place 10 chips.)

The games carry on for maximum of four rounds.
In the last round, the player with the highest total sum wins the game.

And the game continues until the player exits the game.

### Error Handling
Your program should be able to handle error situations like where a player enter wrong password or has insufficient chips.
You should look out for other possible exceptions and handle them too.
