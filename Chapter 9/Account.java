import java.sql.*;

class Account {
	int id = 0;
	double balance = 0;
	double IntRate = 0;
	
	private int id(int id) {
		return id;
	}
	private double balance(double balance) {
		return balance;
	}
	private double annualInterestRate(double IntRate) {
		return IntRate;
	}
	private Date dateCreated(Date date) {
		return date;
	}
	
	
	Account() {
	}
	
	
	Account(int newid, double newbalance) {
		id = newid;
		balance = newbalance;
	}
	
	
	public int getID(int id) {
		return id;
	}
	void setID(int newid) {
		id = newid;
	}
	public double getBalance(double balance) {
		return balance;
	}
	void setBalance(double newbalance) {
		balance = newbalance;
	}
	public double getAnnualIntRate(double IntRate) {
		return IntRate;
	}
	void setIntRate(double newIntRate) {
		IntRate = newIntRate;
	}
	public Date getDate(Date date) {
		return date;
	}
	
	
	
	public double getMonthlyInterestRate() {
		Double monthlyIntRate = IntRate/12;
		return monthlyIntRate;
	}
	public double getMonthlyInterest(Double monthlyIntRate, double balance){
		Double monthlyInt = monthlyIntRate * balance;
		return monthlyInt;
	}
	double withdraw = 0;
	double deposit = 0;
	public double withdraw(double balance) {
		balance -= withdraw;
		return balance;
	}
	public double deposit(double balance) {
		balance += deposit;
		return balance;
	}
	
	
	
}
	