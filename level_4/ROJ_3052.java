package level_4;

//https://www.acmicpc.net/problem/3052

import java.util.Arrays;
import java.util.Scanner;

public class ROJ_3052 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[10];
        int count = 1;

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            intArr[i] = num % 42;
        }
        Arrays.sort(intArr);
        int keyValue = intArr[0];

        for (int i = 0; i < 10; i++) {
            if (intArr[i] > keyValue) {
                keyValue = intArr[i];
                count++;
            }
        }
        System.out.println(count);
    }

}
