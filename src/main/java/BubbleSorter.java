import java.util.Arrays;
import java.util.stream.IntStream;

public class BubbleSorter {
    public int[] sort(int[] arr){
        boolean done = false;
        while(!done) {
            done = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    done = false;
                }
            }
        }
        return arr;
    }
}
