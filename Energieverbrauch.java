
public class Energieverbrauch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int januar = 0;
		int februar = 20;
		int maerz =21;
		
		double erg = (januar+februar+maerz) / 3.0;
		System.out.printf("Energieverbrauch im Januar:\t%d\n",januar);
		System.out.printf("Energieverbrauch im Februar:\t%d\n",februar);
		System.out.printf("Energieverbrauch im März:\t%d\n",maerz);
		System.out.printf("Durchschnitt:\t\t\t%.2f",erg);
		

	}

}
