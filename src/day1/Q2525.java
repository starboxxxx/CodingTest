package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2525 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int add = Integer.parseInt(br.readLine());

        int addH = add / 60;
        int addM = add % 60;

        H += addH;
        M += addM;

        if (M >= 60) {
            M -= 60;
            H += 1;
        }

        if (H >= 24) {
            H -= 24;
        }

        System.out.printf("%d %d", H, M);
    }
}
