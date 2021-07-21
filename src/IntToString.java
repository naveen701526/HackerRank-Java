package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-int-to-string/problem

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String convertedString = Integer.toString(input);
        System.out.printf("%-15s%3s%n", convertedString.getClass().getSimpleName(), convertedString);
        scanner.close();

    }
}
