package uebungenSchleifen;

import java.util.Scanner;

public class Uebung14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int summe = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.print("Summe= ");
		
		for(int i=1;i<=n;i++)
		{
			if (i !=1)
				System.out.print(" + ");
			
			System.out.print(i);
			summe +=i;
		}

		System.out.println();
		System.out.println("Gesamtsumme = "+summe);
	}

}
