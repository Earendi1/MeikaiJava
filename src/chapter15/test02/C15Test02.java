package chapter15.test02;

import java.util.Scanner;

public class C15Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++) {
            System.out.println(Integer.toHexString((int) s.charAt(i)));
        }
    }
}
