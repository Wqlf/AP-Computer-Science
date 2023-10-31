/*
 * intLCM.java
 * Program 3x2
 * Ehan Haque
 * 10/17/2023
 * A program that takes in three integers and takes the LCM of them.
 */

import java.util.Scanner;

public class intLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Enter three integers -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        while (a == 0 || b == 0 || c == 0) {
            if (a == 0) {
                System.out.print("Your first integer is invalid. Please enter another integer (Cannot be 0) -> ");
                a = input.nextInt();
            }
            if (b == 0) {
                System.out.print("Your second integer is invalid. Please enter another integer (Cannot be 0) -> ");
                b = input.nextInt();
            }
            if (c == 0) {
                System.out.print("Your third integer is invalid. Please enter another integer (Cannot be 0) -> ");
                c = input.nextInt();
            }
        }

        // Finds the GCD of 'a' and 'b'
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        // Finds the GCD of the GCD of 'a' and 'b', and 'c'
        int tempLCM = (a * b) / gcd;
        int lcm = 1;
        for (int i = 1; i <= tempLCM && i <= c; i++) {
            if (tempLCM % i == 0 && c % i == 0) {
                lcm = i;
            }
        }

        // LCM equation
        lcm = (tempLCM * c) / lcm;

        System.out.println("The LCM of " + a + ", " + b + ", and " + c + " is " + lcm);

        input.close();
    }
}

/*
Enter three integers -> 4 10 5
The LCM of 4, 10, and 5 is 20
Enter three integers -> 7 35 70
The LCM of 7, 35, and 70 is 70
Enter three integers -> 15 23 75 
The LCM of 15, 23, and 75 is 1725
Enter three integers -> 19 11 7
The LCM of 19, 11, and 7 is 1463
Enter three integers -> 0 5 0
Your first integer is invalid. Please enter another integer (Cannot be 0) -> 7
Your third integer is invalid. Please enter another integer (Cannot be 0) -> 2
The LCM of 7, 5, and 2 is 70
Enter three integers -> 0 0 0
Your first integer is invalid. Please enter another integer (Cannot be 0) -> 1
Your second integer is invalid. Please enter another integer (Cannot be 0) -> 2
Your third integer is invalid. Please enter another integer (Cannot be 0) -> 3
The LCM of 1, 2, and 3 is 6
 */