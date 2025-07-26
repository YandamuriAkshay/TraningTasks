package task2;

interface Logger{
	default void logInfo() {
		System.out.println("Info: Application Started.");
	}
	
	static void logError() {
		System.out.println("Error: Something went Wrong");
	}
}

public class AppLogger implements Logger{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger a = new AppLogger();
		a.logInfo();
		Logger.logError();
	}
}
