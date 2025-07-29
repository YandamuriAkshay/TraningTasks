package task3;

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String msg) {
        super(msg);
    }
}
public class BankingApp {
	private double balance = 2000;

    public void withdraw(double amount) throws MinimumBalanceException {
        if ((balance - amount) < 1000) {
            throw new MinimumBalanceException("Cannot withdraw. Minimum balance ₹1000 required.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankingApp app = new BankingApp();

        try {
            app.withdraw(1500);
        } catch (MinimumBalanceException e) {
            System.out.println("Transaction Failed: " + e.getMessage());
        }
	}

}
