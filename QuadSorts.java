import java.io.*;
public class QuadSorts {

    public static int[] bubbleSort(int[] arr) {

        int l = arr.length;
        boolean z = true;
        while (z) {
            z = false;
            for (int i = 0; i < l-1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = x;
                    z = true;
                } else {
                    continue;
                }
            }
        }
        return new int[]{0};
    }

    public static int[] selectionSort(int[] arr){
        int l = arr.length;
        for (int i = 0; i < l-1; i++) {
            int min = arr[i];
            int mini = i;
            for (int z = i; z < l; z++) {
                if (arr[z] < min) {
                    min = arr[z];
                    mini = z;
                }
            }
            arr[mini] = arr[i];
            arr[i] = min;
        }
        return new int[]{0};
    }

    public static int[] insertionSort(int[] arr){
        int l = arr.length;
        int[] arr2 = new int[l];
        for (int i = 0; i <= l-1; i++) {
            arr2[i] = arr[i];
            int j = i;
            int x = arr2[j];
            while (j > 0 && arr2[j] < arr2[j - 1]) {
                arr2[j] = arr2[j - 1];
                arr2[j - 1] = x;
                j--;
            }
        }
        arr=arr2;
        return arr;
    }

    public static void mergeSort(int[] arr){
        int l = arr.length;
        //condition to stop splitting the lists
        if (l<2){
            return;
        }
        //splits the lists in half recursively
        int mid = l/2;
        int[] left = new int[mid];
        int[] right = new int[l-mid];
        for (int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for (int i = mid; i < l; i++){
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        //merging them back together
        int leftl = left.length;
        int rightl = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftl && j < rightl){
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftl){
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < rightl) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
