package level_2;

//https://www.acmicpc.net/problem/2525

import java.util.Scanner;

public class ROJ_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        if (m + (c % 60) >= 60) {
            h++;
            m = (m + (c % 60)) % 60;
        } else {
            m += (c % 60);
        }

        if (h + (c / 60) >= 24) {
            h += (c / 60);
            h %= 24;
        } else {
            h += (c / 60);
        }
        System.out.println(h + " " + m);
    }
}
