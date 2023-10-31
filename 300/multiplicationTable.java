/*
 * multipicationTable.java
 * Program 303
 * Ehan Haque
 * 10/16/2023
 * A program that prints out a multiplication table based off the dimensions imputed by a user.
 */

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dimensions of the table (max 12x12) -> ");
        int column = input.nextInt();
        int row = input.nextInt();

        // Checks if 'column' isn't a valid input.
        while (column < 1 || column > 12) {
            System.out.print("The number of columns (" + column + ") is an invalid input! Try again -> ");
            column = input.nextInt();
        }

        // Checks if 'row' isn't a valid input.
        while (row < 1 || row > 12) {
            System.out.print("The number of rows (" + row + ") is an invalid input! Try again -> ");
            row = input.nextInt();
        }

        // Formatting the table.
        System.out.println("Multiplication Table (" + column + "x" + row + "):");

        System.out.print("\t\t ");
        for (int i = 1; i <= column; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");

        System.out.print("\t_______");
        for (int i = 1; i <= column; i++) {
            System.out.print("_______");
        }
        System.out.println("_______");

        // Prints values of multiplication table.
        for (int i = 1; i <= row; i++) {
            System.out.print(i + "\t|\t");
            for (int j = 1; j <= column; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}


/*
Enter the dimensions of the table (max 12x12) -> -4 7
The number of columns (-4) is an invalid input! Try again -> 6
Multiplication Table (6x7):
                 1      2       3       4       5       6
        ________________________________________________________
1       |       1       2       3       4       5       6
2       |       2       4       6       8       10      12
3       |       3       6       9       12      15      18
4       |       4       8       12      16      20      24
5       |       5       10      15      20      25      30
6       |       6       12      18      24      30      36
7       |       7       14      21      28      35      42
Enter the dimensions of the table (max 12x12) -> 50 30
The number of columns (50) is an invalid input! Try again -> 12
The number of rows (30) is an invalid input! Try again -> 12
Multiplication Table (12x12):
                 1      2       3       4       5       6       7       8       9       10      11      12
        __________________________________________________________________________________________________
1       |       1       2       3       4       5       6       7       8       9       10      11      12
2       |       2       4       6       8       10      12      14      16      18      20      22      24
3       |       3       6       9       12      15      18      21      24      27      30      33      36
4       |       4       8       12      16      20      24      28      32      36      40      44      48
5       |       5       10      15      20      25      30      35      40      45      50      55      60
6       |       6       12      18      24      30      36      42      48      54      60      66      72
7       |       7       14      21      28      35      42      49      56      63      70      77      84
8       |       8       16      24      32      40      48      56      64      72      80      88      96
9       |       9       18      27      36      45      54      63      72      81      90      99      108
10      |       10      20      30      40      50      60      70      80      90      100     110     120
11      |       11      22      33      44      55      66      77      88      99      110     121     132
12      |       12      24      36      48      60      72      84      96      108     120     132     144
Enter the dimensions of the table (max 12x12) -> 7 13
The number of rows (13) is an invalid input! Try again -> 12
Multiplication Table (7x12):
                 1      2       3       4       5       6       7
        _______________________________________________________________
1       |       1       2       3       4       5       6       7
2       |       2       4       6       8       10      12      14
3       |       3       6       9       12      15      18      21
4       |       4       8       12      16      20      24      28
5       |       5       10      15      20      25      30      35
6       |       6       12      18      24      30      36      42
7       |       7       14      21      28      35      42      49
8       |       8       16      24      32      40      48      56
9       |       9       18      27      36      45      54      63
10      |       10      20      30      40      50      60      70
11      |       11      22      33      44      55      66      77
12      |       12      24      36      48      60      72      84
 */