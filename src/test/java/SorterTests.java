import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SorterTests {
    private final int arraySize = 10000;
    private final int upperValueBound = 10;

    private int[] getRandomIntsArray() {
        Random r = new Random();
        List<Integer> random100 = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            random100.add(r.nextInt(upperValueBound));
        }
        return random100.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void bubbleSort() {
        int[] arr = getRandomIntsArray();
        arr = new BubbleSorter().sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    void quickSort() {
        int[] arr = getRandomIntsArray();
        arr = new QuickSorter().sort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }

    @Test
    void countingSort() {
        int[] arr = getRandomIntsArray();
        arr = new CountingSorter().sort(arr, upperValueBound);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }
}