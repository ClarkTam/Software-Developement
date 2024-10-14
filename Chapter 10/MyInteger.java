import javax.swing.*;

class MyInteger {

	static int value;
	
	MyInteger(int svalue) {
		svalue = svalue;
	}
	
	public static int getValue(int value) {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isPrime() {
		boolean flag = false;
			// 0 and 1 are not prime numbers
			if (value == 0 || value == 1) {
					flag = true;
			}
			for (int i = 2; i <= value / 2; ++i) {
				// condition for nonprime number
				if (value % i == 0) {
					flag = true;
					break;
				}
			}
		if (!flag) {
			return true;
		}else{
			return false;
		}
	}
	
	
	public static boolean isEven(int svalue) {
		if (svalue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
		public static boolean isOdd(int svalue) {
		if (svalue % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(int svalue) {
		boolean flag = false;
			// 0 and 1 are not prime numbers
			if (svalue == 0 || svalue == 1) {
					flag = true;
			}
			for (int i = 2; i <= svalue / 2; ++i) {
				// condition for nonprime number
				if (svalue % i == 0) {
					flag = true;
					break;
				}
			}
		if (!flag) {
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public static boolean isEven(MyInteger svalue) {
		if (svalue % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
		public static boolean isOdd(MyInteger svalue) {
		if (svalue % 2 != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean isPrime(MyInteger svalue) {
		boolean flag = false;
			// 0 and 1 are not prime numbers
			if (svalue == 0 || svalue == 1) {
					flag = true;
			}
			for (int i = 2; i <= svalue / 2; ++i) {
				// condition for nonprime number
				if (svalue % i == 0) {
					flag = true;
					break;
				}
			}
		if (!flag) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean equals(int value) {
		if (value == svalue) {
			return true;
		}else {
			return false;
		}
	}
	public boolean equals(MyInteger svalue) {
		if (value == svalue) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int parseInt(char[] array) {
		int column = array.length;
		c = 0;
		int number = 0;
		while (c < column) {
			String.valueOf(array[c]);
			number += integer.parseInt(array[c]);
			c++;
		}
		return number;
	}
	public static int parseInt(String string) {
		return integer.parseInt(string);
	}
		

	
}