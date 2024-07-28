package level_4;

//https://www.acmicpc.net/problem/10811

import java.util.Scanner;

public class ROJ_10811 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] intArr = new int[n];
        int m = sc.nextInt();

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int startnum = sc.nextInt() - 1;
            int endnum = sc.nextInt() - 1;
            int times = endnum - startnum + 1;

            for (int j = 0; j < times / 2; j++) {
                int temp = intArr[startnum];
                intArr[startnum] = intArr[endnum];
                intArr[endnum] = temp;
                startnum++;
                endnum--;
            }
        }

        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }
}
