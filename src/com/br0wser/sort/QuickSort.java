package com.br0wser.sort;

/**
 * Created by browser on 16/3/4.
 */
public class QuickSort {

    static int[] arr;

    static char[] chars;

    public void sort(int[] array) {
        arr = array;
        quickSort(0, array.length-1);
    }

    private void quickSort(int start, int end) {
        if (start>=end) return;

        int mid = arr[end/2];
        int left = start;
        int right = end-1;

        while(left<right) {

            while(arr[left]<mid && left<right)
                left++;

            while(arr[right]>mid && left<right)
                right--;

            swap(left, right);
        }

		if (arr[left] >= arr[end])
			swap(left, end);
		else
			left++;

		quickSort(start, left-1);
		quickSort(left+1, end);

    }

    private void swap(int left, int right) {
        int tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }

    public static void quickSort(int[] array, int start, int end) {
        if (start>=end) return;

        int mid = array[end];
        int left = start;
        int right = end-1;

        while(left<right) {

            while(array[left]<mid && left<right)
                left++;

            while(array[right]>mid && left<right)
                right--;

            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
        }

        if (array[left] >= array[end]) {
            int tmp = array[left];
            array[left] = array[end];
            array[end] = tmp;
        } else {
            left++;
        }

        quickSort(array, start, left-1);
        quickSort(array, left+1, end);
    }


    public static void main(String[] args) {
        int[] array = new int[]{2, 4, 1, 3, 5, 8, 6, 4};
        //new QuickSort().sort(array);
        QuickSort.quickSort(array, 0, array.length-1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }

}

