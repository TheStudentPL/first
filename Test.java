package first;
public class Test{
	public static void main(String[] args){
		String ja = "Slawek";
		String ty = "Slawek";
		
		boolean porownanie1 = ja==ty;
		boolean porownanie2 = ja.equals(ty);
		System.out.println(porownanie1); //true
		System.out.println(porownanie2); //true
		
	}

}