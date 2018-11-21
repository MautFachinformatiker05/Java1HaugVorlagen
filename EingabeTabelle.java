package arrays;

import java.util.Scanner;

public class EingabeTabelle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Bitte geben Sie die Teilnehmer einer Veranstaltung ein");
		System.out.println("max 12 Ende mit ende");
		
		String[] namen = new String[12];
		int index = 0;
		
		while (true)
		{
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
			
			// Abbbruchbedinung
			if (name.toLowerCase().equals("ende") || index > 11)
				break;
			// Einfügen in die Tabelle
			namen[index] = name;
			index++;

		}
		
		// Ausgabe
		for(String s : namen)
			if (s != null)
			   System.out.println(s);

	}

}
