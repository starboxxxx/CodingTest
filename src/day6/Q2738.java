package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2738 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] array = new int[a][b];

        for(int i=0; i<a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++) {
                array[i][j] += Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<a; i++) {
            for (int j=0; j<b; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
