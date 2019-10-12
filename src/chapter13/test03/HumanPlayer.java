package chapter13.test03;

import java.util.Scanner;

public class HumanPlayer extends Player{
    public HumanPlayer(String gesture) {
        super(gesture);
    }

    public HumanPlayer() {
    }

    @Override
    public String getGesture() {
        return super.getGesture();
    }

    @Override
    public void setGesture(String gesture) {
        super.setGesture(gesture);
    }

    public String guess() {
        Scanner scanner = new Scanner(System.in);
        String g = scanner.toString();
        return g;
    }
}
