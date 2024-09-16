package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[N];


        for(int i=0; i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int i = 0; // Min
        int j = N - 1; // Max

        while (i < j) {
            if (A[i] + A[j] < M) {
                i++;
            }
            else if (A[i] + A[j] > M) {
                j--;
            }
            else {
                i++;
                j--;
                count += 1;
            }
        }

        System.out.print(count);
    }
}
