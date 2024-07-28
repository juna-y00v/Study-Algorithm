package level_4;

//https://www.acmicpc.net/problem/10818

import java.util.Scanner;

public class ROJ_10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        arr[0] = sc.nextInt();
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
