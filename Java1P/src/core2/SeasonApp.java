package core2;

public class SeasonApp {

	public void main(String currentMonth) {
		System.out.println(currentMonth.substring(0,1).toUpperCase()+currentMonth.substring(1).toLowerCase());
		switch (currentMonth.toLowerCase()) {
		case "december":
		case "january":
		case "february": 
			System.out.println(Seasons.WINTER);
			break;
		case "march":
		case "april": 
		case "may":
			System.out.println(Seasons.SPRING);
			break;
		case "june":
		case "jule":
		case "august":
			System.out.println(Seasons.SUMMER);
			break;
		case "september": 
		case "october":
		case "november":
			System.out.println(Seasons.AUTUMN);
			break;
		default : 
			System.out.println("No such month");
			break;
		}
	}
}
