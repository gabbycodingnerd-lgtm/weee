import java.util.Random;

public class Game {
    private int credits;
    private int tickets;
    private Random random;

    public Game() {
        this.credits = 0;
        this.tickets = 0;
        this.random = new Random();
    }

    public void addCredits(int amount) {
        if (amount > 0) {
            credits += amount;
        }
    }

    public void play() {
        if (credits > 0) {
            credits--;
            int earnedTickets = random.nextInt(10) + 1; // Earn between 1 and 10 tickets
            tickets += earnedTickets;
            System.out.println("You earned " + earnedTickets + " tickets!");
        } else {
            System.out.println("Not enough credits to play.");
        }
    }

    public int getTickets() {
        return tickets;
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.addCredits(5); // Add credits to play
        game.play();
        System.out.println("Total tickets: " + game.getTickets());
    }
}