package ch13;

import java.util.Scanner;

public class ConitionTest {

    public static void main(String[] args) {

        int max;
        System.out.println("input Text\n");

        Scanner scanner = new Scanner(System.in);

        System.out.println("input 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("input 2: ");
        int num2 = scanner.nextInt();

        max = (num1 > num2)? num1 : num2;
        System.out.println(max);
    }
}
