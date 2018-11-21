package uebungenAbfragen;

import java.util.Scanner;

public class Geschwindigkeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int geschwindigkeit = sc.nextInt();
		
		geschwindigkeit -= 50;
		
		int punkte = 0;
		
		if (geschwindigkeit >= 40)
			punkte = 4;
		else if (geschwindigkeit >= 25)
			punkte = 3;
		else if (geschwindigkeit >= 20)
			punkte = 1;
		
		System.out.println("Geschwindikeit : "+(geschwindigkeit+50));
		System.out.println("Punkte : "+punkte);
		

	}

}
