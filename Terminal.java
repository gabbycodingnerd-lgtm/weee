package arcade;

/**
 * Terminal class represents an arcade terminal that manages card operations
 */
public class Terminal {
    private int smallPrizeTickets;
    private int mediumPrizeTickets;
    private int largePrizeTickets;
    
    /**
     * Constructor creates a terminal with prize ticket requirements
     */
    public Terminal(int largePrizeTickets, int mediumPrizeTickets, int smallPrizeTickets) {
        this.largePrizeTickets = largePrizeTickets;
        this.mediumPrizeTickets = mediumPrizeTickets;
        this.smallPrizeTickets = smallPrizeTickets;
    }
    
    /**
     * Purchases credits for a card at 2 credits per dollar
     */
    public void purchaseCredits(Card card, int dollars) {
        int creditsToAdd = dollars * 2;
        card.setCredits(card.getCredits() + creditsToAdd);
        System.out.println("\nPurchased " + creditsToAdd + " credits for " + dollars + " dollars on card #" + card.getCardNumber());
        System.out.println("Card #" + card.getCardNumber() + " has " + card.getCredits() + " credits and " + card.getTickets() + " tickets remaining.");
    }
    
    /**
     * Checks and prints the balance of a card
     */
    public void checkBalance(Card card) {
        System.out.println("Card #" + card.getCardNumber() + " has " + card.getCredits() + " credits and " + card.getTickets() + " tickets remaining.");
    }
    
    /**
     * Transfers credit balance from one card to another
     */
    public void transferCreditBalance(Card fromCard, Card toCard) {
        int creditsToTransfer = fromCard.getCredits();
        fromCard.setCredits(0);
        toCard.setCredits(toCard.getCredits() + creditsToTransfer);
        System.out.println("\nCredit balance of " + creditsToTransfer + " transfered from card #" + fromCard.getCardNumber() + " to card #" + toCard.getCardNumber() +.
        System.out.println("Card #" + fromCard.getCardNumber() + " has " + fromCard.getCredits() + " credits and " + fromCard.getTickets() + " tickets remaining.");
        System.out.println("Card #" + toCard.getCardNumber() + " has " + toCard.getCredits() + " credits and " + toCard.getTickets() + " tickets remaining.");
    }
    
    /**
     * Transfers ticket balance from one card to another
     */
    public void transferTicketBalance(Card fromCard, Card toCard) {
        int ticketsToTransfer = fromCard.getTickets();
        fromCard.setTickets(0);
        toCard.setTickets(toCard.getTickets() + ticketsToTransfer);
        System.out.println("\nTicket balance of " + ticketsToTransfer + " transfered from card #" + fromCard.getCardNumber() + " to card #" + toCard.getCardNumber() +.
        System.out.println("Card #" + fromCard.getCardNumber() + " has " + fromCard.getCredits() + " credits and " + fromCard.getTickets() + " tickets remaining.");
        System.out.println("Card #" + toCard.getCardNumber() + " has " + toCard.getCredits() + " credits and " + toCard.getTickets() + " tickets remaining.");
    }
    
    /**
     * Purchases prizes with tickets from a card
     * Maximizes large prizes first, then medium, then small
     */
    public void purchasePrizes(Card card) {
        int largePrizes = 0;
        int mediumPrizes = 0;
        int smallPrizes = 0;
        int ticketsRemaining = card.getTickets();
        
        // Buy large prizes first
        largePrizes = ticketsRemaining / largePrizeTickets;
        ticketsRemaining -= largePrizes * largePrizeTickets;
        
        // Buy medium prizes
        mediumPrizes = ticketsRemaining / mediumPrizeTickets;
        ticketsRemaining -= mediumPrizes * mediumPrizeTickets;
        
        // Buy small prizes
        smallPrizes = ticketsRemaining / smallPrizeTickets;
        ticketsRemaining -= smallPrizes * smallPrizeTickets;
        
        // Update card tickets
        card.setTickets(ticketsRemaining);
        
        System.out.println("\nYou have purchased:");
        System.out.println(largePrizes + " large prize(s)");
        System.out.println(mediumPrizes + " medium prize(s)");
        System.out.println(smallPrizes + " small prize(s)");
        System.out.println("Card #" + card.getCardNumber() + " has " + card.getCredits() + " credits and " + card.getTickets() + " tickets remaining.");
    }
    
    /**
     * Returns a string representation of the terminal
     */
    @Override
    public String toString() {
        return "Terminal Created";
    }
}