import java.util.Scanner;

public class Umnrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int geld = sc.nextInt();
		
		int cent = geld % 100;
		int euro = geld / 100; // Integer Division
		
		System.out.println("Euro : "+euro+"\nCent : "+cent);
		
		

	}

}
