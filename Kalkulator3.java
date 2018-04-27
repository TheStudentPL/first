package first;

public class Kalkulator3{
	public static void main(String[] args){
		/*int a = -12;
		int b = 6;
		System.out.println("a wynosi: "+a);
		double bezwzglena = Math.abs(a);
		System.out.println("|a| wynosi: "+bezwzglena);
		double kwadrat = Math.pow(a,b);
		System.out.println("a^b wynosi: " + kwadrat);
		double pierwiastek = Math.sqrt(kwadrat);
		System.out.println("pierwiastek z a^b wynosi: " + pierwiastek );*/
	
		int a = -12;
		int b = 6;
		System.out.println("a wynosi: "+a);
		System.out.println("|a| wynosi: " + Math.abs(a));
		System.out.println("a^b wynosi: " + Math.pow(a,b));
		System.out.println("pierwiastek z a^b wynosi: " + Math.sqrt(Math.pow(a,b)));

	
	}

}