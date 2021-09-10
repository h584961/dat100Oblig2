import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		int i = 1;
		int fak = 1;
		
		String tall = JOptionPane.showInputDialog("n!=");
		int tallet = Integer.parseInt(tall);
		
		for(i=1;i <= tallet;i++) {
			fak=fak*i;
		}
       System.out.println(tall + "! = " + fak);

	}

}
