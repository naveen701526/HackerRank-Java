package src;

import java.time.LocalDate;
import java.util.*;
// problem statement: https://www.hackerrank.com/challenges/java-date-and-time/problem

public class JavaDateTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] timeLine = scanner.nextLine().split(" ", 3);
        int month = Integer.parseInt(timeLine[0]);
        int day = Integer.parseInt(timeLine[1]);
        int year = Integer.parseInt(timeLine[2]);

        String res = LocalDate.of(year, month, day).getDayOfWeek().name();
        System.out.println(res);
        scanner.close();

    }
}
