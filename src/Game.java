import java.util.Scanner;
import java.util.Random;
public class Game {

    Player p1;
    Player p2;
    Dice die;

    public class Dice {
        private int sideFacingUp;
        private int sides;
        private Random randomGenerator = new Random();

        // Constructor
        public Dice(int sides) {
            this.sides = sides;
            // this is a keyword for "this" object that's being created.
        }
        public void Roll (int sides) {
            sideFacingUp = randomGenerator.nextInt(1,sides);
        }
        public void View(){
            System.out.println(sideFacingUp);
        }
    }
    Dice d1 = new Dice(6);
    Dice d2 = new Dice(20);
    public class Player {
        private String name;
        private int score;

        //Constructor
        public Player(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public int getScore() {
            return this.score;
        }
        public void toss(int number) {
            this.score +=
        }
    }
    public void play() {
    }

    public Player nextPlayer(Player current) {
    }

    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
