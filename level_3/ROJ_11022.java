package level_3;

//https://www.acmicpc.net/problem/11022

import java.io.*;
import java.util.StringTokenizer;

public class ROJ_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 1; i <= t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sum = a + b;

            bw.write(String.format("Case #%d: %d + %d = %d\n", i, a, b, sum));
        }
        bw.flush();
        bw.close();
    }
}
