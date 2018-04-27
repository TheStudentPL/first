package first;
public class Tekst{
	public static void main(String[] args){
		String hello = "Witaj ";
		String world = "Swiecie ";
		String powitanie = hello+world;
		
		System.out.println(powitanie);
		String czesc = powitanie.substring(0, 6)+"uczniu";
		System.out.println(czesc);
		
	}
}