package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-output-formatting/problem

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String inputString = scanner.next();
            int inputInteger = scanner.nextInt();
            System.out.printf("%-15s%03d%n", inputString, inputInteger);
        }
        System.out.println("================================");
        scanner.close();
    }

}
