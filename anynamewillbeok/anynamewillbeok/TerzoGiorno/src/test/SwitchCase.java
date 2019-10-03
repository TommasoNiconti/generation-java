package test;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		//DOMANDA: stampare il numero di giorni di uno specifico mese.
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You're here to know the number of days in a specific month?\nChoose your month then!");
		String month=keyboard.nextLine();
		String ans= "";
		
//		if(month.equalsIgnoreCase("April"))
//			ans="It has 30 days.";
//		if(month.equalsIgnoreCase("June"))
//			ans="It has 30 days.";
//		if(month.equalsIgnoreCase("September"))
//			ans="It has 30 days.";
//		if(month.equalsIgnoreCase("November"))
//			ans="It has 30 days.";
//		if(month.equalsIgnoreCase("January"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("March"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("May"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("July"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("August"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("October"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("December"))
//			ans="It has 31 days.";
//		if(month.equalsIgnoreCase("February"))
//			ans="It has 28/29 days.";
		
		switch(month.toUpperCase()) {
			case"APRIL":
				ans="It has 30 days.";
				break;
			case"JUNE":
				ans="It has 30 days.";
				break;
			case"SEPTEMBER":
				ans="It has 30 days.";
				break;
			case"NOVEMBER":
				ans="It has 30 days.";
				break;
			case"JANUARY":
				ans="It has 31 days.";
				break;
			case"MARCH":
				ans="It has 31 days.";
				break;
			case"MAY":
				ans="It has 31 days.";
				break;
			case"JULY":
				ans="It has 31 days.";
				break;
			case"AUGUST":
				ans="It has 31 days.";
				break;
			case"OCTOBER":
				ans="It has 31 days.";
				break;
			case"DECEMBER":
				ans="It has 31 days.";
				break;
			case"FEBRUARY":
				ans="It has 28, sometimes you may find 29 days in this month."
						+ "Would you like to kow why? (Y)es; (N)o.";
				System.out.println(ans);//!
				String yesno=keyboard.nextLine();
				
				boolean isY=yesno.equalsIgnoreCase("Y");
				boolean isN=yesno.equalsIgnoreCase("N");
				
				if(isY)
					ans="A Year has 365 days and 4 hours, by this reason every four years February has 29 days.";
				if(isN)
					ans="Well... ok.";
				
				break;
				default:
					ans="Am I a joke to you? D:";
		}
		
		
			
		System.out.println(ans);
		
		keyboard.close();

	}

}
