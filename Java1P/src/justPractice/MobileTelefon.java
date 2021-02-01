package justPractice;

public class MobileTelefon {
	
	String display;
	String buttons;
	String body;
	boolean battery;
	boolean telefonStatus;
	
	public MobileTelefon(String display, String buttons, String body, boolean putBattery ) {
		this.display = display;
		this.buttons = buttons;
		this.body = body;
		this.battery = putBattery;
		
	}
	
	public MobileTelefon() {}
	
	public void call() {}
	public void turnOn() {
		if(battery == true) {
			telefonStatus = true;
			System.out.println("Mobile is turned on");
		}
		else
			System.out.println("No buttery. Please put battery into phone");
			
	}
	public void turnOff() {
		if(telefonStatus == true) {
			telefonStatus = false;
			System.out.println("Telefon is turned off. Good bye!");
		}
		else
			System.out.println("Telefon is already turned off!");
	}
	
	public boolean getBattery() {
	return battery;
	}
	
	public boolean getTelefonStatus() {
		return telefonStatus;
		}

}
