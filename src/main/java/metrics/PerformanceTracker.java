package metrics;

public class PerformanceTracker {

    private long comparisons;
    private long swaps;
    private long arrayAccesses;

    public PerformanceTracker() {
        this.comparisons = 0;
        this.swaps = 0;
        this.arrayAccesses = 0;
    }


    public void incrementComparisons() {
        comparisons++;
    }

    public void incrementSwaps() {
        swaps++;
    }

    public void incrementArrayAccesses() {
        arrayAccesses++;
    }


    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public long getArrayAccesses() {
        return arrayAccesses;
    }

    // --- Total operations ---
    public long getOperationCount() {
        return comparisons + swaps + arrayAccesses;
    }


    public void printMetrics() {
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Array accesses: " + arrayAccesses);
        System.out.println("Total operations: " + getOperationCount());
    }


    public void reset() {
        comparisons = 0;
        swaps = 0;
        arrayAccesses = 0;
    }
}
