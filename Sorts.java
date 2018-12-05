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

}
