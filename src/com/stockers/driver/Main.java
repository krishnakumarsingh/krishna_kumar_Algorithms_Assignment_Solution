package com.stockers.driver;

import java.util.Scanner;

import com.stockers.services.UserInputHandler;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int companyCount = 0;
		System.out.println("Enter the no of companies");
		companyCount = sc.nextInt();
		double stockPrice[] = new double[companyCount];
		int riseCount = 0;
		int decCount = 0;
		for (int i = 0; i < companyCount; i++) {
			boolean isHigh = false;
			System.out.println("Enter current stock price of the company " + (i + 1));
			stockPrice[i] = sc.nextDouble();
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			isHigh = sc.nextBoolean();
			if (isHigh) {
				riseCount++;
			} else {
				decCount++;
			}
		}
		int userInput = 6;
		while (userInput != 0) {
			System.out.println("\n\n----------------------------\n" + "Enter the operation that you want to perform\n"
					+ "1. Display the companies stock prices in ascending order\n"
					+ "2. Display the companies stock prices in descending order\n"
					+ "3. Display the total no of companies for which stock prices rose today\n"
					+ "4. Display the total no of companies for which stock prices declined today\n"
					+ "5. Search a specific stock price\n" + "6. press 0 to exit\n" + "----------------------------\n");
			userInput = sc.nextInt();
			UserInputHandler userInputHandler = new UserInputHandler();

			userInputHandler.userHandler(userInput, stockPrice, riseCount, decCount);
		}

		sc.close();

	}
}
