/*
 * quadraticCalc.java
 * Program 2x1
 * Ehan Haque
 * 9/7/2023
 * A simple quadratic formula calculator.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class quadraticCalc {   
           public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                DecimalFormat df = new DecimalFormat("0.0##");

                System.out.println("\n\n\n\n\n\n\n");
                System.out.print("Ax² + Bx + C = 0\nA = ");
                double A = input.nextDouble();

                System.out.print("B = ");
                double B = input.nextDouble();

                System.out.print("C = ");
                double C = input.nextDouble();

                if (A != 0) {

                    double sqrt = Math.pow(B,2) - (4 * A * C);

                    System.out.println(" ");

                    if (sqrt < 0) {
                        sqrt = -1 * sqrt;
                        sqrt = Math.sqrt(sqrt);
                        double realRoot = (-(B))/(2 * A);
                        double imaginaryRoot = sqrt/(2 * A);

                        if (realRoot == -0.0) {
                            realRoot *= -1;
                        }
                        if (imaginaryRoot == -0.0) {
                            imaginaryRoot *= -1;
                        }

                        System.out.println("X = " + df.format(realRoot) + " ± " + df.format(imaginaryRoot) + " i ");
                        System.out.println("\n");
                    }
                    else if (sqrt > 0) {
                        sqrt = Math.sqrt(sqrt);
                        double posRoot = (-(B) + sqrt) / (2 * A);
                        double negRoot = (-(B) - sqrt) / (2 * A);

                        System.out.println("X = " + df.format(posRoot) + " , " + df.format(negRoot));
                        System.out.println("\n");
                    }
                    else {
                        double x = (-(B) / 2 * A);
                        if (x == -0.0) {
                            x *= -1;
                        }

                        System.out.println("X = " + df.format(x));
                        System.out.println("\n");
                    }
                }
                else {
                    System.out.println(" ");
                    System.out.println("X = " + df.format( (-(C)) / B) );
                    System.out.println("\n");
                }

                input.close();

            }

    }

/*
Ax² + Bx + C = 0
A = 1
B = 5
C = 6
 
X = -2.0 , -3.0
Ax² + Bx + C = 0
A = 1
B = 6
C = 3
 
X = -0.551 , -5.449
Ax² + Bx + C = 0
A = 10
B = 2
C = 20
 
X = -0.1 ± 1.411 i 
Ax² + Bx + C = 0
A = 0
B = 30
C = 60
X = -2.0
 */