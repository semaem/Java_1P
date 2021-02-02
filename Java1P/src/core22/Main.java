package core22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LimitsOfTypesApp app = new LimitsOfTypesApp();
		app.getAllValueLimits();
	    System.out.print("Input value type: ");
		Scanner myScanner = new Scanner(System.in);
		String input = myScanner.nextLine();
		app.getValueLimitsByInput(input);
	}
}
