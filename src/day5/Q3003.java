package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] original = {1, 1, 2, 2, 2, 8};

        int[] now = new int[6];

        for(int i = 0; i<6; i++) {
            now[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i<6; i++) {
            System.out.print(original[i] - now[i] + " ");
        }
    }
}
