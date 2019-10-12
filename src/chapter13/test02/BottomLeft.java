package chapter13.test02;

public class BottomLeft extends IsoscelesRightTriangle {

    public BottomLeft(int length) {
        super(length);
    }

    public BottomLeft() {
    }

    @Override
    public void draw() {
        for(int i = 0; i < getLength(); i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
