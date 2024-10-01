package day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2444 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int k = num-2;

        String[] stars = new String[num];

        for(int i=1; i<=2*num-1; i++) {
            if (i<=num) {
                String s = " ";
                String repeatS = s.repeat(num-i);
                String star = "*";
                String repeatStar = star.repeat(1+2*(i-1));
                stars[i-1] = repeatS + repeatStar;
                System.out.println(stars[i-1]);
            }
            else {
                System.out.println(stars[k]);
                k -=1;
            }
        }
    }
}
