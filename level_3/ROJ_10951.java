package level_3;

//https://www.acmicpc.net/problem/10951

import java.util.Scanner;

public class ROJ_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();
            if (s.isEmpty()) {
                break;
            } else {
                int a = Integer.parseInt(s.substring(0, 1));
                int b = Integer.parseInt(s.substring(2, 3));
                System.out.println(a + b);
            }
        }
    }
}
