/*
 * operations.java
 * Program 102
 * Ehan Haque
 * 9/1/23
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class operations
   {
      public static void main(String[] args)
         {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.000");

            System.out.println("\nWhat's your first number?");
            int num1 = input.nextInt();

            System.out.println("\nWhat's your second number?");
            int num2 = input.nextInt();

            System.out.println(
            "\nAdditon:        | " + (num1 + num2) + "\n" +
            "Subtraction:    | " + (num1 - num2) + "\n" +
            "Multiplication: | " + (num1 * num2) + "\n" +
            "Division:       | " + (num1 / num2) + "\n" +
            "Remainder:      | " + (num1 % num2) + "\n"
            );

            System.out.println("\nWhat's your first double?");
            double db1 = input.nextDouble();

            System.out.println("What's your second double?");
            double db2 = input.nextDouble();

            System.out.println(
            "\nAddition:       | " + df.format((db1 + db2)) + "\n" + 
            "Subtraction:    | " + df.format((db1 - db2)) + "\n" +
            "Multiplication: | " + df.format((db1 * db2)) + "\n" +
            "Division:       | " + df.format((db1 / db2)) + "\n" +
            "Remainder:      | " + df.format((db1 % db2))
            );

            input.close();
         }
      }

/*
 What's your first number?
10
What's your second number?
51
Additon:        | 61
Subtraction:    | -41
Multiplication: | 510
Division:       | 0
Remainder:      | 10
What's your first double?
10.9
What's your second double?
21.612
Addition:       | 32.512
Subtraction:    | -10.712
Multiplication: | 235.571
Division:       | 0.504
 */