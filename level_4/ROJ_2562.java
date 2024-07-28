package level_4;

//https://www.acmicpc.net/problem/2562

import java.util.Scanner;

public class ROJ_2562 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArr = new int[9];
        int max = 0;
        int maxlocation = 0;

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextInt();
            if (intArr[i] > max) {
                max = intArr[i];
                maxlocation = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(maxlocation);
    }
}
