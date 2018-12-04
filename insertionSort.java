public class insertionSort {
  public static void main(String[] args) {
    int[] ary = {5, 6, 3, 2, 7, 4};
    System.out.println("[5, 6, 3, 2, 7, 4]");
    insertionSort(ary);
    for (int x = 0; x < ary.length; x++) {
      System.out.println(ary[x]);
    }
  }
  public static void insertionSort(int[] ary) {
    int tempIdx = 0;
    int x = 0;
    for (int i = 0; i < ary.length; i++) {
      int min = ary[i];
      for (x = i; x < ary.length; x++) {
        if (ary[x] < min) {
          min = ary[x];
          tempIdx = x;
        }
      }
      ary[tempIdx] = ary[i];
      ary[i] = min;
    }
  }


}
