package uebungenSchleifen;

public class Uebung27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String stern="*";
		
		for(int i=0;i<8;i++)
		{
			// for Schleife für die Leerzeichen
			for(int j =7; j>i;j--)
			{
				System.out.print(" ");
			}
			
			System.out.print(stern);
			stern +="**";
			
			System.out.println();
			
			
			
		}
		
		// Einbau des Fusses (3 *)
		for(int i = 0;i<3;i++)
		{
			for(int j=0;j<6;j++)
				System.out.print(" ");
			
			System.out.println("***");
		}

	}

}
