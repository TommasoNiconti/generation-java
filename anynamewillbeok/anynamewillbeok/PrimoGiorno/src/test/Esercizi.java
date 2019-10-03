package test;

public class Esercizi {
	//Dati area e costo al metro quadro, calcolare costo della casa
	public static void main(String[] args) 
	{
		//DICHIARAZIONE
		int b, h, cosm2, a, cosCasa; 
		String ans;
		
		//INPUT
		b=20; h=10; cosm2=1300;
		
		//CALCOLI
		a=b*h; cosCasa=a*cosm2;
		
		//OUTPUT
		ans= "La metratura della casa è: "+a+" m^2;"+
			 "\nIl costo al metro quadro è: "+cosm2+" € al m^2;"+
			 "\nIl prezzo finale della casa è: "+cosCasa+" €.";
		
		int a_g=1000;
		a=a+a_g;
		cosCasa=a*cosm2;
		
		ans="La casa di "+a+" m2 costa "+cosCasa+" €.";
		System.out.println(ans);
	}

}
