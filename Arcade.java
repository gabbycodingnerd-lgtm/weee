package arcade;

/**
 * This class tests the features of the other classes
 * DO NOT MODIFY THIS CLASS
 * If something doesn't work properly, the problem is
 * in another class, no this one.
 */
public class Arcade {
 
    /**
     * Runs the tests on the arcade classes by creating cards, games and 
     * terminals and using them to simulate arcade play.
     * @param args
     */
    public static void main(String[] args) {
       // Create a terminal
        Terminal terminal = new Terminal(25, 15, 5);
        
        // Create two cards
        Card card1 = new Card();
        Card card2 = new Card();
        
        // Create a game
        Game game = new Game(2);
        
        // Add credits to cards
        terminal.purchaseCredits(card1, 5);
        terminal.purchaseCredits(card2, 3);
        

        // play two games on card 1
        game.playGame(card1);
        game.playGame(card1);
        
        // play 4 games on card 2 - Should run out of credits
        for (int i = 0; i < 4; i++){
            game.playGame(card2);
        }
        
        // check balances on each card
        System.out.println("\nChecking Balances...");
        terminal.checkBalance(card1);
        terminal.checkBalance(card2);
        
        
        // Transfer all credits and balances to the second card
        terminal.transferCreditBalance(card1, card2);
        terminal.transferTicketBalance(card1, card2);
        
        // Buy as many prizes as we can
        terminal.purchasePrizes(card2);
        
        //Try to play a game with an empty card.
        game.playGame(card1);
    }
    
}
