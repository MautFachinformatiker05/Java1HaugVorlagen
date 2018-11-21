package uebungenSchleifen;

public class Uebung18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i= 1;i<100;i++)
		{
			if ( i % 6 == 0 && i % 12 !=0 || i % 48 == 0)
				System.out.println("Mitarbeiter "+i);
		}
		
		

	}

}
