import java.util.Random;
//import java.util.Arrays;

public class BusquedaBinaria {

    Random rand = new Random();

    public static int busquedaBinaria(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            if (arr[m] == x)
                return m;
 
            if (arr[m] < x)
                l = m + 1;
 
            else
                r = m - 1;
        }

        return -1;
    }

    public static int[] randArray() {
        Random rand = new Random();

        int[] randArr = new int[1000];
        for(int i = 0; i < 1000; i++) {
            randArr[i] = rand.nextInt(1000);
        }
        return randArr;
    }

}