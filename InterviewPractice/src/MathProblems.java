
public class MathProblems {
	public static void main(String[] args) {
		int inputInt = 2350;
		
		//intOfLog(inputInt);
		
		//divideUsingSubtraction(250, 25);
		
		multiplyWithoutMultiplication(25, 5);
	}
	
	static void intOfLog(int input)  {
		double inputDouble = input;
		double logOfInput = Math.log(inputDouble);
		int logInt = (int) logOfInput;
		
		System.out.println(logInt);
	}

	static void divideUsingSubtraction(int dividend, int divider)  {
		int solution = 0;
		
		while(dividend > 0)  {
			dividend = dividend - divider;
			solution++;
		}
		
		System.out.println(solution);
	}
	
	static void multiplyWithoutMultiplication(int multiplierOne, int multiplierTwo)  {
		int solution = 0;
		
		for(int i = multiplierTwo; i > 0; i--)  {
			solution = solution + multiplierOne;
		}
		
		System.out.println(solution);
	}
}