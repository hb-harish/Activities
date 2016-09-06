import java.util.Scanner;
	
public class ChangeAct {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		int sum = num1 + num2;
		
		System.out.print("Sum is " + sum);
		
		
		if (sum>=100)
			System.out.print("*");
		if (sum <=1000)
			System.out.print("~");
		
		
	}

}
