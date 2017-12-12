package extra;
import javax.swing.JOptionPane;

public class rollerCoaster {
public static void main(String[] args) {
	String t = JOptionPane.showInputDialog("how tall are you in inches?");
	
	
	int a =Integer.parseInt(t);
			
if(a>48) {
	JOptionPane.showMessageDialog(null, "You can go on the roller coaster!");
}
if(a<48) {
	JOptionPane.showMessageDialog(null, "Grow a little,then come back.");
}


	
}
}
