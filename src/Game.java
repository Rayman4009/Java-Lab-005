import java.util.Scanner;
import java.util.Random;
public class Game {

    Player p1;
    Player p2;
    Dice die;


    }
    public void play() {
        Player current = p1;
        takeTurn(p1);
        takeTurn(p2);

        System.out.println(announceWinner());
    }

    public Player nextPlayer(Player current) {
        if (current == this.p1) {
            return.this.p2;
        } else {
            return.this.p2
        }
    }
    public void takeTurn(Player player) {
        player.toss(this.die);
    }

    public String announceWinner() {
    }

}
