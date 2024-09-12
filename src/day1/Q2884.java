package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());


        b -= 45;


        if (b < 0) {
            b += 60;
            a -= 1;
            if (a < 0) {
                a += 24;
            }
        }
        System.out.printf("%d %d", a, b);
    }
}
