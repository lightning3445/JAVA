import java.util.*;

public class range {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i ++) {  // Only odd numbers from 51 to 100
            int count = 0;  // To count divisors

            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    count++;  // Increment count if a divisor is found
                    break;     // No need to check further if a divisor is found
                }
            }

            // If count is 0, it means no divisors were found, so the number is prime
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}