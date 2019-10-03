package test;
import java.util.Scanner;


public class BuildingPC {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String name="Tom";
		
		System.out.println("Hi "+name+", let's build your PC!"
				+ "Choose your CPU. (i3); (i5); (i7).");
		String cpu=keyboard.nextLine();
		
		System.out.println("Ok, now choose your RAM! (DDR3); (DDR4); (DDR5).");
		String ddr=keyboard.nextLine();
		
		System.out.println("How many GB of RAM do you want? (1-64).");
		String nGBValue=keyboard.nextLine();
		int nGB=Integer.parseInt(nGBValue);
		
		
		
		String ans="";
		
		double priceCpu=0;
		
		switch (cpu) {
			case "i3":
				priceCpu=50;
				ans="price $"+priceCpu;
				break;
			case "i5":
				priceCpu=80;
				ans="price $"+priceCpu;
				break;
			case "i7":
				priceCpu=150;
				ans="price $"+priceCpu;
				break;
				default:
					ans="Nope, try again!";
		}
		
		int nGBRAM=0;
		double priceDdr=0;
		
		switch (ddr) {
			case "DDR3":
				priceDdr=50;
				nGBRAM=1*nGB;
				ans="price $"+priceDdr;
				break;
			case "DDR4":
				priceDdr=70;
				nGBRAM=3*nGB;
				ans="price $"+priceDdr;
				break;
			case "DDR5":
				priceDdr=90;
				nGBRAM=5*nGB;
				ans="price $"+priceDdr;
				break;
				default:
				ans="Nope, try again!";
	}
		boolean isGood=nGBRAM>=16 && (cpu.equalsIgnoreCase("i5")||cpu.equalsIgnoreCase("i7"));
		
		if(isGood)
			ans="Your PC is good!";
			else
				ans="your PC could be better";
				
				System.out.println("Ok let's see..."
						+ "Your PC has ");
		

}
}
