import com.gumball.GumBallMachine;

public class Main {
    public static void main(String[] args) {
        GumBallMachine gm = new GumBallMachine(1);
        gm.insertQuarter();
        gm.turnCrack();
        gm.insertQuarter();
    }
}
