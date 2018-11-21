package uebungenSchleifen;

import java.util.Scanner;

public class Uebung15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double summe = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("Summe= ");
		
		for(int i=1;i<=n;i++)
		{
			if (i !=1)
				System.out.print(" + ");
			
			System.out.print("1.0/"+i);
			summe +=1.0 / i;
		}

		System.out.println();
		System.out.printf("Gesamtsumme = %.2f ",summe);
	}


}
