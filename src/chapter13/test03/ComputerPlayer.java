package chapter13.test03;

import java.util.Random;

public class ComputerPlayer extends Player {
    public ComputerPlayer(String gesture) {
        super(gesture);
    }

    public ComputerPlayer() {
    }

    @Override
    public String getGesture() {
        Random random = new Random();
        int key = random.nextInt(3);
        switch (key) {
            case 0:
                return "石头";
            case 1:
                return "剪刀";
            case 2:
                return "布";
        }
        return "";
    }
}
