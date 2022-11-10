package zadaca4;
import java.util.Scanner;

public class GlavnaKlasa {

	public static void main(String[] args) {
		int frlanja;
		Brojach pismo= new Brojach();
		Brojach glava= new Brojach();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Kolku pati sakate da ja frlite parichkata? Vnesete: ");
		frlanja=scan.nextInt();
		
		while(frlanja>0)
		{
			pismo.restart();
			glava.restart();
			
			for (int i=0; i<frlanja; i++)
			{
				if (Math.random()<0.5)
					pismo.broi();
				else
					glava.broi();
			}
			
		System.out.println("Broj na frlanja na parichkata: "+frlanja);
		System.out.println("Padnati glavi: " + glava.b);
		System.out.println("Padnati pisma: "+ pismo.b);
		
		System.out.println("Za povtorno frlanje, vnesete broj na frlanja: ");
		frlanja=scan.nextInt();
		}
scan.close();
	}

}
