import java.util.Arrays;

public class BubbleSort {
    
    public static int[] bubbleSort(int[] arr) {
        boolean swap;
        int length = arr.length;
        int i = 0;

        do {
            swap = false;
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    swap = true;
                }
            }
        } while (swap);

        return arr;
    }

}
