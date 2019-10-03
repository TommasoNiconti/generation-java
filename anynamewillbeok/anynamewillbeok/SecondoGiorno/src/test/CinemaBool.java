package test;

public class CinemaBool {

	public static void main(String[] args) {
		
		double ticket=9.5;
		double dis1=5;
		String day="Tuesday"; String gender="Male"; String tifoso="Si"; String ans="";
		boolean isMonday = day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("mon"); 
		boolean isTuesday = day.equalsIgnoreCase("tuesday")||day.equalsIgnoreCase("tue"); 
		boolean isSunday = day.equalsIgnoreCase("sunday")||day.equalsIgnoreCase("sun");
		boolean isMale = gender.equalsIgnoreCase("male")||gender.equalsIgnoreCase("mon");
		boolean isTifoso = tifoso.equalsIgnoreCase("si")||gender.equalsIgnoreCase("mon");

		if((isMonday && isMale) || (isTuesday && isMale))
		{
			ticket=4.5;	
		}
		
		if(isTuesday && isTifoso)
		{
			ticket=5.5;
		}
			
			ans="Il biglietto costa "+ticket+" €.";

		System.out.println(ans);
		}

}
