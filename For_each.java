package first;
public class For_each{
	public static void main(String[] args){
		int[] tablica = new int[10];
		
		//wypelnienie tablicy
		for (int i = 0; i<10; i++){
			tablica[i]=i+1;
		}
		
		// wyswietlenie petla for each
		for(int x: tablica)
			System.out.println(x);
	
	}

}