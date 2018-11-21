package arrays;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] zahlen = new int[6];
		int z = 0;
		boolean schalter = true;
		
		for(int i = 0;i<6;i++)
		{
			while (true)
			{
				schalter = true;
				z = (int)(49*Math.random()+1);
				
				// Prüfung ob zahl vorhanden ist
				for (int j=0;j<6;j++)
				{
					if (z == zahlen[j])
					{
						schalter = false;
						break;
					}
				}
			
				
				// Zahl ist noch nicht vorhanden
				// Prüfung auf den nächsten freien Platz
				if (schalter)
				{
					for(int i1=0;i1<6;i1++)
					{
						if (zahlen[i1] == 0)
						{
							zahlen[i] = z;
							break;
						}
					}
					break;
				}
				
				
			
		}

	}
		
		for(int i=0;i<6;i++)
			System.out.print(zahlen[i]+"\t");
		
		// Sortieren der Zahlen (Bubble Sort)
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if (zahlen[j] > zahlen[j+1])
				{
					int temp = zahlen[j];
					zahlen[j] = zahlen[j+1];
					zahlen[j+1] = temp;
				}
			}
				
		}
		System.out.println();
		for(int i=0;i<6;i++)
			System.out.print(zahlen[i]+"\t");

	}
}
