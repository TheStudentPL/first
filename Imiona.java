package first;
import java.util.Scanner;

public class Imiona{
	public static void main(String[] args){
		String imiea;
		
		System.out.println("Czesc podaj swoje imie: ");
		Scanner twojeimie = new Scanner(System.in);
		imiea = twojeimie.nextLine();
		
		switch(imiea){
			case "Maciej":
			System.out.println("Czesc "+ imiea);
			break;
			case "Mirek":
			System.out.println("Czesc "+ imiea);
			break;
			case "Piotr":
			System.out.println("Czesc "+ imiea);
			break;
			default:
			System.out.println("Nie znam Cie! Uciekaj stad! "+imiea);
		
		}
	
	}


}