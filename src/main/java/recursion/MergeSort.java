package recursion;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4, 2, 6};
        mergeSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int left, int right, int[] arr) {
        if(left >= right) {
            return;
        }
        int middle = left + (right - left) / 2;
        mergeSort(left, middle, arr);
        mergeSort(middle+1, right, arr);

        merge(left, middle, right, arr);
    }

    private static void merge(int left, int middle, int right, int[] arr) {
        int[] temp = new int[right - left + 1];
        int leftIndex = left, rightIndex = middle + 1, tempIndex = 0;
        while(leftIndex <= middle && rightIndex <= right) {
            if(arr[leftIndex] <= arr[rightIndex]) {
                temp[tempIndex] = arr[leftIndex];
                leftIndex++;
            } else {
                temp[tempIndex] = arr[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }

        while(leftIndex <= middle) {
            temp[tempIndex] = arr[leftIndex];
            leftIndex++;
            tempIndex++;
        }

        while(rightIndex <= right) {
            temp[tempIndex] = arr[rightIndex];
            rightIndex++;
            tempIndex++;
        }

        for(int index = left; index <= right; index++) {
            arr[index] = temp[index - left];
        }
    }
}
