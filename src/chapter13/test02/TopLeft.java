package chapter13.test02;

public class TopLeft extends IsoscelesRightTriangle {

    public TopLeft(int length) {
        super(length);
    }

    public TopLeft() {
    }

    @Override
    public void draw() {
        for(int i = getLength(); i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}
