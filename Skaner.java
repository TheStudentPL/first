package first;
import java.util.Scanner;


public class Skaner{
	public static void main(String[] args){
		double pierwsza;
		double druga;
		
		System.out.println("Podaj pierwsza liczbe: ");
		Scanner liczbaa = new Scanner(System.in); // konstruktor obiektu liczbaa
		pierwsza = liczbaa.nextDouble();// wczytanie liczby a
		liczbaa.close();
		
	
		System.out.println("Podaj druga liczbe: ");
		Scanner liczbab = new Scanner(System.in); // konstruktor obiektu liczbab
		druga = liczbab.nextDouble();// wczytanie liczby b
		liczbab.close();
	
		System.out.println("Suma dwoch podanych liczb to: "+ (pierwsza+druga));
		System.out.println("Roznica dwoch podanych liczb to: "+ (pierwsza-druga));
		System.out.println("Iloczyn dwoch podanych liczb to: "+ (pierwsza*druga));
		System.out.println("Iloraz dwoch podanych liczb to: "+ (pierwsza/druga));
	
	
	}

}

/*
1.7 Utwórz dwie zmienne typu double. Następnie przy użyciu klasy Scanner pobierz od użytkownika dwie liczby i wykonaj na nich dodawanie, 
odejmowanie, mnożenie i dzielenie, wyświetlając wyniki w kolejnych liniach na konsoli.
https://javastart.pl/static/podstawy-jezyka/podstawowe-wejscie-wyjscie/

*/