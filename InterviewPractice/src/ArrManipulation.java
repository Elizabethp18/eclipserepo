
public class ArrManipulation {

	public static void main(String[] args) {
	//	int[][] originalArray = {{10, 20, 30}, {40, 50, 60}};
		
	//	flipArray(originalArray);
		
		int[] origArr = {-3, 1, 0, -4, -2, 2, 4, -1, 3};
	//	int toFind = 3;
		
		sortPosAndNegs(origArr);
		
	//	findNumsAboveAverage(origArr);
		
	//	findKLargestElements(origArr, toFind);
	}

	static void flipArray(int[][] inputArr)  {
		int arrLength = inputArr.length;
		int arrWidth = inputArr[0].length;
		int[][] flippedArr = new int[arrWidth][arrLength];
		int newRow = 0;
		int newColumn = 0;
		int currentNumToMove;
		
		for(int i=0; i < arrLength; i++)  {
			for(int j=0; j < arrWidth; j++)  {
				
				currentNumToMove = inputArr[i][j];
				flippedArr[newRow][newColumn] = currentNumToMove;
				
				newRow++;
			}
			newRow = 0;
			newColumn++;
		}
		
		for(int i=0; i < flippedArr.length; i++)  {
			for(int j=0; j<flippedArr[0].length; j++)  {
				System.out.print(flippedArr[i][j] + " ");
			}
			System.out.println("");
		}
		
	}
	
	static void findKLargestElements(int[] inputArray, 
			int numToFind)  {
		int[] largestElements = new int[numToFind];
		int j;
		
		for(int i=0; i < inputArray.length; i++)  {
			j = 0;
			
			for(int k = 0; k < largestElements.length; k++)  {		
				if(inputArray[i] > largestElements[j])  {
						j++;
					}		
				}
			
			if(j>0)  {
				j--;
				for(int l=0; l<j; l++)  {
					largestElements[l] = largestElements[l+1];
				}
				
				largestElements[j] = inputArray[i];
			}
		}
		
		for(int i = 0; i < largestElements.length; i++)  {
			System.out.println(largestElements[i] + " ");			
		}
	}
	
	static void findNumsAboveAverage(int[] inputArray)  {
		int average = 0;
		int sumOfArray = 0;
		
		for(int i = 0; i < inputArray.length; i++)  {
			sumOfArray = inputArray[i] + sumOfArray;
		}
		
		average = sumOfArray/inputArray.length;
		
		//System.out.println(sumOfArray + " " + average);
		
		for(int i = 0; i < inputArray.length; i++)  {
			if(inputArray[i] > average)  {
				System.out.print(inputArray[i] + " ");
			}
		}
	}
	
	static void sortPosAndNegs(int[] inputArray)  {
		int[] sortedArray = new int[inputArray.length];
		int negativeIndex = 0;
		int positiveIndex = inputArray.length - 1;
		
		for(int i = 0; i < inputArray.length; i++)  {
			if(inputArray[i] >= 0)  {
				sortedArray[positiveIndex] = inputArray[i];
				positiveIndex--;
			}
			else  {
				sortedArray[negativeIndex] = inputArray[i];
				negativeIndex++;
			}
		}
		
		for(int i = 0; i < sortedArray.length; i++)  {
			System.out.println(sortedArray[i]);
		}
	}
}
