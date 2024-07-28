package level_4;

//https://www.acmicpc.net/problem/10813

import java.util.Scanner;

public class ROJ_10813 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int temp;
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            temp = intArr[a];
            intArr[a] = intArr[b];
            intArr[b] = temp;
        }

        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
