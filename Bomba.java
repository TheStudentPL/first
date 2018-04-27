package first;
import java.util.Scanner;


public class Bomba	{
	public static void main(String[] args){
		int liczba;
		System.out.println("Podaj liczbe calkowita dodatnia: ");
		Scanner a = new Scanner(System.in);
		liczba = a.nextInt();
		a.close();
		
		if (liczba>0) {
		System.out.println("OK! Podales liczbe calkowita: "+liczba);
		System.out.println("-------- PETLA FOR ------------ ");
		int licznik = liczba;
		for (int i = licznik; i >= 0 ; i--){
			System.out.println("Bomba wybuchnie za: " + licznik);
			licznik-=1;
		}
		System.out.println("-------- PETLA DO WHILE ------------ ");
		int liczenie = liczba;
		do{
			System.out.println("Bomba wybuchnie za: "+liczenie);
			liczenie-=1;
		}
		while(liczenie>=0);
		
		System.out.println("-------- PETLA WHILE ------------ ");
		int liczydlo = liczba;
		while (liczydlo>=0){
			System.out.println("Bomba wybuchnie za: "+ liczydlo);
			liczydlo-=1;
		}
		
		} 
		else {
			System.out.println("ERROR! Podales liczbe ujemna badz zero!: ");
		}
	
	}

}