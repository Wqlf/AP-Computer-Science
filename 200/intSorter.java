/*
 * intSorter.java
 * Program 205
 * 9/26/2023
 * Ehan Haque
 * A program that sorts three inputed integers in ascending order.
 */


import java.util.Scanner;

public class intSorter {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integers -> ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int displayA = a;
        int displayB = b;
        int displayC = c;

        // a will always be the smallest.

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }

        // c will always be the biggest

        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        System.out.println(displayA + "\t" + displayB + "\t" + displayC);
        System.out.println(a + "\t" + b + "\t" + c);

        input.close();
    }
}
/*
Enter three numbers -> 24 -27 53
24      -27     53
-27     24      53
Enter three numbers -> 20 125 63
20      125     63
20      63      125
Enter three numbers -> 1 2 3
1       2       3
1       2       3
Enter three numbers -> 3 2 1
3       2       1
1       2       3
Enter three numbers -> 1 3 2
1       3       2
1       2       3
 */