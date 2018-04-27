package first;
public class Tablice{
	public static void main(String[] args){
			int[] tablica = new int[10];
			
			for (int i = 0; i < 10; i++) tablica[i] = i+1;
			tablica [3] = 34;
			for (int i=0; i<10; i++) System.out.println("Kolejna komorka to: "+ tablica[i]);
			
			
			
	}

}