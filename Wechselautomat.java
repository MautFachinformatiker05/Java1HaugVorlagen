import java.util.Scanner;

public class Wechselautomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bitte geben Sie das Wechselgeld in Cent ein");
		Scanner sc = new Scanner(System.in);
		int cent = sc.nextInt();
		
		System.out.printf("Das Wechselgeld ist :\n");
		System.out.printf("%d Euro\n", cent /100);
		cent = cent % 100; // Überschreiben der Variablen Cent mit dem Rest
		System.out.printf("%d 50 Cent Stück\n", cent /50);
		cent = cent % 50;
		System.out.printf("%d 20 Cent Stück\n", cent /20);
		cent = cent % 20;
		System.out.printf("%d 10 Cent Stück\n", cent /10);
		cent = cent % 10;
		System.out.printf("%d 5 Cent Stück\n", cent /5);
		cent = cent % 5;
		System.out.printf("%d 2 Cent Stück\n", cent /2);
		cent = cent % 2;
		System.out.printf("%d 1 Cent Stück\n", cent );
		

	}

}
