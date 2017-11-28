package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
String message = "";
	Random t = new Random();
for(int i = 0;i<5;i++) {
int a = t.nextInt(60);
message+=a;
message+=" ";
}
JOptionPane.showMessageDialog(null, "Your numbers are, " + message);


	
	
	
	
	
	
	
	
}}
