/*
 * gradeAvg.java
 * Program 301
 * Ehan Haque
 * 10/16/2023
 * A program that takes in 'n' test values and averages them out, printing a letter grade as well.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class gradeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0#");

        System.out.print("Enter the number of tests to average -> ");
        int n = input.nextInt();

        // Checks if 'n' is a valid number.
        while (n < 0) {
               System.out.print("This is an invalid number! Please input a positive integer -> ");
               n = input.nextInt();
        }

        double testOverall = 0;
        // Users input grades for 'n' amount of tests.
        for (int i = 1; i <= n; i++)
            {
                System.out.print("Enter test #" + i + " grade -> ");
                double testScore = input.nextDouble();

                // Checks if 'testScore' is invalid.
                while (testScore < 0 || testScore > 100) {
                    System.out.print("This is an invalid test grade! Please input a grade between 0.0 and 100.0 -> ");
                    testScore = input.nextDouble();
                }

                // Adds all the test scores.
                testOverall += testScore;
            }

        // Finds the average of the all test scores.
        double testAverage = testOverall / n;

        // Determine letter grade of the average based off of EHS letter grading system.
        char testLetter;
        if (testAverage < 59.4) {
            testLetter = 'F';
        }
        else if (testAverage < 69.4) {
            testLetter = 'D';
        }
        else if (testAverage < 79.4) {
            testLetter = 'C';
        }
        else if (testAverage < 89.4) {
            testLetter = 'B';
        }
        else testLetter = 'A';

        System.out.println("The test average is a " + df.format(testAverage) + ".");
        System.out.println("The letter score, based off of the EHS letter scale, would be: " + testLetter);


        input.close();
        }
}


/*
Enter the number of tests to average -> -7
This is an invalid number! Please input a positive integer -> 3
Enter test #1 grade -> -32
This is an invalid test grade! Please input a grade between 0.0 and 100.0 -> 54
Enter test #2 grade -> 78
Enter test #3 grade -> 87
The test average is a 73.0.
The letter score, based off of the EHS letter scale, would be: C
Enter the number of tests to average -> 2
Enter test #1 grade -> 90
Enter test #2 grade -> 90
The test average is a 90.0.
The letter score, based off of the EHS letter scale, would be: A
Enter the number of tests to average -> 3
Enter test #1 grade -> 80
Enter test #2 grade -> 89 
Enter test #3 grade -> 78
The test average is a 82.33.
The letter score, based off of the EHS letter scale, would be: B
Enter the number of tests to average -> 4
Enter test #1 grade -> 70
Enter test #2 grade -> 65
Enter test #3 grade -> 67
Enter test #4 grade -> 50 
The test average is a 63.0.
The letter score, based off of the EHS letter scale, would be: D
Enter the number of tests to average -> 5
Enter test #1 grade -> -53
This is an invalid test grade! Please input a grade between 0.0 and 100.0 -> 40
Enter test #2 grade -> 504 
This is an invalid test grade! Please input a grade between 0.0 and 100.0 -> 56
Enter test #3 grade -> 101
This is an invalid test grade! Please input a grade between 0.0 and 100.0 -> 50
Enter test #4 grade -> 70
Enter test #5 grade -> 60
The test average is a 55.2.
The letter score, based off of the EHS letter scale, would be: F
 */