package task3;

class AppConfig {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    public static final String USER = "admin";
    public static final String PASSWORD = "1234";
}

public class Settingt34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connecting to DB at: " + AppConfig.DB_URL);
        System.out.println("User: " + AppConfig.USER);
	}

}
