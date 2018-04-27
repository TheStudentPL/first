package first;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Odczyt{
	public static void main(String[] args) throws FileNotFoundException{
		/*File plik = new File("ala.txt"); 
		Scanner odczyt = new Scanner(plik);*/
		Scanner odczyt = new Scanner(new File("ala.txt"));
		
		String zdanie = odczyt.nextLine();
		System.out.println(zdanie);
	
	}

}

