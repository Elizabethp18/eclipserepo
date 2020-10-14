import java.util.Scanner;

public class CheckForEqualInputs {

	public static void main(String[] args) {
		Boolean areEqual = true;
		int inputOne;
		int inputTwo;
		int inputThree;
		int inputFour;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter first int ");
		inputOne = in.nextInt();
		
		System.out.println("Please enter second int ");
		inputTwo = in.nextInt();
		
		System.out.println("Please enter third int ");
		inputThree = in.nextInt();
		
		System.out.println("Please enter fourth int ");
		inputFour = in.nextInt();
		
	/*	if(inputOne != inputTwo)  {
			areEqual = false;
		}
		
		else if(inputTwo != inputThree)  {
			areEqual = false;
		}
		
		else if(inputThree != inputFour)  {
			areEqual = false;
		}
		
		if(areEqual)  {
			System.out.println("The numbers are equal.");
		}
		else  {
			System.out.println("The numbers are not equal");
		}*/
		
		if(inputOne == inputTwo && inputTwo == inputThree && 
				inputThree == inputFour)  {
			System.out.println("These numbers are equal.");
		}
		else  {
			System.out.println("These numbers are not equal");
		}
		in.close();
	}

}
