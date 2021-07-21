package src;

import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-static-initializer-block/problem

public class StaticInitializerBlock {
    static Scanner scanner = new Scanner(System.in);
    static int breadth = scanner.nextInt();
    static int height = scanner.nextInt();
    static boolean flag = true;
    static {
        try {
            if (breadth <= 0 || height <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            System.out.printf("%d", breadth * height);
        }
    }
}
