package test;

public class Rettangolo 
{

	public static void main(String[] args) 
	{
		//problema: calcolare 2p e A di un rettangolo.
		//DICHIARAZIONE
		int b, h, p, a;
		String ans;
		//INPUT
		b=10; h=5;; 
		//CALCOLI
		p=2*(b+h); a=b*h;
		ans = "Base = "+b+"\nAltezza = "+h+"\nArea = "+a+"\nPerimetro = "+p;
		//OUTPUT
		System.out.println(ans);
		
	}

}
