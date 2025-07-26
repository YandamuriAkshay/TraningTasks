package task2;

public class BankAccount {
	private int accNumber;
	private double balance;
	
	public BankAccount(int accNumber, double initialBalance) {
		this.accNumber = accNumber;
		this.balance = initialBalance;
	}
	
	public void desposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if (amount <= balance)
			balance -= amount;
		else 
			System.out.println("Insuficient Balance");
	}
	
	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc = new BankAccount(101, 1000);
		acc.desposit(600);
		acc.withdraw(300);
		System.out.println("Balance:  " + acc.getBalance());
	}

}
