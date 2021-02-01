package core2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		SeasonApp app = new SeasonApp();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input month: ");
		String currentMonth = br.readLine();
		app.getSeason(currentMonth);;
	}

}
