package task3;

interface RemoteControl1 {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery is at 75%");
    }

    static void info() {
        System.out.println("RemoteControl interface handles electronic device control");
    }
}

class STV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is now ON");
    }
}
public class StaticMethodT22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl1.info();
	}

}
