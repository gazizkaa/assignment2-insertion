package algorithms;

import metrics.PerformanceTracker;

public class InsertionSort {

    public static void sort(int[] arr, PerformanceTracker tracker) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            tracker.incrementArrayAccesses();
            int j = i - 1;

            while (j >= 0) {
                tracker.incrementComparisons();
                tracker.incrementArrayAccesses();
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    tracker.incrementArrayAccesses();
                    tracker.incrementSwaps();
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
            tracker.incrementArrayAccesses();
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        PerformanceTracker tracker = new PerformanceTracker();

        System.out.println("Before sorting:");
        printArray(arr);

        sort(arr, tracker);

        System.out.println("After sorting:");
        printArray(arr);

        System.out.println("\nPerformance metrics:");
        tracker.printMetrics();
    }
}
