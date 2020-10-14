
public class BooleanArray {

	public static void main(String[] args) {
		boolean[][] boolArr = {{true, false, true}, 
				{false, true, false}};
		
		String[][] stringArr = new String[boolArr.length]
				[boolArr[0].length];
		
		for(int i=0; i < boolArr.length; i++)  {
			for(int j=0; j < boolArr[i].length; j++)  {
				if(boolArr[i][j])  {
					stringArr[i][j] = "t";
				}
				else  {
					stringArr[i][j] = "f";
				}
				}
			}
		
		for(int i=0; i < boolArr.length; i++)  {
			for(int j=0; j < boolArr[i].length; j++)  {
				System.out.print(stringArr[i][j] + ", ");
				}
			System.out.println("");
			}
	}
}
