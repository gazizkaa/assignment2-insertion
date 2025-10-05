package algorithms;

import metrics.PerformanceTracker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    void testNormalCase() {
        int[] arr = {5, 2, 4, 6, 1, 3};
        int[] expected = {1, 2, 3, 4, 5, 6};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {7};
        int[] expected = {7};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSorted() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testWithDuplicates() {
        int[] arr = {3, 1, 2, 3, 1};
        int[] expected = {1, 1, 2, 3, 3};
        PerformanceTracker tracker = new PerformanceTracker();
        InsertionSort.sort(arr, tracker);
        assertArrayEquals(expected, arr);
    }
}
