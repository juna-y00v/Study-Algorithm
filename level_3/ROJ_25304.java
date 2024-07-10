package level_3;

//https://www.acmicpc.net/problem/25304

import java.util.Scanner;

public class ROJ_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int price = sc.nextInt();
            int quantity = sc.nextInt();

            sum += (price * quantity);
        }

        if (total == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
