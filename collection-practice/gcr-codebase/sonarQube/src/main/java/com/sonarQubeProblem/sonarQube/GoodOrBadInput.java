package com.sonarQubeProblem.sonarQube;

public class GoodOrBadInput {
   
	public String inputChecker(int num) {
		if(num < 0) {
			return "Bad input";
		} else {
			return "Good input";
		}
	}

	public String validateRange(int num, int min, int max) {
		if (num < min || num > max) {
			return "Out of range";
		}
		return "In range";
	}

	public boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		if (num <= 3) {
			return true;
		}
		if (num % 2 == 0 || num % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= num; i += 6) {
			if (num % i == 0 || num % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumOfDigits(int num) {
		int sum = 0;
		int n = Math.abs(num);
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

	public boolean isEven(int num) {
		return num % 2 == 0;
	}

	public String getNumberType(int num) {
		if (num == 0) {
			return "Zero";
		} else if (num > 0 && isEven(num)) {
			return "Positive Even";
		} else if (num > 0) {
			return "Positive Odd";
		} else if (isEven(num)) {
			return "Negative Even";
		} else {
			return "Negative Odd";
		}
	}
}
