import java.util.Arrays;
public class Driver {
  public static void main(String[] args) {
    int[] data = {3, 5, 7, 5, 4, 2, 1, 9, 0};
    System.out.println(Arrays.toString(data));
    Sorts.bubbleSort(data);
    System.out.println(Arrays.toString(data));

    int[] data2 = {};
    Sorts.bubbleSort(data2);
    System.out.println(Arrays.toString(data2));

  }
}
