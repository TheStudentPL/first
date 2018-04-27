package first;
import java.util.Scanner;

public class Imiona_tab{
	public static void main(String[] args){
		String[] tablica = new String[5];
		
		System.out.println("Podaj pierwsze imie: ");
		Scanner first = new Scanner(System.in);
		tablica[0] = first.nextLine();
		System.out.println("Podaj drugie imie: ");
		tablica[1] = first.nextLine();
		System.out.println("Podaj trzecie imie: ");
		tablica[2] = first.nextLine();
		System.out.println("Podaj czwarte imie: ");
		tablica[3] = first.nextLine();
		System.out.println("Podaj piate imie: ");
		tablica[4] = first.nextLine();
		first.close();
		
		for(int i = 0; i<=4; i++){			
			System.out.println("Imie Nr :"+i+" to: " +tablica[i]);
		}
		
	}

}