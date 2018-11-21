package uebungenAbfragen;

import java.util.Scanner;

public class Brot {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gramm = sc.nextInt();
		
		if (gramm >= 980 && gramm <=1010)
			System.out.println("Gewicht ist ok");
		else
			System.out.println("Produktion verbessern");
		
		
	}
}
