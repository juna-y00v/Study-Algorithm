package level_4;

//https://www.acmicpc.net/problem/10871

import java.util.Scanner;

public class ROJ_10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int value = sc.nextInt();

        sc.nextLine();
        String str = sc.nextLine();

        int count = 0;
        arr = str.split(" ");

        for (String s : arr) {
            if (value > Integer.parseInt(s)) {
                System.out.printf(s + " ");
            }
        }
    }
}
