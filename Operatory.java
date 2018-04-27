package first;

public class Operatory{
	public static void main(String[] args){
		int a = 17;
		int b = 4;
		int c = a + b; //21 
		c = a-b; //13
		c = a * b; //68 
		c = a / b; // 4 
		c = a % b; // 1 reszta z dzielenia
		//Inaczej
		a+=b;
		System.out.println("a+=b => "+a);
		a-=b;
		System.out.println("a+=b => "+a);
		a*=b;
		System.out.println("a+=b => "+a);
		a/=b;
		System.out.println("a+=b => "+a);
		a%=b;
		System.out.println("a+=b => "+a);
		
		// Jezeli chcemy widziec reszte z dzielenia
		int d = 17;
		double e = 4.0;
		double f = d/e;
		System.out.println(f); //4.25 dzieki typowi double
	
	//Ikrementacja oraz dekrementacja
		System.out.println("Ikrementacja oraz dekrementacja: ");
		a=10;
		System.out.println(a);
		a++;
		System.out.println(a);
		
		//Warunki warunek?truel:false;
		System.out.println("Ikrementacja oraz dekrementacja: ");
		
		/*
		int a = 5;
		int b = 3;
		boolean prawda = a>b;
		boolean falsz = a<b;
		boolean porownanie = a==b;
		boolean koniunkcja = (a>b)&&(a!=b);
		*/
		
	}

}