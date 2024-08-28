package antigripe;

public class quarteto {

	public static void main(String[] args) {
		Func calcule = new Func ();
		
		double a = 0;
		double b = 0;
		
		calcule.somar(a, b);
		calcule.sub(a,b);
		calcule.div(a,b);
		calcule.mult(a,b);
		calcule.expo(a,b);
		
		System.out.println("10^2= "+calcule.expo(a,b));
		System.out.println("20-20= "+calcule.sub(a, b));
		System.out.println("10/2= "+calcule.div(a, b));
		System.out.println("10+10= "+calcule.somar(a, b));
		System.out.println("5*5= "+calcule.mult(a,b));
		

		


		
		
		

	}

}
