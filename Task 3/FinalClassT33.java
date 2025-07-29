package task3;

final class Constants {
    public static final String APP_NAME = "MyApp";
}

// compile-time error
/*
class ExtendedConstants extends Constants {
    // cannot inherit from final class
}
*/
public class FinalClassT33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Name: " + Constants.APP_NAME);
	}

}
