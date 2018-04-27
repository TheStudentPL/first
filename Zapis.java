package first;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
	public static void main(String[] args){
		PrintWriter zapis = new PrintWriter('ala.txt'sa);
		zapis.println("Ala ma kota, a kot ma ale");
		zapis.close();
		
	
	}

}