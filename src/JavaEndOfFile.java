package src;

import java.util.*;

// Problem Statement: https://www.hackerrank.com/challenges/java-end-of-file/problem

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        while (scanner.hasNext()) {
            System.out.println(i + " " + scanner.nextLine());
            i++;

        }
        scanner.close();
    }
}