/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_03_activity2_task_01;

/**
 *
 * @author Hammad Sajjad Awan
 */
public class Lab_03_Activity2_Task_01 {

    public static void main(String[] args) {
        // Initializing distinct test arrays to benchmark both algorithms
        int[] arrayForMerge = {64, 25, 12, 22, 11, 90, 34};
        int[] arrayForQuick = {64, 25, 12, 22, 11, 90, 34};

        System.out.println("=================================================");
        System.out.println("RUNNING MERGE SORT DEMO");
        System.out.println("=================================================");
        System.out.print("Initial State: ");
        printFullArray(arrayForMerge);
        System.out.println("\n");
        
        mergeSort(arrayForMerge, 0, arrayForMerge.length - 1);
        
        System.out.print("\nFinal Sorted Array (Merge Sort): ");
        printFullArray(arrayForMerge);
        System.out.println();

        System.out.println("\n=================================================");
        System.out.println("RUNNING QUICK SORT DEMO");
        System.out.println("=================================================");
        System.out.print("Initial State: ");
        printFullArray(arrayForQuick);
        System.out.println("\n");
        
        quickSort(arrayForQuick, 0, arrayForQuick.length - 1);
        
        System.out.print("\nFinal Sorted Array (Quick Sort): ");
        printFullArray(arrayForQuick);
        System.out.println();
    }

    // ==================== MERGE SORT IMPLEMENTATION ====================
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Tracking the structural split boundaries
            System.out.print("Splitting subarray: ");
            printSubarray(arr, left, right);
            System.out.println();

            mergeSort(arr, left, mid);      // Recursive call for left half
            mergeSort(arr, mid + 1, right); // Recursive call for right half

            merge(arr, left, mid, right);   // Merge both halves back together
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Manual copy instead of System.arraycopy to avoid built-in shortcuts
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }

        System.out.print("   Merging parts -> Left: ");
        printFullArray(L);
        System.out.print(" and Right: ");
        printFullArray(R);
        System.out.println();

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++; k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++; k++;
        }
        
        System.out.print("   Result after merge phase: ");
        printSubarray(arr, left, right);
        System.out.println();
    }





    // ==================== QUICK SORT IMPLEMENTATION ====================
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            System.out.print("Processing index range: ");
            printSubarray(arr, low, high);
            System.out.println();
            
            int pi = partition(arr, low, high); // Find partition index location

            quickSort(arr, low, pi - 1);  // Recursive call for left partition
            quickSort(arr, pi + 1, high); // Recursive call for right partition
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Lomuto pivot selection strategy (last element)
        System.out.println("   Selected Pivot Value: [" + pivot + "]");
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // Manual Swap mechanics
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at index i + 1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        System.out.print("   Current Array State after Partition: ");
        printFullArray(arr);
        System.out.println();
        System.out.println("   Pivot element locked at index location: " + (i + 1));
        
        return i + 1;
    }

// ==================== MANUAL FOR-EACH DISPLAY UTILITY ====================
// Prints only the selected part of the array
private static void printSubarray(int[] arr, int left, int right) {
    for (int i = left; i <= right; i++) {
        System.out.print(arr[i] + " ");
    }
}

// Prints an entire passed array using a simple for-each loop structure
private static void printFullArray(int[] arr) {
    for (int val : arr) {
        System.out.print(val + " ");
    }
    System.out.println();
    }
}

