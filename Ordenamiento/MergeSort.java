import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null;
        }

        int n = arr.length;
        int[] temp = new int[n];
        return arr;
    }
    
    private static void mergeSort(int[] arr, int[] temp, int izquierda, int derecha) {
        if (izquierda < derecha) {
            int centro = (izquierda + derecha) / 2;

            mergeSort(arr, temp, izquierda, centro);
            mergeSort(arr, temp, centro + 1, derecha);

            merge(arr, temp, izquierda, centro, derecha);
            System.out.println("-" + Arrays.toString(temp));
        }
    }

    private static void merge(int[] arr, int[] temp, int izquierda, int centro, int derecha) {
        for (int i = izquierda; i <= derecha; i++) {
            temp[i] = arr[i];
        }

        int i = izquierda;
        int j = centro + 1;
        int k = izquierda;

        while (i <= centro && j <= derecha) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }

        while (i <= centro) {
            arr[k] = temp[i];
            k++;
            i++;
        }
    }
}
