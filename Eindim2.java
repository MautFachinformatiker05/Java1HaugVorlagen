package arrays;

public class Eindim2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wochentage1 = new String[7];
		wochentage1[0] = "Montag";
		wochentage1[1] = "Dienstag";
		wochentage1[2] = "Mittwoch";
		wochentage1[3] = "Donnerstag";
		wochentage1[4] = "Freitag";
		wochentage1[5] = "Samstag";
		wochentage1[6] = "Sonntag";
		
		System.out.println("Ausgabe der Wochentage");
		for(String s : wochentage1)
			System.out.println(s);
		
		// Direktinitialiserung
		// bei dieser wird die Anzahl der Elemente automatisch aufgrund
		// der Eingabe festgelegt
		String[] wochentage2 = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag"};
		
		System.out.println("Ausgabe der Woche nach der Direltinitialisierung");
		for(String s : wochentage2)
			System.out.println(s);

	}

}
