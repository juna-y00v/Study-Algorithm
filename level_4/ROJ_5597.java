package level_4;

//https://www.acmicpc.net/problem/5597

import java.util.Arrays;
import java.util.Scanner;

public class ROJ_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArr = new int[30];
        Arrays.fill(intArr, 0);

        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            intArr[a - 1] = 1;
        }

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
