
public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl1 = 15;
		int zahl2 = 7;
		
		if (zahl1 > 15)
			System.out.println("zahl1 ist > 15");
		else if (zahl1 == 14)
			System.out.println("zahl1 ist gleich 15");
		else if (zahl2 == 7 && zahl1 == 15)
		{
			System.out.println("zahl2 ist gleich 7");
			System.out.println("zahl1 ist gleich 15");
		}
		else // default Bedingung
			System.out.println("keine der Bedingungen trifft zu");
			
		

	}

}
