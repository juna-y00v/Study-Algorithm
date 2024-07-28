package level_4;

//https://www.acmicpc.net/problem/10810

import java.util.Arrays;
import java.util.Scanner;

public class ROJ_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 0;
        }

        for (int i = 0; i < m; i++) {
            int fromIndex = sc.nextInt() - 1;
            int toIndex = sc.nextInt();
            int value = sc.nextInt();
            Arrays.fill(intArr, fromIndex, toIndex, value);
        }

        for (int i : intArr) {
            System.out.print(i + " ");
        }

    }
}
