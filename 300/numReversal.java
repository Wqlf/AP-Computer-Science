/*
 * numReversal.java
 * Program 302
 * Ehan Haque
 * 10/16/2023
 * A program that takes in a three digit number, reverses the order of the digits, and sums the digits.
 */

import java.util.Scanner;

public class numReversal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter three digit number -> ");
            int num = input.nextInt();

            // Checks if input is a three digit number.
            while (num < 100 || num > 999) {
                System.out.print("That is an invalid input! Try again (100 - 999). -> ");
                num = input.nextInt();
            }

            // Finds each digit if 'num'
            int firstDigit = num / 100;
            int secondDigit = (num / 10) % 10;
            int thirdDigit = (num % 100) % 10;

            System.out.println(num + " -> " + thirdDigit + secondDigit + firstDigit + "\tThe sum of the digits is " + (firstDigit + secondDigit + thirdDigit));

        }
        input.close();
    }
}

/*
Enter three digit number -> 3056
That is an invalid input! Try again (100 - 999). -> 99
That is an invalid input! Try again (100 - 999). -> 504
504 -> 405      The sum of the digits is 9
Enter three digit number -> 406
406 -> 604      The sum of the digits is 10
Enter three digit number -> 5843
That is an invalid input! Try again (100 - 999). -> 454
454 -> 454      The sum of the digits is 13
Enter three digit number -> 634
634 -> 436      The sum of the digits is 13
Enter three digit number -> 753
753 -> 357      The sum of the digits is 15
 */