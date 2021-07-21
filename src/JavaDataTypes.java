package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-datatypes/problem

public class JavaDataTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {

            try {
                long inputValue = scanner.nextLong();
                System.out.println(inputValue + " can be fitted in:");
                if (inputValue >= -128 && inputValue <= 127)
                    System.out.println("* byte");

                if (inputValue >= -Math.pow(2, 15) && inputValue <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if (inputValue >= -Math.pow(2, 31) && inputValue <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if (inputValue >= -Math.pow(2, 63) && inputValue <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
        scanner.close();
    }
}