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
// Populates Matrix
  public void populateMatrix() {
    int input = 1;
    for (int Row = 0; Row < Dimension; Row++) {
      for (int Column = 0; Column < Dimension; Column++) {
        Matrix[Row][Column] = input++;
      }
    }
  }
// Prints Matrix
  public void printMatrix() {
    for (int Row = 0; Row < Dimension; Row++) {
      for (int Column = 0; Column < Dimension; Column++) {
        if (Row + Column == Dimension - 1) {
          System.out.print(YELLOW + Matrix[Row][Column] + RESET + "\t");
        } else {
          System.out.print(Matrix[Row][Column] + "\t");
        }
      }
      System.out.println();
    }
  }
// Print's 0's.
  public void printDefaultValues() {
    for (int Row = 0; Row < Dimension; Row++) {
      for (int Column = 0; Column < Dimension; Column++) {
        if (Row + Column == Dimension - 1) {
          System.out.print(YELLOW + 0 + RESET + "\t");
        } else {
          System.out.print(0 + "\t");
        }
      }
      System.out.println();
    }
  }
}
