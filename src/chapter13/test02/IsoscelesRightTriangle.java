package chapter13.test02;

import chapter13.test01.Shape;

public abstract class IsoscelesRightTriangle extends Shape {
    private int length;

    public IsoscelesRightTriangle(int length) {
        this.length = length;
    }

    public IsoscelesRightTriangle() {
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "IsoscelesRightTriangle{" +
                "length=" + length +
                '}';
    }
}
