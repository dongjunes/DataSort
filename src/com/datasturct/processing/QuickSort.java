package com.datasturct.processing;

import com.datasturct.mixing.Random;

/**
 * Created by dongjunekim on 2017-03-28.
 */
public class QuickSort {

    private int[] arr = new int[100];

    public QuickSort() {
        Random.mixArray(arr);
        QuickSort(arr, 1, arr.length);


    }

    public void QuickSort(int arr[], int left, int right) {
        if (left == right || left > right) {
            int piv = partition(arr, left, right);
        }
    }

    public int partition(int arr[], int left, int right) {
        int piv = arr[left - 1];
        for (int i = left; i < right; i++) {
            if (arr[i] < piv) {
                int temp = arr[i];
                arr[i] = piv;
                piv = temp;
                left++;
            }
        }


        return left;
    }

    public static void main(String args[]) {
        new QuickSort();
    }

}