package test;
import java.util.Scanner;

public class Como 
{

	public static void main(String[] args) 
	{
		Scanner keyboard=new Scanner(System.in); //DICHIARA PRIMA
		double ticket=10; double discount1= 5; double discount2= 2;
		
		System.out.println("Saluti, come ti chiami?");
		String name=keyboard.nextLine();
		
		System.out.println("Qual è il tuo ruolo nella società? (S)tudente; (I)nsegnante.");
		String prof=keyboard.nextLine().toUpperCase();
		
		System.out.println("Quanti anni hai?");
		String ageValue=keyboard.nextLine();
		double age=Double.parseDouble(ageValue);
		
		System.out.println("Dove abiti?");
		String city=keyboard.nextLine().toUpperCase();
		
		boolean isVarenna=city.equalsIgnoreCase("Varenna");
		boolean isVezio=city.equalsIgnoreCase("Vezio");
		boolean isPerledo=city.equalsIgnoreCase("Perledo");
		
		boolean isS=prof.equalsIgnoreCase("S");
		boolean isI=prof.equalsIgnoreCase("I");
		
		if(age<5 || age>=70)
		{
			ticket=ticket-5;
		}
		if(isS || isI)
		{
			ticket=ticket-2;
		}
		if(isVarenna || isVezio || isPerledo)
		{
			ticket=0;
		}
		
		System.out.println("Ciao "+name+",  il tuo biglietto costa "+ticket);
		
		
		

	}

}
