/*
 * secondsConverter.java
 * Program 201
 * Ehan Haque
 * 9/22/2023
 * A converter that inputs seconds and outputs it in hh:mm:ss format.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class secondsConverter {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        System.out.print("Enter the number of seconds -> ");
        double secondsInput = input.nextDouble();

        int hours = (int)(secondsInput / 3600);
        int minutes = (int)((secondsInput % 3600) / 60);
        int seconds = (int)(((secondsInput % 3600) % 60));

        System.out.println(df.format(hours) + " : " + df.format(minutes) + " : " + df.format(seconds));

        input.close();
    }
}
/*
Enter the number of seconds -> 43026074325
11951687 : 18 : 45
Enter the number of seconds -> 85
00 : 01 : 25
Enter the number of seconds -> 503
00 : 08 : 23
Enter the number of seconds -> 40316
11 : 11 : 56
Enter the number of seconds -> 3600
01 : 00 : 00
Enter the number of seconds -> 60
00 : 01 : 00
Enter the number of seconds -> 10
00 : 00 : 10
 */