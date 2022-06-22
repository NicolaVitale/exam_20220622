import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given two string as standard input parse them as matrix,
  Then sum both matrix
  And pretty print on stdout the result matrix
  Then print the sum of matrix result values
 */
public class MatrixCombined {

  public static void main(String[] args) {
    int[][] matrixReadOne = readMatrix(args[0]);
    int[][] matrixReadTwo = readMatrix(args[1]);
    int[][] sumMatrix = sumTwoMatrix(matrixReadOne, matrixReadTwo);
    int sumFinal = sumMatrixValues(sumMatrix);

    System.out.println("RESULT: " + sumFinal);
  }

  private static int sumMatrixValues(int[][] sumMatrix) {
    int sum = 0;

    for (int i = 0; i < sumMatrix[0].length; i++) {
      for (int[] matrix : sumMatrix) {
        sum = sum + matrix[i];
      }
    }
    return sum;
  }

  private static int[][] sumTwoMatrix(int[][] matrixReadOne, int[][] matrixReadTwo) {
    int[][] matrixSum = new int[matrixReadOne.length][matrixReadOne[0].length];

    for (int i = 0; i < matrixReadOne[0].length; i++) {
      for (int j = 0; j < matrixReadOne.length; j++) {
        matrixSum[i][j] = matrixReadOne[j][i] + matrixReadTwo[j][i];
      }
    }
    return matrixSum;
  }

  private static int[][] readMatrix(String arg) {
    String rigaRex = "\\{(\\d+)\\,(\\d+)\\,(\\d+)\\}";
    Pattern pattern = Pattern.compile("\\{" + rigaRex + "\\," + rigaRex + "\\," + rigaRex + "\\}");
    int[][] matrix = new int[3][3];
    Matcher matcher = pattern.matcher(arg);

    if (matcher.matches()) {
      for (int i = 0; i < 3; i++) {
        int y = 1;
        for (int j = 0; j < 3; j++) {
          matrix[i][j] = Integer.parseInt(matcher.group(y));
          y++;
        }
      }
    } else {
      System.out.print("Input non valido");
    }
    return matrix;
  }
}