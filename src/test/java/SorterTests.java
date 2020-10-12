import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SorterTests {

    private int[] getRandom100() {
        Random r = new Random();
        List<Integer> random100 = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            random100.add(r.nextInt(100));
        }
        return random100.stream().mapToInt(i -> i).toArray();
    }

    @org.junit.jupiter.api.Test
    void bubbleSortRandom100() {
        int[] arr = getRandom100();
        arr = new Sorter().bubbleSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i+1]);
        }
    }

    @org.junit.jupiter.api.Test
    void quickSortRandom100() {
        int[] arr = getRandom100();
        arr = new Sorter().quickSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i+1]);
        }
    }
}