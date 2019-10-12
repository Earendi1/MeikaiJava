package chapter13.test03;

public abstract class Player {
    private String gesture;

    public Player(String gesture) {
        this.gesture = gesture;
    }

    public Player() {
    }

    public String getGesture() {
        return gesture;
    }

    public void setGesture(String gesture) {
        this.gesture = gesture;
    }

}
