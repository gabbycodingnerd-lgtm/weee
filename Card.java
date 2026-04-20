package arcade;

/**
 * Card class represents a game card that stores credits and tickets
 */
public class Card {
    private static int nextCardNumber = 1;
    private int cardNumber;
    private int credits;
    private int tickets;
    
    /**
     * Constructor creates a new card with a unique card number
     */
    public Card() {
        this.cardNumber = nextCardNumber++;
        this.credits = 0;
        this.tickets = 0;
    }
    
    /**
     * Gets the card number
     */
    public int getCardNumber() {
        return cardNumber;
    }
    
    /**
     * Gets the current credit balance
     */
    public int getCredits() {
        return credits;
    }
    
    /**
     * Sets the credit balance
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }
    
    /**
     * Gets the current ticket balance
     */
    public int getTickets() {
        return tickets;
    }
    
    /**
     * Sets the ticket balance
     */
    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
    
    /**
     * Returns a string representation of the card
     */
    @Override
    public String toString() {
        return "Card #" + cardNumber + " has " + credits + " credits and " + tickets + " tickets remaining.";
    }
}