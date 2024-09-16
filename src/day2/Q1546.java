package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {

    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        int max = 0;
        int total = 0;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) {
                max = num;
            }
            total += num;
        }

        System.out.println(total * 100.0/max/N);
    }
}
