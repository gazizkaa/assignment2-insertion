package algorithms;

import metrics.PerformanceTracker;
import java.util.Random;

public class BenchmarkRunner {

    private static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100000); // random numbers 0–99,999
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 20000, 50000};

        System.out.printf("%-10s %-15s %-15s%n", "Size", "Time (ms)", "Operations");
        System.out.println("-------------------------------------------");

        for (int size : sizes) {
            int[] arr = generateRandomArray(size);
            PerformanceTracker tracker = new PerformanceTracker();

            long startTime = System.currentTimeMillis();
            InsertionSort.sort(arr, tracker);
            long endTime = System.currentTimeMillis();

            long elapsed = endTime - startTime;
            System.out.printf("%-10d %-15d %-15d%n", size, elapsed, tracker.getOperationCount());
        }
    }
}
