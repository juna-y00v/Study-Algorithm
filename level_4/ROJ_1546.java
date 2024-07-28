package level_4;

//https://www.acmicpc.net/submit/1546

import java.util.Scanner;

public class ROJ_1546 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        int max = 0;
        double total = 0;

        for (int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        for (int i = 0; i < scores.length; i++) {
            total += (double) scores[i] / max * 100;
        }

        System.out.println(total / n);
    }
}
