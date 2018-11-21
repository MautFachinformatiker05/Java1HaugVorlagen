package uebungenSchleifen;

import java.util.Scanner;

public class Uebung19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int zaehler = 0;
		
		for(int i=0;i<text.length();i++)
			
			if (text.toLowerCase().charAt(i) == 'a')
				zaehler++;
		
		System.out.println("Anzahl = "+zaehler);
		// meier soll werden reiem
		
		String umkehr = "";
		for(int i = text.length()-1;i >=0;i--)
			umkehr += text.charAt(i);
		
		System.out.println(umkehr);
			
				
		

	}

}
