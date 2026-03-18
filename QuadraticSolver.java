import java.util.Scanner;

/**
 * QuadraticSolver.java
 * 
 * Solves a quadratic equation of the form ax^2 + bx + c = 0
 * using the quadratic formula. Assumes real solutions exist.
 * No conditional statements (if) are used.
 *
 * Input:  3 integers a, b, c (coefficients)
 * Output: two real roots, smaller one first
 *
 * Example input:  1 -5 6
 * Example output: 2.0 3.0
 *
 * @author Jairo (ZonaTec)
 */
public class QuadraticSolver {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read the three coefficients of ax^2 + bx + c = 0
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        input.close();

        // Calculate discriminant: b^2 - 4ac
        double discriminant = (double)(b * b) - 4.0 * a * c;

        // Calculate both roots using the quadratic formula
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double root1 = (-b - sqrtDiscriminant) / (2.0 * a);
        double root2 = (-b + sqrtDiscriminant) / (2.0 * a);

        // Print smaller root first
        System.out.println(root1 + " " + root2);
    }
}
