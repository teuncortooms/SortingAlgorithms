import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class QuickSorter {

    public int[] sort(int[] arr, int low, int high) {
        if(low < high) {
            int iPivot = partition(arr, low, high);

            sort(arr, low, iPivot - 1);
            sort(arr, iPivot + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high) {
        int iPivot = high;
        for (int i = low; i < iPivot; i++) {
            // if element is bigger than pivot...
            if (arr[i] > arr[iPivot]){
                //... move it after iPivot
                int temp = arr[i];
                for (int j = i; j < iPivot; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[iPivot] = temp;
                // ... and correct indexes
                i--;
                iPivot--;
            }
        }
        return iPivot;
    }
}
