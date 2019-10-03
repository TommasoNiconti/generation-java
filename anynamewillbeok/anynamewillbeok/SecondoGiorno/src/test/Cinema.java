package test;

class Cinema {

	public static void main(String[] args) {
		
		String patente="no";
		int age=15;
		boolean isMaggiorenne=age>=18;
		String ans="";
		
		if(isMaggiorenne && patente.equalsIgnoreCase("si")) {
			
		}
		else 
		{
			
		}
		if(age>=19) 
		{
			ans="Puoi guidare!";
		}
		
		if (isMaggiorenne)
		{
			ans=ans+"\nPuoi votare!\nPuoi vedere i film VM18!";
		}
		
		if(!isMaggiorenne)
		{
			ans="Puoi fare tante altre cose!";
		}
		System.out.println(ans);
		}
		
	}
