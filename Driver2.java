import java.util.Arrays;
import java.lang.Math;
public class Driver2{
  public static void main(String[] args) {
    int[] data = {3, 5, 7, 5, 4, 2, 1, 9, 0};
    System.out.println(Arrays.toString(data));
    Sorts.bubbleSort(data);
    System.out.println(Arrays.toString(data));

    int[] data2 = {};
    Sorts.bubbleSort(data2);
    System.out.println(Arrays.toString(data2));


    int[] data3 = new int[100000];
    for(int x = 0; x < 100000; x++) {
      data3[x] = (int)(Math.random() * 10);
    }

    Sorts.selectionSort(data3);
    //System.out.println(Arrays.toString(data3));

  }
}
