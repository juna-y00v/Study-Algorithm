package level_2;

//https://www.acmicpc.net/problem/1330

import java.util.Scanner;

public class ROJ_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("==");
        } else System.out.println("<");
    }

    public static class ROJ_2480 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b) {
                if (b == c) {
                    System.out.println(10000 + a * 1000);
                } else {
                    System.out.println(1000 + a * 100);
                }
            } else if (a == c) {
                System.out.println(1000 + a * 100);
            } else if (b == c) {
                System.out.println(1000 + b * 100);
            } else {
                if (a > b && a > c)
                    System.out.println(100 * a);
                if (b > a && b > c)
                    System.out.println(100 * b);
                if (c > a && c > b)
                    System.out.println(100 * c);
            }
        }
    }
}
