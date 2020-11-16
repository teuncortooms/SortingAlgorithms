import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SorterTests {

    private int[] getRandomIntsArray() {
        int size = 10;
        int max = 10;
        Random r = new Random();
        List<Integer> random100 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            random100.add(r.nextInt(max));
        }
        return random100.stream().mapToInt(i -> i).toArray();
    }

    @org.junit.jupiter.api.Test
    void bubbleSortRandom100() {
        int[] arr = getRandomIntsArray();
        arr = new BubbleSorter().sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @org.junit.jupiter.api.Test
    void quickSortRandom100() {
        int[] arr = getRandomIntsArray();
        arr = new QuickSorter().sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }
}