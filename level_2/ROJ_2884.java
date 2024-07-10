package level_2;

//https://www.acmicpc.net/problem/2884

import java.util.Scanner;

public class ROJ_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else if (h != 0) {
            System.out.println((h - 1) + " " + (m + 15));
        } else
            System.out.println(23 + " " + (m + 15));
    }
}
