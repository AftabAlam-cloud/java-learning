public class MergeSort {
    public static void conquer(int arr[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];
        int idx1 = si; // Pointer for the left subarray
        int idx2 = mid + 1; // Pointer for the right subarray
        int idx = 0; // Pointer for the merge array

        // Merge the two sorted subarrays
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merge[idx] = arr[idx1];
                idx1++;
            } else {
                merge[idx] = arr[idx2];
                idx2++;
            }
            idx++;
        }

        // Copy any remaining elements from the left subarray
        while (idx1 <= mid) {
            merge[idx] = arr[idx1];
            idx1++;
            idx++;
        }

        // Copy any remaining elements from the right subarray
        while (idx2 <= ei) {
            merge[idx] = arr[idx2];
            idx2++;
            idx++;
        }

        // Copy the sorted elements back into the original array
        for (int i = 0; i < merge.length; i++) {
            arr[si + i] = merge[i];
        }
    }

    public static void divide(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Recursively divide the array into two halves
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);

        // Merge the sorted halves
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Perform Merge Sort
        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
