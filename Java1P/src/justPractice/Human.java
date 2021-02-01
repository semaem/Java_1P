package justPractice;

public class Human {

	public static void main(String[] args) {
		MobileTelefon telefonTFT = new MobileTelefon("tft", "plastic", "black", false);
		System.out.println("Phone status is " + telefonTFT.getTelefonStatus());
		telefonTFT.turnOn();
		System.out.println("Phone status is " + telefonTFT.getTelefonStatus());
		telefonTFT.turnOff();
		System.out.println("Phone status is " + telefonTFT.getTelefonStatus());
		

	}

}
