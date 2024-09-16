package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11659 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] num = new int[N+1];

        int[] total = new int[N+1];

        st = new StringTokenizer(br.readLine());

        num[1] = Integer.parseInt(st.nextToken());
        total[1] = num[1];

        for(int i=2; i<=N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
            total[i] = total[i-1] + num[i];
        }

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            System.out.println(total[b] - total[a-1]);
        }
    }
}
