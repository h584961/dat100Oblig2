import java.util.Scanner;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {
          
		//trinnskattkalkulator
		
		
		
		
	
		Scanner input = new Scanner(System.in);
		
		double inntekt = input.nextDouble();
		
		
		double trinn0 = 164100;
		double trinn1 = 230950;
		double trinn2 = 580650;
		double trinn3 = 934050;
		
		double sats1 = 0.0093;
		double sats2 = 0.0241;
		double sats3 = 0.1152;
		double sats4 = 0.1452;
		
		if(inntekt < trinn0) {
		    System.out.println("din skatt er 0kr.");
		}
		else if(inntekt > trinn0 || inntekt < trinn1) {
			int skatt1 = (int) ((inntekt-trinn0)*sats1);
					System.out.println("Din skatt er " + skatt1 + "kr.");
		}else if(inntekt > trinn1 || inntekt < trinn2) {
			int skatt2 = (int) (((trinn1-trinn0)*sats1)+(inntekt-trinn1)*sats2);
			System.out.println("Din skatt er " + skatt2 + "kr.");
		}else if(inntekt > trinn2 || inntekt < trinn3) {
			int skatt3 = (int) (((trinn1-trinn0)*sats1)+(trinn2-trinn1)*sats2+(inntekt-trinn2)*sats3);
			System.out.println("Din skatt er " + skatt3 + "kr.");
		}
		else if(inntekt > trinn3) {
			int skatt4 = (int) (((trinn1-trinn0)*sats1)+(trinn2-trinn1)*sats2+(trinn3-trinn2)*sats3+(inntekt-trinn3)*sats4);
			System.out.println("Din skatt er " + skatt4 + "kr.");
		}
		
		
		
		

	}

}
