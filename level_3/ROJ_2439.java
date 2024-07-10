package level_3;

//https://www.acmicpc.net/problem/2438

import java.io.*;

public class ROJ_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= i; j++) {
                bw.write("");
            }
            bw.write("");
        }
        bw.flush();
        bw.close();

    }
}
