package uebungenSchleifen;

import java.util.Scanner;

public class Uebung32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double zufall = Math.random(); // Zufallszahlen generator
		System.out.println(zufall); // liefert immer eine Zahl zwischen 0 Un 1
		zufall *= 11;
		int wert = (int) zufall;
		System.out.println(wert);
		
		int i=0;
		boolean schalter = false;
		while(i<3)
		{
			System.out.println("Bitte geben Sie die Zahl ein");
			Scanner sc = new Scanner(System.in);
			int eingabe = sc.nextInt();
			
			if (eingabe == wert)
			{
				schalter = true;
				break;
			}
			i++;
			
		}
		
		if (schalter)
			System.out.println("Herzlichen Glückwunsch Sie haben die Zahl erraten");
		else
			System.out.println("Sie haben die Zahl nicht erraten Sie wäre "+wert+" gewesen");
		
		
		
		

	}

}
