package level_4;

//https://www.acmicpc.net/problem/10807

import java.util.Scanner;

public class ROJ_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        sc.nextLine();
        String str = sc.nextLine();
        int value = sc.nextInt();

        int count = 0;
        arr = str.split(" ");

        for (String s : arr) {
            if (String.valueOf(value).equals(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
