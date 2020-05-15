//package problem._1A;

import java.util.Scanner;

public class Theatre_Square {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();
            //determing how many flagstone will require to cover length
            long l = n / a;
            //determining flagstone alongside breadth
            long b = m / a;
            if (n % a != 0) {
                l++;
            }
            if (m % a != 0) {
                b++;
            }

            System.out.println(l * b);
        } catch (Exception e) {
        }
    }
}
