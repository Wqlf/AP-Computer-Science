/*
 * operationCalc.java
 * Program 204
 * 9/28/2023
 * Ehan Haque
 * A program that takes two integers and performs an operation on them.
 */


import java.util.Scanner;

public class operationCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int output;

        System.out.print("Enter two integers -> ");
        int int1 = input.nextInt();
        int int2 = input.nextInt();

        System.out.print("\nWhich operation? -> ");
        char operation = input.next().charAt(0);

        switch (operation) {

            case '+' : 
            output = int1 + int2;
            System.out.println(int1 + " + " + int2 + " = " + output);
            break;

            case '-' :
            output = int1 - int2;
            System.out.println(int1 + " - " + int2 + " = " + output);
            break;

            case '*' :
            output = int1 * int2;
            System.out.println(int1 + " * " + int2 + " = " + output);
            break;

            case '/' :
            output = int1 / int2;
            System.out.println(int1 + " / " + int2 + " = " + output);
            break;

            case '%' : 
            output = int1 % int2;
            System.out.println(int1 + " % " + int2 + " = " + output);
            break;

            default: 
            System.out.println("This is an invalid operation!");
        }
        input.close();
    }
}





/*
Enter two integers -> 40 70
Which operation? -> +
40 + 70 = 110
Enter two integers -> -60 20
Which operation? -> +
-60 + 20 = -40
Enter two integers -> 4 8
Which operation? -> -
4 - 8 = -4
Enter two integers -> 40 -63
Which operation? -> *
40 * -63 = -2520
Enter two integers -> 54 8
Which operation? -> /
54 / 8 = 6
Enter two integers -> 64 9
Which operation? -> %
64 % 9 = 1
Enter two integers -> 53 83
Which operation? -> lol
That is an invalid operation!
 */