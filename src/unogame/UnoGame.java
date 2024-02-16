/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unogame;

/**
 *
 * @author amrinder
 * editor Gurkirat Singh
 and lovish 
 */
// License and template information can be customized as needed.


// Main class to start and manage the Uno card game.
public class UnoGame {

    public static void main(String[] args) {
        UnoGame game = new UnoGame();
        game.startGame();
    }

    // Begins and controls the flow of the Uno game.
    public void startGame() {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Each player draws 7 cards initially.
        for (int i = 0; i < 7; i++) {
            player1.pickCard(deck);
            player2.pickCard(deck);
        }
        // Game logic continues...
    }
}


