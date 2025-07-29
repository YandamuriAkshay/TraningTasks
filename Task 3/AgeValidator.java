package task3;

public class AgeValidator {
	
	static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        } else {
            System.out.println("Access granted.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            validateAge(16);
        } catch (Exception e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
	}

}
