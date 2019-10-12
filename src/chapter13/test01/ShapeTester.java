package chapter13.test01;

import java.util.Scanner;

public class ShapeTester {

    private static Shape addPoint() {
        return new Point();
    }

    private static Shape addHorzLine(int h) {
        return new HorzLine(h);
    }

    private static Shape addVertLine(int v) {
        return new VertLine(v);
    }

    private static Shape addRectangle(int x, int y) {
        return new Rectangle(x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("图形的个数：");
        int nums = scanner.nextInt();
        Shape[] p= new Shape[nums];
        for(int i = 0; i < nums; i++) {
            System.out.print(i + 1 + "号图形的种类（1-点/2-横线/3-竖线/4-长方形）：");
            int key = scanner.nextInt();
            switch (key) {
                case 1:
                    p[i] = ShapeTester.addPoint();
                    break;
                case 2:
                    System.out.print("长度：");
                    int l = scanner.nextInt();
                    p[i] = ShapeTester.addHorzLine(l);
                    break;
                case 3:
                    System.out.print("长度：");
                    int h = scanner.nextInt();
                    p[i] = ShapeTester.addVertLine(h);
                    break;
                case 4:
                    System.out.print("长：");
                    int x = scanner.nextInt();
                    System.out.print("宽：");
                    int y = scanner.nextInt();
                    p[i] = ShapeTester.addRectangle(x, y);
                    break;
            }
        }

        for(Shape s : p) {
            s.print();
            System.out.println();
        }
    }
}
