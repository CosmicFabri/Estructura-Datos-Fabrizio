import java.util.Arrays;

public class QuickSort {

    public static int[] quickSort(int[] arr) {

        return quickSort(arr, 0, arr.length - 1);
    }

    private static int[] quickSort(int[] arr, int primero, int ultimo) {

        int i, j, central;
        double pivote;
        central = (primero + ultimo) / 2;
        pivote = arr[central];
        i = primero;
        j = ultimo;

        do {
            while (arr[i] < pivote)
                i++;
            while (arr[j] > pivote)
                j--;
            if (i <= j) {
                int aux = arr[i];
				arr[i] = arr[j];
				arr[j] = aux;
					
				i++;
				j--;
            }
            System.out.println("-" + Arrays.toString(arr));
        } while (i <= j);

        if (primero < j)
			quickSort(arr, primero, j);
		if (i < ultimo)
			quickSort(arr, i, ultimo);

        return arr;
    }
}
