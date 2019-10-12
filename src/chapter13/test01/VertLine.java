package chapter13.test01;

public class VertLine extends AbstLine {
    public VertLine(int length) {
        super(length);
    }

    public VertLine() {
    }

    @Override
    public String toString() {
        return "VertLine{"+getLength()+"}";
    }

    @Override
    public void draw() {
        for(int i = 0; i < getLength(); i++)
            System.out.println('|');
    }
}
