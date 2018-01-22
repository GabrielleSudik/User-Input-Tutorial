import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		//create scanner object:
		//scanner is the class, input is the variable name
		Scanner input = new Scanner(System.in);
		//you imported the Scanner class (above) using that light bulb thing
		
		//output the prompt:
		System.out.println("Enter a line of text.");
		
		//user enters line of text:
		String line = input.nextLine();
		
		//tell user what they entered:
		System.out.println("You entered: " + line);
		
		System.out.println("Enter an integer.");
		
		int value = input.nextInt();
		
		System.out.println("You entered: " + value);
		
		//etc! the nextLine/nextInt/etc will change depending on type of variable
		//ex: double value2 = input.nextDouble();
		
		//teacher recommends we look up java scanner class online.
		//basically, it reads the next thing that gets typed in an input line
		//it can do it one at a time, like above.
		//or several in a row, like the following example from the web:
		
		/*int number = in.nextInt();
		float real = in.nextFloat();
		long number2 = in.nextLong();
		double real2 = in.nextDouble();
		String string = in.next();

		44 23
		2222222222
		22222.33 End*/

		//44 would be stored in number; 23.0 would be stored in real; 2222222222 would be stored in number2; 
		//22222.33 would be stored in real2; and ≥End≤ would be stored in string.
		
		// ctrl shift / will block comment; ctrl / will comment one line.
		// use the same with \ to uncomment.
	}

}
