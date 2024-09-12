package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2480 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int Z = Integer.parseInt(st.nextToken());

        if (X == Y && Y == Z) {
            System.out.println(10000 + (X * 1000));
        }
        else if (X == Y) {
            System.out.println(1000 + X * 100);
        }

        else if (Y == Z) {
            System.out.println(1000 + Y * 100);
        }

        else if (X == Z) {
            System.out.println(1000 + Z * 100);
        }

        else {
            int result = (X > Y) ? X : Y;
            int answer = (result > Z) ? result : Z;
            System.out.println(answer * 100);
        }
    }
}
