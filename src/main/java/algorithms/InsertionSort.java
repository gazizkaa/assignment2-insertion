package algorithms;

public class InsertionSort {


    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
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
        System.out.println("Before sorting:");
        printArray(arr);

        sort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }
}

