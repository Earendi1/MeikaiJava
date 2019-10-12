package chapter13.test01;

public class HorzLine extends AbstLine {

    public HorzLine(int length) {
        super(length);
    }

    public HorzLine() {
    }

    @Override
    public String toString() {
        return "HorzLine{"+getLength()+"}";
    }

    @Override
    public void draw() {
        for(int i = 1; i <= getLength(); i++)
            System.out.print('-');
        System.out.println();
    }
}
