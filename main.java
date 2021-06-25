
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] Array1 = { 1, 5, 3, 5, 6 };
    Arrays.sort(Array1);
    System.out.println(Arrays.toString(Array1));
    int[] array = new int[5];
    int j = 4;

    for (int i = 0; i < Array1.length; i++) {

      array[i] = Array1[j];
      
      j = j - 1;
    }

    System.out.println(Arrays.toString(array));
  }

}
