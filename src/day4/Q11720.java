package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int total = 0;


        for(int i = 0; i < k; i++) {
            total += s.charAt(i) - '0';
        }
        System.out.println(total);
    }
}
