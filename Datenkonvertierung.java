
public class Datenkonvertierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl1 = 15;
		double wert1 = 49.99;
		
		//wert1 = zahl1;
		System.out.println(wert1);
		
		// cast Befehl
		// in Klammern Datentyp des ZielObjektes
		// funktioniert zwischen primitiven Datentypen
		zahl1 = (int) wert1;
		System.out.println(zahl1);
		
		char z = 'A';
		int z1 = z;
		System.out.println(z1);
		
		//z1 = 66;
		
		z = (char) z1;
		System.out.println(z);
		
		// Variablen mit final definiert können nach der 
		// Initialisierung nicht mehr geändert werden 
		final double pi = 3.14;
		
		
		
		

	}

}
