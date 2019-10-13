package chapter13.test01;

import chapter14.test01.Plane2D;

public class Rectangle extends Shape implements Plane2D {
    private int widch;
    private int height;

    public Rectangle(int widch, int height) {
        this.widch = widch;
        this.height = height;
    }

    public Rectangle() {
    }

    public int getWidch() {
        return widch;
    }

    public void setWidch(int widch) {
        this.widch = widch;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "widch=" + widch +
                ", height=" + height +
                '}';
    }

    @Override
    public void draw() {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j <= widch; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    @Override
    public int getArea() {
        return widch * height;
    }
}
