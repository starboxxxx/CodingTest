package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alpha = new int[26];

        String s = br.readLine();

        for(int i = 0; i < alpha.length; i++) {
            alpha[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (alpha[c - 'a'] == -1) {
                alpha[c - 'a'] = i;
            }
        }

        for(int i = 0; i < alpha.length; i++) {
            System.out.print(alpha[i] + " ");
        }

    }
}
