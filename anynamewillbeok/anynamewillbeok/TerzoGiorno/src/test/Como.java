package test;
import java.util.Scanner;

public class Como 
{

	public static void main(String[] args)
	{
		Scanner keyboard=new Scanner(System.in); //DICHIARA PRIMA
		double ticket=10;
		
		System.out.println("Saluti, come ti chiami?");
		String name=keyboard.nextLine();
		
		System.out.println("Dove abiti?");
		String city=keyboard.nextLine().toUpperCase();
		boolean isCity=city.equalsIgnoreCase("Varenna")
				||city.equalsIgnoreCase("Vezio")
				||city.equalsIgnoreCase("Perledo");
		if(isCity) {
			ticket=0;
			System.out.println("Ciao "+name+", il tuo biglietto costa "+ticket+" €.");
		}
		else {
			System.out.println("Quanti anni hai?");
			String ageValue=keyboard.nextLine();
			int age=Integer.parseInt(ageValue);
			
			boolean isAgeDis=age<5||age>=70;
			
			System.out.println("Qual è la tua professione? (S)tudente; (I)nsegnante.");
			String prof=keyboard.nextLine().toUpperCase();
			
			boolean isProf=prof.equalsIgnoreCase("S")
					||prof.equalsIgnoreCase("I");
			
			if(isAgeDis) {
				ticket=ticket-5;
			}
			if(isProf) {
				ticket=ticket-2;
			}
			System.out.println("Ciao "+name+", il tuo biglietto costa "+ticket+" €.");
		}
		keyboard.close();
		
		
		
		
//		System.out.println("Qual è la tua professione? (S)tudente; (I)nsegnante.");
//		String prof=keyboard.nextLine().toUpperCase();
//		
//		System.out.println("Quanti anni hai?");
//		String ageValue=keyboard.nextLine();
//		double age=Double.parseDouble(ageValue);
		
	
		
		
//		boolean isAgeDis=age<5||age>=70; 
//		
//		boolean isCity=city.equalsIgnoreCase("Varenna")
//					||city.equalsIgnoreCase("Vezio")
//					||city.equalsIgnoreCase("Perledo");
//		
		//METODO PIù LUNGO:
		//boolean isVarenna=city.equalsIgnoreCase("Varenna");
		//boolean isVezio=city.equalsIgnoreCase("Vezio");
		//boolean isPerledo=city.equalsIgnoreCase("Perledo");
		
//		boolean isProf=prof.equalsIgnoreCase("S")
//					||prof.equalsIgnoreCase("I");		
		//METODO PIù LUNGO:
		//boolean isS=prof.equalsIgnoreCase("S");
		//boolean isI=prof.equalsIgnoreCase("I");
		
		
		
		

	}

}
