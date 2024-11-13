public class Matrix {
  private int[][] Matrix;
  private int Dimension;
// Adds color to the numbers that don't move
  final String YELLOW = "\033[43m";
  final String RESET = "\033[0m";
// Initializes Matrix
  public Matrix(int Dimension) {
    this.Dimension = Dimension;
    Matrix = new int[Dimension][Dimension];
    System.out.println("Dimensions of Matrix" + Dimension + "x" + Dimension + ":");
  }
}
