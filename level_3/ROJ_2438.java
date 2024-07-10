package level_3;

//https://www.acmicpc.net/problem/2439

import java.io.*;

public class ROJ_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int a = 1;
        int b = 1;

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= t - i; j++) {
                bw.write(" ");
            }
            for (int k = 1; k <= i; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
