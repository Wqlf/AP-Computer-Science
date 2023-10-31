/*
 * volCyl.java
 * Program 103
 * Ehan Haque
 * 9/1/23
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class volCyl
   {
      public static void main(String[] args)
         {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat(".00");


            System.out.println("What is the radius (in cm) of the cylinder?");
            double r = input.nextDouble();

            System.out.println("What is the height (in cm) of the cylinder?");
            double h = input.nextDouble();

            double pi = 3.14159;

            double vol = pi * r * r * h;

            System.out.println("For the cylinder with a radius of " + r + " and a height of " + h + " the volume is " + df.format(vol) + " cubic centimeters.");

            double vol$ = vol * 0.005;

            System.out.println("The value of Aquafina in this cylinder would be $" + df.format(vol$));

            input.close();
            } 
         }

/*
 What is the radius (in cm) of the cylinder?
16
What is the height (in cm) of the cylinder?
40
For the cylinder with a radius of 16 and a height of 40 the volume is 32169.88 cubic centimeters.
The value of Aquafina in this cylinder would be $160.85
 */