package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        char[] c = k.toCharArray();
        int i = Integer.parseInt(br.readLine());
        System.out.println(c[i-1]);
    }
}
