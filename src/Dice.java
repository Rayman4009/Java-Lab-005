import java.util.Random;

public class Dice {
    private int sideFacingUp;
    private int sides;
    private Random randomGenerator;

    // Constructor
    public Dice(int sides) {
        this.sides = sides;
        this.randomGenerator = new Random()
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
