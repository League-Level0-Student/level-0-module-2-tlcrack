package extra;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String t = JOptionPane.showInputDialog("how old are you in years?");
	
	
	int a =Integer.parseInt(t);
			
if(a>18) {
	JOptionPane.showInputDialog("Who should the next president be?");
}
if(a<48) {
	JOptionPane.showMessageDialog(null, "No one cares what you think!");
}
}
}
