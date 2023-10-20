import java.util.Arrays;

public class RadixSort {
    
    public static int[] radixSort(int[] arr) {
        int length = arr.length;
        int max = getMax(arr, length);

        for (int exponente = 1; max / exponente > 0; exponente *= 10)
			ordeningSort(arr, length, exponente);
				
		return arr;
    }

    private static int getMax(int[] arr, int length) {
        int max = arr[0];
			for (int i = 1; i < length; i++) {
				if (arr[i] > max)
					max = arr[i];
			}
		return max;
    }

    private static void ordeningSort(int[] arr, int length, int exponente) {
        int[] salida = new int[length + 1];
        int[] orden = new int[10];

        for (int i = 0; i < length; i++)
			orden[(arr[i] / exponente) % 10]++;
				
		for (int i = 1; i < 10; i++)
			orden[i] += orden[i - 1];
				
		for (int i = length - 1; i >= 0; i--) {
			salida[orden[(arr[i] / exponente) % 10] - 1] = arr[i];
			orden[(arr[i] / exponente) % 10]--;
		}

        System.out.println("-" + Arrays.toString(arr));

        for (int i = 0; i < length; i++)
			arr[i] = salida[i];
    }

}
