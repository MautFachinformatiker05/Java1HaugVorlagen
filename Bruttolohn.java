
public class Bruttolohn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stundenzahl = 40;
		double stundenlohn = 10.50;
		int steuersatz = 25;
		
		double brutto = stundenzahl * stundenlohn;
		double steuer = brutto * (25/100.0);
		double netto = brutto-steuer;
		System.out.printf("Netto lohn %.2f\n",netto);

	}

}
