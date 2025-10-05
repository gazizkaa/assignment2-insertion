package cli;

import algorithms.InsertionSort;
import metrics.PerformanceTracker;

import java.util.Random;

public class BenchmarkRunner {

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 50000};
        Random random = new Random();

        System.out.printf("%-10s %-15s %-20s\n", "Size", "Time (ms)", "Operations");
        System.out.println("----------------------------------------------------");

        for (int n : sizes) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = random.nextInt(10000);
            }

            PerformanceTracker tracker = new PerformanceTracker();

            long startTime = System.currentTimeMillis();
            InsertionSort.sort(array, tracker);
            long endTime = System.currentTimeMillis();

            System.out.printf("%-10d %-15d %-20d\n",
                    n, (endTime - startTime), tracker.getOperationCount());
        }
    }
}
