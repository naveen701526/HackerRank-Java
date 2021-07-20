package src;

import java.util.*;

// problem statment: https://www.hackerrank.com/challenges/java-if-else/problem

public class IfElse {

    public static void main(String[] args) {
        String ans = "";
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 1 || (n >= 6 && n <= 20)) {
            ans = "Weird";
        } else {
            ans = "Not Weird";
        }
        System.out.println(ans);
        scanner.close();
    }
}
