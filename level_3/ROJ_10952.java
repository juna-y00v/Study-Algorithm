package level_3;

//https://www.acmicpc.net/problem/10952

import java.util.Scanner;

public class ROJ_10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            } else {
                System.out.println(a + b);
            }
        }
    }
}
