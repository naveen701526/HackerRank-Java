package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-loops-multiplier/problem

public class JavaLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int multiplicand = scanner.nextInt();

        for (int multiplier = 1; multiplier <= 10; multiplier++) {

            System.out.printf("%d x %d = %d%n", multiplicand, multiplier, multiplicand * multiplier);
        }
        scanner.close();
    }
}
