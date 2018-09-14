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
		//get input from user (change to usable variable)
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56)");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100); 
		// we use double when we deal with integers
		
		//loop subtracting coin amount until money < coin amount
		while (pennies >= 25) {
			quarters++; 
			pennies -= 25;
			
		}
		while (pennies >= 10) {
			dimes++;
			pennies -= 10; 

		}
		while (pennies >= 5) {
			nickels++;
			pennies-= 5;
		}
		//print answer
		JOptionPane.showMessageDialog(null, cash + " is " + quarters + " quarters " + 
		dimes + " dimes " + nickels + " nickels " + pennies + " pennies" );
		
	
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
