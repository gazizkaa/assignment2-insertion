package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testSortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testWithDuplicates() {
        int[] arr = {4, 2, 4, 3, 2, 1};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 4}, arr);
    }
}
