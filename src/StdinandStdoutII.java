package src;

import java.util.*;

// problem statment: https://www.hackerrank.com/challenges/java-stdin-stdout/problem

public class StdinandStdoutII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        double fractionalValue = scanner.nextDouble();
        scanner.nextLine();
        String stringValue = scanner.nextLine();

        scanner.close();
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + fractionalValue);
        System.out.println("Int: " + integer);
        
    }

}
