package first;
import java.util.Scanner;

public class Pobierz_tab{
	public static void main(String[] args){
		
		int podaj;
		System.out.println("Podaj liczbe elementow (n): ");
		Scanner a = new Scanner(System.in);
		podaj = a.nextInt();
		a.close();
		
		if(podaj>0){
			int[] tablica = new int[podaj];
			int ilosc = podaj;
			int i = 0;
			while(ilosc != 0 && i < podaj){
				tablica[i] = i+1;
				System.out.println("Element tablicy nr: "+i+" to: "+tablica[i]);
				i+=1;
				ilosc-=1;
			}
		
		}else{ System.out.println("Error! Podales zero lub liczbe ujemna! Wyjscie! ");}
	
	
	}


}

/*1.13 Utwórz tablicę typu int przechowującą n elementów - gdzie n jest parametrem pobieranym od użytkownika. 
Następnie wypełnij ją liczbami od 1 do n i wyświetl zawartość na ekranie przy pomocy pętli while.
https://javastart.pl/static/podstawy-jezyka/tablice-jednowymiarowe/
*/