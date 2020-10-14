import java.util.Scanner;

public class CheckTwoDoubles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double firstInput;
		double secondInput;
		
		System.out.println("Please enter your first number.");
		firstInput = in.nextDouble();
		
		System.out.println("Please enter your second number.");
		secondInput = in.nextDouble();
		
		if(firstInput > 0 && firstInput < 1 && 
				secondInput > 0 && secondInput < 1)  {
			System.out.println("Both numbers are between 0 and 1");
		}
		else  {
			System.out.println("Both numbers are not between 0 and 1");
		}
		
		in.close();
	}

}
