
public class PrintfUebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int zahl = 15;
		System.out.printf("Zahl = %d\n",zahl);
		System.out.printf("Zahl = %x\n",zahl);
		
		double wert = 15.99;
		System.out.printf("Zahl = %5.2f\n", wert);
		
		boolean schalter = false;
		System.out.printf("Wert = %b\n", schalter);
		
		char zeichen = 'X';
		System.out.printf("Zeichen = %c\n", zeichen);
		
		String s = "Hello";
		System.out.printf("Zeichen = %s\n", s);
		
		// Aufgabe 1
		String NN = "Meier";
		String VN = "Hans";
		String Name = "";
		
		Name = NN+"-"+VN;
		System.out.printf("%s\n", Name);
		System.out.printf("%s-%s\n", NN,VN);
		

	}

}
