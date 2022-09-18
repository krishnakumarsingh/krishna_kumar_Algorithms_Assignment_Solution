package com.stockers.services;

public class MergeSortImplimentation {
	public void merge(double[] array, int low, int mid, int high) {
		double leftArray[] = new double[mid - low + 1];
		double rightArray[] = new double[high - mid];
		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = array[low + i];
		for (int i = 0; i < rightArray.length; i++)
			rightArray[i] = array[mid + i + 1];
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = low; i < high + 1; i++) {
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] < rightArray[rightIndex]) {
					array[i] = leftArray[leftIndex];
					leftIndex++;
				} else {
					array[i] = rightArray[rightIndex];
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				array[i] = leftArray[leftIndex];
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				array[i] = rightArray[rightIndex];
				rightIndex++;
			}
		}
	}

	public void sort(double[] stockPrice, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			sort(stockPrice, left, mid);
			sort(stockPrice, mid + 1, right);
			merge(stockPrice, left, mid, right);
		}
	}
}
