package arrays;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] teilnehmer = new String[8];
		int[] altert = new int[8];
		
		System.out.println("Bitte geben Sie die Teilnehmer ein");
		int index =0;
		
		while (index < 8)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			teilnehmer[index] = name;
			System.out.println("bitte geben Sie das Alter ein");
			int alter = sc.nextInt();
			altert[index] = alter;
			index++;
		}
		
		// Ausgabe
		//for(String s : teilnehmer)
		//	System.out.println(s);
		
		for(int i=0;i<teilnehmer.length;i++)
		{
			System.out.printf("Teilnehmer %s hat das Alter %d\n",teilnehmer[i],altert[i]);
		}

	}

}
