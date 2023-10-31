/**
  * numClassify.java
  Program 3x1
  * Ehan Haque
  * 10/17/2023
  * A program that classifies the factors of numbers 1-30.
*/

import java.util.Scanner;

public class numClassify {
 public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   int sum = 0;

   for (int n = 1; n <= 30; n++)
   {
      for (int factor = 1; factor < n; factor++)
      {
         // Checks if 'factor' is a factor of 'n'
         if (n % factor == 0)
         {
            sum += factor;
         }
      }

      System.out.print(n + " is ");
      if (sum < n)
         System.out.println("Deficient");
      else if (sum > n)
         System.out.println("Abundant");
      else
         System.out.println("Perfect");
      sum = 0;
   }
   input.close();
 }
}

/*
1 is Deficient
2 is Deficient
3 is Deficient
4 is Deficient
5 is Deficient
6 is Perfect
7 is Deficient
8 is Deficient
9 is Deficient
10 is Deficient
11 is Deficient
12 is Abundant
13 is Deficient
14 is Deficient
15 is Deficient
16 is Deficient
17 is Deficient
18 is Abundant
19 is Deficient
20 is Abundant
21 is Deficient
22 is Deficient
23 is Deficient
24 is Abundant
25 is Deficient
26 is Deficient
27 is Deficient
28 is Perfect
29 is Deficient
30 is Abundant 
*/