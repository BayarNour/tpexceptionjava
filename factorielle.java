package tpexception;

public class factorielle {
	
	public static void main (String[] args)
	{
	int i, 
	nbEntiers=0,
	fact=1;
	int ancien;
	try {
	
	
	
	nbEntiers= Integer.parseInt(args[0]);
	if(nbEntiers <0) {
		throw new negative_exception();
	}
	
	else {
		if(nbEntiers >20) {
			throw new superieur_20();
			
		}else {
			for (i=2;i<= nbEntiers;i++)
			{
			ancien=fact;
			fact *= i;
			}
			System.out.println(" Voila la factorielle des "+ nbEntiers +
					" premiers entiers : "+ fact );
		}}
		
		
		
		
	
	

			}
	
	
	
	
	catch(ArrayIndexOutOfBoundsException a){
		System.out.println("erreur vide");
		
	}
	
	catch(NumberFormatException n){
		System.out.println("erreur non entier");
		
	}
	catch(negative_exception ne){
		System.out.println("erreur nombre negative ");
		
	}
	catch(superieur_20 su){
		System.out.println("erreur nombre sup a 20 ");
		
	}
	}

}
