package chapter13.test03;

import java.util.Scanner;

public class FingerGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player human = new HumanPlayer();
        Player cpu = new ComputerPlayer();
        System.out.print("输入要出的手势：");
        human.setGesture(scanner.nextLine());
        System.out.print("电脑的手势：");
        System.out.println(cpu.getGesture());
    }
}
