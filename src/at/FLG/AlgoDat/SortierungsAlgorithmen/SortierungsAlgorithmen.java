package at.FLG.AlgoDat.SortierungsAlgorithmen;
import java.util.Arrays;
import java.util.Random;

public class SortierungsAlgorithmen {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
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

    public static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int pivot = arr[arr.length / 2];
        int[] left = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] middle = Arrays.stream(arr).filter(x -> x == pivot).toArray();
        int[] right = Arrays.stream(arr).filter(x -> x > pivot).toArray();
        return concatenate(quickSort(left), middle, quickSort(right));
    }

    private static int[] concatenate(int[] left, int[] middle, int[] right) {
        int[] result = new int[left.length + middle.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(middle, 0, result, left.length, middle.length);
        System.arraycopy(right, 0, result, left.length + middle.length, right.length);
        return result;
    }

    private static long measureSortTime(Runnable sortFunction) {
        long startTime = System.currentTimeMillis();
        sortFunction.run();
        return System.currentTimeMillis() - startTime;
    }

    public static void runTests() {
        int[] sizes = {10000, 100000, 400000};
        Random random = new Random();

        for (int size : sizes) {
            System.out.println("\nTesting with " + size + " elements:");
            int[] data = random.ints(size, 0, 1000000).toArray();

            int[] dataCopy;
            long bubbleSortTime = 0, selectionSortTime = 0, insertionSortTime = 0, quickSortTime = 0;

            dataCopy = Arrays.copyOf(data, data.length);
            bubbleSortTime = measureSortTime(() -> bubbleSort(dataCopy));
            System.out.println("Bubble Sort took " + bubbleSortTime + " ms");

            dataCopy = Arrays.copyOf(data, data.length);
            selectionSortTime = measureSortTime(() -> selectionSort(dataCopy));
            System.out.println("Selection Sort took " + selectionSortTime + " ms");

            dataCopy = Arrays.copyOf(data, data.length);
            insertionSortTime = measureSortTime(() -> insertionSort(dataCopy));
            System.out.println("Insertion Sort took " + insertionSortTime + " ms");

            dataCopy = Arrays.copyOf(data, data.length);
            quickSortTime = measureSortTime(() -> { int[] sorted = quickSort(dataCopy); });
            System.out.println("Quick Sort took " + quickSortTime + " ms");

            System.out.println("\nSummary for " + size + " elements:");
            System.out.println("Bubble Sort: " + bubbleSortTime + " ms");
            System.out.println("Selection Sort: " + selectionSortTime + " ms");
            System.out.println("Insertion Sort: " + insertionSortTime + " ms");
            System.out.println("Quick Sort: " + quickSortTime + " ms");
        }
    }

    public static void main(String[] args) {
        runTests();
    }
}
