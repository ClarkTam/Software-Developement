import java.util.Scanner;


class Account {
		double balance = 100;
		double withdraw = 0;
		double deposit = 0;
		Scanner input = new Scanner(System.in);
		Account() {
			balance = 100;
		}
		int RESTARTid = 0;
		
		public double getbalance() {
			return balance;
		}
		public void setbalance(double newbalance) {
			balance = newbalance;
		}
	
	
		public double withdraw(double newwithdraw) {
			withdraw = newwithdraw;
			balance -= withdraw;
			return balance;
		}
		public double deposit(double newdeposit) {
			deposit = newdeposit;
			balance += deposit;
			return balance;
		}
	
	
}