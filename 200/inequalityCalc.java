/*
 * inequalityCalc.java
 * Program 203
 * 9/26/2023
 * Ehan Haque
 * A program that takes three numbers and sorts them from biggest to smallest.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class inequalityCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.print("Ax + B > Cx + D\nA = ");
        double a = input.nextDouble();

        System.out.print("B = ");
        double b = input.nextDouble();

        System.out.print("C = ");
        double c = input.nextDouble();

        System.out.print("D = ");
        double d = input.nextDouble();

        double tempA = a - c;
        double tempD = d - b;
        double x = tempD / tempA;


        if (tempA == 0) {
             System.out.print(df.format(a) + "x ");

            if (b > 0) {
                System.out.print("+ " + df.format(b) + " > ");
            }
            else {
                System.out.print("- " + df.format(-(b)) + " > "); 
            } 

            System.out.print(df.format(c) + "x ");

            if (d > 0) {
                System.out.print("+ " + df.format(d));
            }
            else {
                System.out.print("- " + df.format(-(d)));
            }

            System.out.println("\t\tNo Solution");
        }
        else if (tempA > 0) {
            System.out.print(df.format(a) + "x ");

            if (b > 0) {
                System.out.print("+ " + df.format(b) + " > ");
            }
            else {
                System.out.print("- " + df.format(-(b)) + " > "); 
            } 

            System.out.print(df.format(c) + "x ");

            if (d > 0) {
                System.out.print("+ " + df.format(d));
            }
            else {
                System.out.print("- " + df.format(-(d)));
            }

            System.out.println("\t\tx > " + df.format(x));
        }

        else {
            System.out.print(df.format(a) + "x ");

            if (b > 0) {
                System.out.print("+ " + df.format(b) + " > ");
            }
            else {
                System.out.print("- " + df.format(-(b)) + " > "); 
            } 

            System.out.print(df.format(c) + "x ");

            if (d > 0) {
                System.out.print("+ " + df.format(d));
            }
            else {
                System.out.print("- " + df.format(-(d)));
            }

            System.out.println("\t\tx < " + df.format(x));
        }

             input.close();
        }
}


/*
Ax + B > Cx + D
A = 4
B = 8
C = 4
D = 2
4x + 8 > 4x + 2         No Solution
Ax + B > Cx + D
A = 67
B = -3
C = 7
D = 5
67x - 3 > 7x + 5                x > 0.13
Ax + B > Cx + D
A = 1
B = 8
C = 5 
D = -8
1x + 8 > 5x - 8         x < 4
Ax + B > Cx + D
A = 5
B = -2
C = 6
D = -8
5x - 2 > 6x - 8         x < 6
 */