public class insertionSort {
  public static void insertionSort(int[] ary) {
    int min = ary[0];
    int x;
    for (int i = 0; i < ary.length; i++) {
      for (x = i; x < ary.length; x++) {
        if (ary[x] < min) min = ary[x];
      }
      ary[x] = ary[i];
      ary[i] = min;
    }
  }


}
