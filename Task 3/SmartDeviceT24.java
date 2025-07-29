package task3;

interface Controllable {
    void turnOn();

    default void status() {
        System.out.println("Device is running smoothly");
    }

    static void deviceInfo() {
        System.out.println("SmartDevice - Internet connected home appliance");
    }
}

class SmartFan implements Controllable {
    public void turnOn() {
        System.out.println("SmartFan turned on.");
    }
}

public class SmartDeviceT24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 SmartFan fan = new SmartFan();
	        fan.turnOn();
	        fan.status();
	        Controllable.deviceInfo();
	}

}
