import java.util.Arrays;

/*
  Given two matrix of ints prints on standard output the sum of both matrix
  A: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  B: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }

  RESULT:
  {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  Result matrix must be printed and formatted as previously shown
 */
public class SumTwoMatrix {

  public static void main(String[] args) {

    int[][] matrixFirst = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    int[][] matrixSecond = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
    int[][] matrixSum = new int[matrixFirst.length][matrixFirst[0].length];

    for (int i = 0; i < matrixFirst[0].length; i++) {
      for (int j = 0; j < matrixFirst.length; j++) {
        matrixSum[i][j] = matrixFirst[j][i] + matrixSecond[j][i];
      }
    }

    System.out.println("{");
    for (int i = 0; i < matrixSum[0].length; i++) {
      System.out.print("  {");
      for (int j = 0; j < matrixSum.length; j++) {
        System.out.print(matrixSum[j][i]);
        if (j != 2) {
          System.out.print(",");
        }
      }
      System.out.println("},");
    }
    System.out.println("}");
  }
}