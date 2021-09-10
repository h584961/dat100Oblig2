import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		
		System.out.println("Karakterkalkulator:");
		
		
		Scanner input = new Scanner(System.in);
		
		int poeng = input.nextInt();
		
		
			
		if(poeng >= 90 && poeng <= 100) {
			System.out.println("Karakter A.");
		}else if(poeng >= 80 && poeng <=89) {
			System.out.println("Karakter B.");
		}else if(poeng >= 60 && poeng <=79) {
			System.out.println("Karakter C.");
		}else if(poeng >= 50 && poeng <=59) {
			System.out.println("Karakter D.");
		}else if(poeng >= 40 && poeng <=49) {
		System.out.println("Karakter E");
		}else if(poeng <=39 && poeng >=0) {
		System.out.println("Karakter F");
		}else System.out.println("Ugyldig poengsum");
		
		
		
		
		
		
		}
		}
		
		
		
			
		
		
	


