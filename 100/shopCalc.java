/*
 * shopCalc.java
 * Program 104
 * Ehan Haque
 * 9/1/23
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class shopCalc
   {
      public static void main(String[] args)
         {
            Scanner input = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("0.00");

            System.out.println("\n\n\n\n\n\n----------------\n");
            System.out.println("How much does this item cost?\n\n----------------\n");
            double cost = input.nextDouble();

            System.out.println("\n\n\n\n\n\n ---------------- \n");
            System.out.println("How many will be purchased?\n\n----------------\n");
            int multiplier = input.nextInt();

            double subtotal = cost * multiplier;
            double tax = subtotal * 0.06;
            double total = subtotal + tax;

            System.out.println("\n\n\n\n\n\n----------------\n");
            System.out.println("Cost: $" + df.format(cost) + "\n" + 
                               "Quantity: " + multiplier + "\n" + 
                               "Subtotal: $" + df.format(subtotal) + "\n" +
                               "Tax: $" + df.format(tax) + "\n" +
                               "Total: $" + df.format(total)
                               );

            System.out.println("\nHow much money has been tendered?\n\n----------------\n");
            double tendered = input.nextDouble();

            if (tendered < total)
               {
                  System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                  System.out.println("This is not enough to pay the total.");
               }
            else
               {
                  double change = tendered - total;
                  System.out.println("\n\n\n\n\n\n----------------\n");
                  System.out.println("Change: $" + df.format(change));

                  int changeInt = (int) change;
                  int changeFraction = (int) Math.round(100 * change - 100 * changeInt);
                  int hundred = changeInt / 100;
                  int fifty = (changeInt % 100) / 50;
                  int twenty = ((changeInt % 100) % 50) / 20;
                  int ten = (((changeInt % 100) % 50) % 20) / 10;
                  int five = ((((changeInt % 100) % 50) % 20) % 10) / 5;
                  int one = (((((changeInt % 100) % 50) % 20) % 10) % 5) / 1;

                  int quarter = changeFraction / 25;
                  int dime = (changeFraction % 25) / 10;
                  int nickel = ((changeFraction % 25) % 10) / 5;
                  int penny = (((changeFraction % 25) % 10) % 5) / 1;

                  System.out.println("\n");
                  if (hundred > 0)
                     {
                        if (hundred > 1)
                           {
                              System.out.println(hundred + " hundred dollar bills.");
                           }
                        else System.out.println(hundred + " hundred dollar bill.");
                     }
                  if (fifty > 0)
                     {
                        if (fifty > 1)
                           {
                              System.out.println(fifty + " fifty dollar bills.");
                           }
                        else System.out.println(fifty + " fifty dollar bill.");
                     }
                  if (twenty > 0)
                     {
                        if (twenty > 1)
                           {
                              System.out.println(twenty + " twenty dollar bills.");
                           }
                        else System.out.println(twenty + " twenty dollar bill.");
                     }
                  if (ten > 0)
                     {
                        if (ten > 1)
                           {
                              System.out.println(ten + " ten dollar bills.");
                           }
                        else System.out.println(ten + " ten dollar bill.");
                     }
                  if (five > 0)
                     {
                        if (five > 1)
                           {
                              System.out.println(five + " five dollar bills.");
                           }
                        else System.out.println(five + " five dollar bill.");
                     }
                  if (one > 0)
                     {
                           if (one > 1)
                           {
                              System.out.println(one + " one dollar bills.");
                           }
                        else System.out.println(one + " one dollar bill.");
                     }
                  if (quarter > 0)
                     {
                           if (quarter > 1)
                           {
                              System.out.println(quarter + " quarters.");
                           }
                        else System.out.println(quarter + " quarter.");
                     }
                  if (dime > 0)
                     { 
                           if (dime > 1)
                           {
                              System.out.println(dime + " dimes.");
                           }
                        else System.out.println(dime + " dime.");
                     }
                  if (nickel > 0)
                     {
                           if (nickel > 1)
                           {
                              System.out.println(nickel + " nickels.");
                           }
                        else System.out.println(nickel + " nickel.");
                     }
                  if (penny > 0)
                     {
                           if (penny > 1)
                           {
                              System.out.println(penny + " pennies.");
                           }
                        else System.out.println(penny + " penny.");
                     }
                     System.out.println("\n----------------\n");
               }
            input.close();
            }
   }

/*
 ----------------
How much does this item cost?
----------------
6.99
 ---------------- 
How many will be purchased?
----------------
10
----------------
Cost: $6.99
Quantity: 10
Subtotal: $69.90
Tax: $4.19
Total: $74.09
How much money has been tendered?
----------------
100
----------------
Change: $25.91
1 twenty dollar bill.
1 five dollar bill.
3 quarters.
1 dime.
1 nickel.
1 penny.
----------------
 */