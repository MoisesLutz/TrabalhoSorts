package utils;

import java.util.Arrays;


public class Sorts {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static int[] mergeSort(int[] vetor) {
        int[] sorted = Arrays.copyOf(vetor, vetor.length);
        mergeSortRecursive(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private static void mergeSortRecursive(int[] vetor, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortRecursive(vetor, left, mid);
            mergeSortRecursive(vetor, mid + 1, right);
            merge(vetor, left, mid, right);
        }
    }

    private static void merge(int[] vetor, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = vetor[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = vetor[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                vetor[k++] = L[i++];
            else
                vetor[k++] = R[j++];
        }

        while (i < n1)
            vetor[k++] = L[i++];
        while (j < n2)
            vetor[k++] = R[j++];
    }

   
    public static void countingSort(int[] vetor) {
        int max = vetor[0];
        for (int num : vetor)
            if (num > max)
                max = num;

        int[] count = new int[max + 1];
        for (int num : vetor)
            count[num]++;

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                vetor[index++] = i;
                count[i]--;
            }
        }
    }

    public static void radixSort(int[] vetor) {
        int max = getMax(vetor);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(vetor, exp);
        }
    }

    private static int getMax(int[] vetor) {
        int max = vetor[0];
        for (int num : vetor)
            if (num > max)
                max = num;
        return max;
    }

    private static void countingSortByDigit(int[] vetor, int exp) {
        int n = vetor.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(vetor[i] / exp) % 10]++;
        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            int digit = (vetor[i] / exp) % 10;
            output[count[digit] - 1] = vetor[i];
            count[digit]--;
        }

        System.arraycopy(output, 0, vetor, 0, n);
    }

    
    public static int[] quickSort(int[] vetor) {
        int[] sorted = Arrays.copyOf(vetor, vetor.length);
        quickSortRecursive(sorted, 0, sorted.length - 1);
        return sorted;
    }

    private static void quickSortRecursive(int[] vetor, int low, int high) {
        if (low < high) {
            int pi = partition(vetor, low, high);
            quickSortRecursive(vetor, low, pi - 1);
            quickSortRecursive(vetor, pi + 1, high);
        }
    }

    private static int partition(int[] vetor, int low, int high) {
        int pivot = vetor[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (vetor[j] <= pivot) {
                i++;
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[high];
        vetor[high] = temp;
        return i + 1;
    }

}