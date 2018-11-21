package uebungenSchleifen;

import java.util.Scanner;

public class Uebung22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String wort = sc.next();
		
		// Prüfung damit er nicht über das Ziel schiesst
		boolean schalter = true;
		for(int i=0;i<wort.length()-3;i++)
		{
			if (wort.charAt(i) == wort.charAt(i+1) // zweites Zeichen gleich
					&& wort.charAt(i) == wort.charAt(i+2) // drittes Zeichen gleich
					&& wort.charAt(i) == wort.charAt(i+3))// viertes Zeichen gleich
			{
				schalter = false;
				break;
			}
		}
		
		if (schalter)
			System.out.println("das Wort "+wort+" ist in Ordnung");
		else
			System.out.println("das Wort "+wort+" ist nicht  in Ordnung");

	}

}
