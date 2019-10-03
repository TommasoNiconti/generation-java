package test;

public class Age {

	public static void main(String[] args) {
		int age1, age2, age3, age4, age5, n;
		double avg, sum;
		String ans;
		
		age1=18; age2=15; age3=10; age4=13; age5=10; 
		n=5;
		
		sum=age1+age2+age3+age4+age5;
		avg=sum/n;
		
		ans="Date le seguenti età:\n\n"+age1+", "+age2+", "+age2+", "+age4+", "+age5+
				"\n\nLa somma è: "+sum+"\n\nLa media è: "+avg;
		
		//OUTPUT --> ultima cosa
		System.out.println(ans);
		double d= Double.MAX_VALUE;
	}

}
