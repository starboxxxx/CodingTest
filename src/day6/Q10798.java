package day6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.max;

public class Q10798 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        char[][] array = new char[5][15];

        for(int i = 0; i<5; i++) {
            String s = br.readLine();
            max = max(max, s.length());
            for(int j = 0; j<s.length(); j++) {
                array[i][j] = s.charAt(j);
            }
        }

        for(int i=0; i<max; i++) {
            for(int j=0; j<5; j++) {
                if(array[i][j] == '\n') {
                    continue;
                }
                System.out.print(array[j][i]);
            }
        }

    }

}
