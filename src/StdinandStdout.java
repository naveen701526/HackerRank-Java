package src;
import java.util.*;

// problem statement: https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem

public class StdinandStdout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        System.out.println(input1);
        System.out.println(input2);
        System.out.println(input3);
        scanner.close();
    }
}
