/*
 * creditSecurity.java
 * Program 202
 * Ehan Haque
 * 9/22/23
 * A program that checks if an inputed credit card is valid.
 */

import java.util.Scanner;

public class creditSecurity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean numDigits;

        System.out.print("\n\n\n\n\nEnter your credit card number -> ");
        int creditNumber = input.nextInt();

        if (creditNumber <= 999999999 && creditNumber >= 99999999) {
            numDigits = true;
        }
        else numDigits = false;

        if (numDigits == true)    {   
                int digit4 = (creditNumber % 1000000) / 100000;
                int digit5 = (creditNumber % 100000) / 10000;
                int digit8 = (creditNumber % 100) / 10;
                if (digit4 + digit5 == digit8) {
                    System.out.println("Card Number [" + creditNumber + "] is a valid number!");
                }
                else System.out.println("Card Number [" + creditNumber + "] is not a valid number!");
            }
        else System.out.println("Card Number [" + creditNumber + "] is not a valid number!");

        input.close();
    }
}

/* 
 Enter your credit card number -> 1207319
Card Number [1207319] is not a valid number!
Enter your credit card number -> 210793197
Card Number [210793197] is not a valid number!
Enter your credit card number -> 601127932
Card Number [601127932] is a valid number!
Enter your credit card number -> 52
Card Number [52] is not a valid number!
Enter your credit card number -> 1022985032
Card Number [1022985032] is not a valid number!
Enter your credit card number -> 373148357        
Card Number [373148357] is a valid number!
*/