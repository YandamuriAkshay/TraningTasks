package task3;

class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class Bank {
	
	public static void checkBalance(double balance) throws InvalidAccountException {
        if (balance < 0) {
            throw new InvalidAccountException("Account balance cannot be negative.");
        } else {
            System.out.println("Account is valid with balance ₹" + balance);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            checkBalance(-500);
        } catch (InvalidAccountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
	}

}
