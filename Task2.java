import java.util.Arrays;

public class Task2 {

  public static void main(String[] args) {
    String[] array1 = new String[] { "Banana", "Apple", "Pineapple" };
    bubbleSort(array1);
    System.out.println(Arrays.toString(array1));

    String[] array2 = new String[] { "Abd", "Abc", "Bab", "Baa", "Cbc", "Aca" };
    bubbleSort(array2);
    System.out.println(Arrays.toString(array2));

    String[] array3 = new String[] { "Banana", "Apple", "Pineapple" };
    insertionSort(array3);
    System.out.println(Arrays.toString(array3));

    String[] array4 = new String[] { "Abd", "Abc", "Bab", "Baa", "Cbc", "Aca" };
    insertionSort(array4);
    System.out.println(Arrays.toString(array4));

    String[] array5 = new String[] { "Banana", "Apple", "Pineapple" };
    selectionSort(array5);
    System.out.println(Arrays.toString(array5));

    String[] array6 = new String[] { "Abd", "Abc", "Bab", "Baa", "Cbc", "Aca" };
    selectionSort(array6);
    System.out.println(Arrays.toString(array6));
  }

  private static void bubbleSort(String[] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].compareTo(array[j]) > 0) {
          swap(array, i, j);
        }
      }
    }
  }

  private static void insertionSort(String[] array) {
    for (int i = 1; i < array.length; i++) {
      int j = i;

      while (j > 0 && array[j - 1].compareTo(array[j]) > 0) {
        swap(array, j - 1, j);
        j--;
      }
    }
  }

  private static void selectionSort(String[] array) {
    for (int i = 0; i < array.length; i++) {
      int minIndex = i;

      for (int j = i + 1; j < array.length; j++) {
        if (array[j].compareTo(array[minIndex]) < 0) {
          minIndex = j;
        }
      }

      swap(array, i, minIndex);
    }
  }

  private static void swap(String[] array, int i, int j) {
    String tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
  }

}