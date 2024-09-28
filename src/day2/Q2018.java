package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 투포인터 문제
 * sum > N -> sum - start_index, start_index++
 * sum < N -> end_index++, sum + end_index</>
 * sum == N -> end_index++, sum = sum + end_index, count++
 */


public class Q2018 {


    public static void main(String[] args) throws IOException {
        /**
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        long[] total = new long[N + 1];

        int count = 0;

        for(int i=1; i<=N; i++) {
            total[i] = total[i-1] + i;
        }

        for(int a=1; a<=N; a++) {
            for(int b=1; b<=N; b++) {
                if (total[b] - (total[a-1]) == N) {
                    count += 1;
                }
            }
        }

        System.out.println(count);
        **/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int count = 1;

        int start_index = 1;

        int end_index = 1;

        int sum = 0;

        while (end_index != N) {
            if (sum == N) {
                count ++;
                end_index ++;
                sum += end_index;
            }
            else if(sum > N) {
                sum -= start_index;
                start_index++;
            }
            else {
                end_index++;
                sum += end_index;
            }

            System.out.println(count);
        }

    }
}
