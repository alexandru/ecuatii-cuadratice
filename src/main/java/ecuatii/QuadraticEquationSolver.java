package ecuatii;

import java.util.Scanner;

/**
 * Calculator pentru cuadraturi numerice.
 *
 * Astfel de ecuații sunt de forma `Ax^2 + Bx + C = 0`
 * cu A diferit de zero.
 *
 * Exemplu: A = 2, B = 6, C = 4
 */
public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner( System.in );

        System.out.println();
        System.out.println("Introduceți coeficienții și constantele pentru ecuația Ax^2 + Bx + C = 0");

        System.out.print("Introduceți o valoare pentru A: ");
        double a = checkDouble(keyboard);
        System.out.print("Introduceți o valoare pentru B: ");
        double b = checkDouble(keyboard);
        System.out.print("Introduceți o valoare pentru C: ");
        double c = checkDouble(keyboard);

        System.out.println("\nRezolvăm: " + a + "x^2 +" + b + "x + " + c + " = 0");

        if ((b*b - 4*a*c)>=0) {
            double sol1 = (-b + Math.sqrt(b*b - 4*a*c) ) / (2*a);
            double sol2 = (-b - Math.sqrt(b*b - 4*a*c) ) / (2*a);

            if (sol1 == sol2)
                System.out.println(sol1);
            else
                System.out.println(sol1 + " " + sol2);
        }
        else {
            double solA = (-b / (2*a));
            double solB = Math.sqrt(-(b*b - 4*a*c))/ (2*a);
            System.out.println("Soluții: " + solA + " + " + solB + "i și" + solA + " - " + solB +"i");
        }
    }

    private static double checkDouble(Scanner keyboard) {
        if (keyboard.hasNextDouble())
            return keyboard.nextDouble();
        else {
            System.out.println("Introduceți vă rog un număr!");
            System.exit(0);
        }

        return 0;
    }
}
