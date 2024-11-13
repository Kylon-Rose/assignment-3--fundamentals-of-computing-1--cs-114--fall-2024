import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
// Asks for user input
    System.out.println("Please enter a number for the matrix, please & thank you:");
    int input = scanner.nextInt();

    if (input <= 0){
      System.out.println("The input must be positive/above 0.");
    }
// Creates Matrix method
    Matrix Matrix = new Matrix(input);
// Prints Matrix with Default values (0's)
    System.out.println("Default Matrix:");
    Matrix.printDefaultValues();
// Populates Matrix
    Matrix.populateMatrix();
// Prints Normal Matrix
    System.out.println("Normal Matrix:");
    Matrix.printMatrix();
// Flips Matrix
    Matrix.flipMatrix();
// Prints Flipped Matrix
    System.out.println("Flipped Matrix:");
    Matrix.printMatrix();
// Closed scanner
    scanner.close();
  }
}
