/*
 * inputComparer.java
 * Program 304
 * Ehan Haque
 * 10/16/2023
 * A program that takes two integers, checks if the first integer is larger than the second, and prints the ratio of the two integers.
 */

import java.util.Scanner;

public class inputComparer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers (larger first) -> ");
        int a = input.nextInt();
        int b = input.nextInt();

        // Checks if 'a' is less than 'b'.
        while (a < b) {
            System.out.print("Bogus entry. Try again (larger first). -> ");
            a = input.nextInt();
            b = input.nextInt();
        }

        for (int i = 2; i <= b; i++) {
            while (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
        }

        if (a == b && a != 0) {
            System.out.println("Ratio = 1");
        }
        else if (a == 0) {
            if (b == 0) {
                System.out.println("No ratio. (Divided by 0)");
            }
        }
        else {
        System.out.println("Ratio = " + a + "/" + b);
        }
        input.close();
    }
}

/*
Enter two integers (larger first) -> 56 4
Ratio = 14/1
Enter two integers (larger first) -> 3 7
Bogus entry. Try again (larger first). -> 6 4
Ratio = 3/2
Enter two integers (larger first) -> 5 0
No ratio. (Divided by 0)
Enter two integers (larger first) -> 56 48
Ratio = 7/6
 */