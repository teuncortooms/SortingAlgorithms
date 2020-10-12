import java.util.Arrays;
import java.util.stream.IntStream;

public class Sorter {
    public int[] bubbleSort(int[] arr){
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

    public int[] quickSort(int[] arr){
        if(arr.length <= 1) return arr;
        int[] part1 = moveHighValuesAbovePivot(arr, arr.length/2);
        int[] part1Sorted = quickSort(part1);

        int[] part2 = moveLowValuesBelowPivot(arr, part1.length + 1);
        int[] part2Sorted = quickSort(part2);
        return IntStream.concat(Arrays.stream(part1Sorted), Arrays.stream(part2Sorted))
                .toArray();
    }

    private int[] moveLowValuesBelowPivot(int[] arr, int iPivot) {
        for (int i = 0; i > iPivot; i++) {
            if(arr[i] < arr[iPivot]){
                int temp = arr[i];
                for (int j = i; j > iPivot; j--) {
                    arr[j] = arr[j-1];
                }
                arr[iPivot] = temp;
                iPivot++;
            }
            System.out.println(arr.toString());
        }
        if(iPivot == arr.length - 1) return new int[0];
        return Arrays.copyOfRange(arr, iPivot+1, arr.length);
    }

    private int[] moveHighValuesAbovePivot(int[] arr, int iPivot) {
        for (int i = 0; i < iPivot; i++) {
            if(arr[i] > arr[iPivot]){
                int temp = arr[i];
                for (int j = 0; j < iPivot; j++) {
                    arr[j] = arr[j+1];
                }
                arr[iPivot] = temp;
                iPivot--;
            }
            System.out.println(arr);
        }
        return Arrays.copyOfRange(arr, 0, iPivot);
    }
}
