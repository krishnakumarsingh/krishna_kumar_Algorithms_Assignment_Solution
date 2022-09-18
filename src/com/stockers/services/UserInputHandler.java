package com.stockers.services;

import java.util.Arrays;

import java.util.Scanner;

public class UserInputHandler {
	Scanner sc = new Scanner(System.in);

	public void userHandler(int input, double stockPrice[], int riseCount, int decCount) {

		MergeSortImplimentation mergeSort = new MergeSortImplimentation();
		mergeSort.sort(stockPrice, 0, stockPrice.length - 1);
		switch (input) {
		case 1:
			stockPriceAscn(stockPrice);
			break;
		case 2:
			stockPriceDesc(stockPrice);
			break;
		case 3:
			stockRiseCount(riseCount);
			break;
		case 4:
			stockDecCount(decCount);
			break;
		case 5:
			stockSearch(stockPrice);
			break;
		case 0:
			exit();
			break;
		default:
			System.out.println("Please enter a valid input");
		}
	}

	void stockPriceAscn(double stockPrice[]) {
		System.out.println("Stock prices in ascending order are :");
		System.out.print(Arrays.toString(stockPrice).replace("[", "").replace("]", "").replace(",", ""));
	}

	void stockPriceDesc(double stockPrice[]) {
		System.out.println("Stock prices in descending order are :");
		for (int i = stockPrice.length - 1; i >= 0; i--) {
			System.out.print(stockPrice[i] + " ");
		}
	}

	void stockRiseCount(int riseCount) {
		System.out.println("Total no of companies whose stock price rose today : " + riseCount);
	}

	void stockDecCount(int decCount) {
		System.out.println("Total no of companies whose stock price declined today : " + decCount);
	}

	void stockSearch(double stockPrice[]) {
		System.out.println("enter the key value");
		double key = sc.nextDouble();
		int last = stockPrice.length - 1;
		BinarySearchImplimentation binarySearchImp = new BinarySearchImplimentation();
		binarySearchImp.binarySearch(stockPrice, 0, last, key);

	}

	void exit() {
		sc.close();
		System.out.println("Exited successfully");
	}

}
