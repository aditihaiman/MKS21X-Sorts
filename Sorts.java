import java.util.Arrays;
public class Sorts {

  public static void selectionSort(int[] ary) {
    int minIdx;
    int x = 0;
    for (int i = 0; i < ary.length; i++) {
      minIdx = i;
      for (x = i + 1; x < ary.length; x++) {
        if (ary[x] < ary[minIdx]) {
          minIdx = x;
        }
      }
      int temp = ary[i];
      ary[i] = ary[minIdx];
      ary[minIdx] = temp;
    }
  }


  public static void bubbleSort(int[] data) {
    boolean swap = true;
    while (swap) {
      int swaps = 0;
      for(int x = 0; x < data.length-1; x++) {
        if(data[x] > data[x+1]) {
          int temp = data[x];
          data[x] = data[x+1];
          data[x+1] = temp;
          swaps++;
        }
        //System.out.println(Arrays.toString(data));
      }
      if (swaps==0) swap = false;
    }
  }

  public static void insertionSort(int[] data) {
    if (data.length > 0) {
      for (int x = 1; x < data.length; x++) {
        int temp = data[x];
        if (data[x] > data[x-1]) {
          int y = x-1;
          while (temp < data[y] && y >= 0) {
            data[x] = data[y];
            y--;
            x--;
          }
          data[y+1] = temp;
        }
      }
    }

  }



}
