package level_3;

//https://www.acmicpc.net/problem/25314

import java.util.Scanner;

public class ROJ_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < (n/4); i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
