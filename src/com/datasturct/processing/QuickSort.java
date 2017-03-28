package com.datasturct.processing;

/**
 * Created by dongjunekim on 2017-03-28.
 */
public class QuickSort {

    public QuickSort() {
        /*Quicksort(A as array, low as int, high as int){
            if (low < high){
                pivot_location = Partition(A,low,high)
                Quicksort(A,low, pivot_location)
                Quicksort(A, pivot_location + 1, high)
            }
        }
        Partition(A as array, low as int, high as int){
            pivot = A[low]
            leftwall = low

            for i = low + 1 to high{
                if (A[i] < pivot) then{
                    swap(A[i], A[leftwall])
                    leftwall = leftwall + 1
                }
            }
            swap(pivot,A[leftwall])

            return (leftwall)}*/ //Pseudo code
    }

    public static void main(String args[]) {
        new QuickSort();
    }

}
