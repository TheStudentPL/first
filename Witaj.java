package first;
import java.util.Scanner;

public class Witaj{
	public static void main(String[] args){
		String imie;
		Scanner odczyt = new Scanner(System.in); //konstruktor - obiekt odczyt do przejecia danych
		imie = odczyt.nextLine(); // odebranie jednej lini znakow
		System.out.println("Witomy " + imie);
	}


}