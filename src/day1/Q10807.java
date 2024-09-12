package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr1 = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr1.length; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());
        int count = 0;

        for(int j =0; j < arr1.length; j++) {
            if (b == arr1[j]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
