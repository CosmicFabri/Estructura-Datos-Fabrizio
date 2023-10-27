import java.util.Arrays;


public class Main {
    
    public static void main(String[] args) {
        int[] arr = BusquedaBinaria.randArray();
        int[] sortedArr = QuickSort.quickSort(arr);
        System.out.println(Arrays.toString(sortedArr));
        System.out.println();
        System.out.println(BusquedaBinaria.busquedaBinaria(sortedArr, 50));
    }
}