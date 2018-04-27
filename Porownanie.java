package first;
import java.util.Scanner;

public class Porownanie{
	public static void main(String[] args){
		int pierwsza;
		int druga;
		
		System.out.println("Podaj pierwsza liczbe calkowita: ");
		Scanner liczbaa = new Scanner(System.in);
		pierwsza = liczbaa.nextInt();
		
		System.out.println("Podaj druga liczbe calkowita: ");
		Scanner liczbab = new Scanner(System.in);
		druga = liczbab.nextInt();
		
		if(pierwsza>druga){
			System.out.println("Wieksza jest liczba pierwsza "+ pierwsza);			
		} else if (pierwsza<druga){
			System.out.println("Wieksza jest liczba druga "+ druga);
		} else System.out.println("Liczby sa rowne GOD DAMMIT! ");
	
	}


}