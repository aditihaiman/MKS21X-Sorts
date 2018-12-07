import java.util.Arrays;
public class selectionSort {

  public static void main(String[] args) {
    int[] ary = {1, 6, 3, 2, 7, 4};
    System.out.println("[1, 6, 3, 2, 7, 4]");
    selectionSort(ary);
    System.out.println(Arrays.toString(ary)); //[1, 2, 3, 4, 6, 7]
    System.out.println("–––––––––––––––––––––––––––––––");
    int[] ary2 = {5, 1, 12, -5, 16, 2, 12, 14};
    System.out.println("[5, 1, 12, -5, 16, 2, 12, 14]");
    selectionSort(ary2);

    int[] ary3 = {};
    selectionSort(ary3);
    System.out.println(Arrays.toString(ary3));

  }



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
      //System.out.println(Arrays.toString(ary));
    }
  }


}
