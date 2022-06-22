
/*
  Given a single matrix of ints prints on standard output the sum of all int contained in the matrix
  A: {
    {2, 4, 6},
    {2, 4, 6},
    {2, 4, 6}
  }

  RESULT: 36
 */
public class SumMatrixValues {

  public static void main(String[] args) {
    int[][] matrix = {{2, 4, 6}, {2, 4, 6}, {2, 4, 6}};
    int sum = 0;

    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        sum = sum + matrix[j][i];
      }
    }
    System.out.println(sum);
  }
}