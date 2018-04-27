package first;
public class Kalkulator2{
	public static void main(String[] args){
		double a = 3.4;
		double b = 5.6;
		double c = 7.6;
		
		double wynik;
		
		// (a+b)*c
		wynik = (a+b)*c;
		System.out.println("(a+b)*c");
		System.out.println(wynik);
		
		//a-b/c
		wynik = a-b/c;
		System.out.println("a-b/c");
		System.out.println(wynik);
		
		//a++ inkrementacja
		a++;
		b++;
		c++;
		
		// porownanie
		
		System.out.println("Porownanie Czy (a+b)>c? : ");
		boolean czy_wieksze;
		czy_wieksze = ((a+b)>c);
		System.out.println(czy_wieksze);
		
		
		System.out.println("Porownanie Czy a==b? : ");
		boolean czy_rownasie;
		czy_rownasie = a==b;
		System.out.println(czy_rownasie);
		
		
	
	}

}