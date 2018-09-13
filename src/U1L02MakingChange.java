import javax.swing.JOptionPane;

//Genna Barge
//U1L02 Pseudo Code
public class U1L02MakingChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nickels = 0
		//String input = JOptionPane.showInputDialog("Enter an amount of money ex: 3.12");
		//int money = Integer.parseInt(input);
		//while money > .05{
		//money -= .05
		//nickels+=1
		//}
		//pennies = money * 10
		//JOptionPane.showMessageDialog(null, "you need " +
		// nickels + " nickels, and " + pennies + "pennies"); 
		
		//define variables for amounts of each coin
		int nickels = 0;
		int pennies = 0;
		//get input from user (change to usable variable)
		String answer = JOptionPane.showInputDialog("Enter a monetary value (ex: 1.56)");
		double cash = Double.parseDouble(answer);
		pennies = (int)(cash * 100); 
		// we use double when we deal with integers
		
		//loop subtracting coin amount until money < coin amount
		while (pennies > 5) {
			nickels++; 
			pennies -= 5;
			
		}
		//print answer
		JOptionPane.showMessageDialog(null, cash + " is " + nickels + " nickels " + 
		pennies + " pennies");
		
		

	}

}
