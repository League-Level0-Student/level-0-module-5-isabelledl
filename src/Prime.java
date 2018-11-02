import javax.swing.JOptionPane;

public class Prime {
public static void main(String[] args) {
	String a = JOptionPane.showInputDialog(null, "put in a number");
	int x = Integer.parseInt(a);
	for (int i = 2; i < x; i++) {
	if (x%i== 0) {
		System.out.println("not pimo!");
		System.exit(0);
	}	
		
	}
	System.out.println("prime!");
}
}
