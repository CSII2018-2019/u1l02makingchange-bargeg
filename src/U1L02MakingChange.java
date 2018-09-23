import javax.swing.JOptionPane;

//Genna Barge
//U1L02 Pseudo Code
public class U1L02MakingChange {

	public static void main(String[] args) {
	
		
		//define variables for amounts of each coin
		int quarters = 0;
		int dimes = 0; 
		int nickels = 0;
		int pennies = 0;
		int quarters2 = 0;
		int dimes2 = 0;
		int nickels2 = 0;
		int pennies2 = 0; 
		int remaining = 0;
		int remaining2 = 0; 
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56)");
		String answer2 = JOptionPane.showInputDialog("Enter another monetary value");
		double cash = Double.parseDouble(answer);
		double cash2 = Double.parseDouble(answer2);
		pennies = (int)(cash * 100);
		pennies2 = (int)(cash2 * 100); 
		// we use double when we deal with integers
		
		double average = (cash + cash2)/2;
		
		while (pennies >= 25) {
			quarters++; 
			pennies -= 25;
			}
		remaining = pennies % 25;
		
		while (remaining >= 10) {
			dimes++;
			remaining -= 10;
			}
		
		while (remaining >= 5) {
			nickels++;
			remaining-= 5;
		}
		while (pennies2 >= 25) {
			quarters2++; 
			pennies2 -= 25;
			}
		remaining2 = pennies2 % 25;
		
		while (remaining2 >= 10) {
			dimes2++;
			remaining2 -= 10;
			}
		
		while (remaining2 >= 5) {
			nickels2++;
			remaining2 -= 5;
		}
		JOptionPane.showMessageDialog(null, cash + " is " + quarters + " quarters " + 
		dimes + " dimes " + nickels + " nickels " + remaining + " pennies" );
		JOptionPane.showMessageDialog(null, cash2 + " is " + quarters2 + " quarters " + 
		dimes2 + " dimes " + nickels2 + " nickels " + remaining2 + " pennies" );
		JOptionPane.showMessageDialog(null, "The average of both amounts is: " + average);
		
	
		//Mathematical Method:
		//get input from user:
		
		//String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56)");
		//double cash = Double.parseDouble(answer); 
		
		//divide by 5 and round down:
		
		//int nickels = (int)(cash/.05)
		
		//subtract # of nickels times 5 from amount to get pennies:
		
		//int pennies = cash - (.05 * nickels) * 100; 
		
		//print answer:
		
		//JOptionPane.showMessageDialog(null, cash + " is " + nickels + " nickels " + 
				//pennies + " pennies");
		
		

	}

}
