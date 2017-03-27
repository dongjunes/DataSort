package mergesort;

import com.datasturct.mixing.Random;

public class MergeSort {

	int arr[] = new int[7];

	public MergeSort() {
		Random.mixArray(arr);
		merge(arr, 0, arr.length);
	}

	public void merge(int arr[], int left, int right) {
		int mid = 0;
		if (left < right) {

			mid = (left + right) / 2;

			merge(arr, left, mid);
			merge(arr, mid + 1, right);

			mergeSort(arr, left, mid, right);
		}

	}

	public void mergeSort(int arr[], int left, int mid, int right) {
		int[] sort = new int[arr.length];
		int lIdx = left;
		int rIdx = right;
		int idx = left;

		while (lIdx <= mid && rIdx <= right) {
			if (arr[rIdx] < arr[lIdx]) {
				sort[idx++] = arr[rIdx++];
			} else {
				sort[idx++] = arr[lIdx++];
			}
		}

		
		
	}

	public void printDatas(int left, int right) {
		for (int i = left; i < right; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		new MergeSort();
	}

}
