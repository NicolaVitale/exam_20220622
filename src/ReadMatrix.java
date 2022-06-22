import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
  Given a string as standard input parse the string into a matrix

  args[0]: "{{1,2,3},{1,2,3},{1,2,3}}"

  RESULT: {
    {1, 2, 3},
    {1, 2, 3},
    {1, 2, 3}
  }
 */
public class ReadMatrix {

  public static void main(String[] args) {
    String rigaRex = "\\{(\\d+),(\\d+),(\\d+)}";
    Pattern pattern = Pattern.compile("\\{" + rigaRex + "," + rigaRex + "," + rigaRex + "}");
    int[][] matrix = new int[3][3];
    Matcher matcher = pattern.matcher(args[0]);

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

    System.out.println("RESULT: {");
    for (int i = 0; i < matrix[0].length; i++) {
      System.out.print("  {");
      for (int j = 0; j < matrix.length; j++) {
        System.out.print(matrix[i][j]);
        if (j != 2) {
          System.out.print(",");
        }
      }
      System.out.println("},");
    }
    System.out.println("}");
  }
}