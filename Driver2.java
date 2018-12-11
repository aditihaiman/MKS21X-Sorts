import java.util.Arrays;
import java.lang.Math;
public class Driver2{
  public static void main(String[] args) {
    int[] data = {3, 5, 7, 5, 4, 2, 1, 9, 0};
    System.out.println(Arrays.toString(data));
    Sorts.bubbleSort(data);
    System.out.println(Arrays.toString(data));

    int[] data2 = {};
    Sorts.insertionSort(data2);
    System.out.println("Insertion: " + Arrays.toString(data2));


    int[] data3 = new int[100000];
    for(int x = 0; x < 100000; x++) {
      data3[x] = (int)(Math.random() * 10);
    }

    int[] data4 = {1, 0, 49, 5, 8, 4, 3, 7, 11, 2};
    System.out.println(Arrays.toString(data4));
    Sorts.insertionSort(data4);
    System.out.println(Arrays.toString(data4));


    //Sorts.selectionSort(data3);
    //System.out.println(Arrays.toString(data3));

  }
}
