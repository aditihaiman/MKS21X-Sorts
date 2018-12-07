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
    int swaps = 1;
    while (swaps > 0) {
      for(int x = 0; x < data.length-1; x++) {
        swaps = 0;
        if(data[x] > data[x+1]) {
          int temp = data[x];
          data[x] = data[x+1];
          data[x+1] = temp;
          swaps++;
        }
      }
    }



  }


}
