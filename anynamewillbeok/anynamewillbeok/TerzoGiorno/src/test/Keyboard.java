package test;
import java.util.Scanner;

public class Keyboard 
{
	//Stampare biglietto del cinema applicando sconti in base a diversi criteri.
	//QUALSIASI cliente in arrivo. 
	public static void main(String[] args) 
	{
		//prima variabile "keyboard" 
		Scanner keyboard=new Scanner(System.in);
		/*
		 * Scanner è uno strumento di lettura
		 */

		//Domande.		
		System.out.println("Insert a day name. (Sun); (Mon); (Tue); (Wed); (Thu); (Fri); (Sat).");
		String day=keyboard.nextLine();
		//System.out.println(day);
		
		
		System.out.println("Hi, what's your name?");
		String name=keyboard.nextLine();
		//System.out.println(name);
		
		System.out.println("What's your age?");
		String ageValue=keyboard.nextLine(); //legge una stringa
		int age=Integer.parseInt(ageValue); //.parseInt è il comando che appartiene a Integer che permette di aiutare int (che è un tipo primitivo)
		
		System.out.println("M/F? (M); (F).");
		String gender=keyboard.nextLine().toUpperCase(); //Comportamento delle stringhe che ha il compito di trasformare tutti i caratteri.
														 //Esiste anche .toLowerCase().
		
		System.out.println("Do you root for any team? (Y); (N).");
		String tifo=keyboard.nextLine().toUpperCase();
		
		double ticket=9.5; //Ho dichiarato il costo più alto
		
		String ans="Hi "+name+", your ticket costs $"+ticket;
		System.out.println(ans);
		
		boolean isM=gender.equals("M"); //con .toLowerCase()
		boolean isTifo=tifo.equals("Y");
		boolean isSun=day.equalsIgnoreCase("SUN"); //Non posso sapere a priori che giorno della settimana sarà.
		boolean isMon=day.equalsIgnoreCase("MON");
		boolean isTue=day.equalsIgnoreCase("TUE");
		boolean isWed=day.equalsIgnoreCase("WED");
		boolean isThu=day.equalsIgnoreCase("THU");
		boolean isFri=day.equalsIgnoreCase("FRI");
		boolean isSat=day.equalsIgnoreCase("SAT");
		
		if((isMon && isM) || (isTue && isTifo)) //DRY: Don't Repeat Yourself
			ticket=4.5;
		
			//System.out.println("Ticket price: $4.50");
		
		if(isSun)
			System.out.println("Ticket price: $2.90");
		keyboard.close();
		
		
			
		{
			
		}


	}

}
