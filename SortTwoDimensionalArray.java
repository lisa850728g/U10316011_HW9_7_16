import java.util.*;

public class SortTwoDimensionalArray{
	public static void main(String[] args){
		int row;
		int column = 0;
		int[][] sortArray = { {4,2} , {1,7} , {4,5} , {1,2} , {1,1} , {4,1} };
		
		System.out.println("The initial two-dimensional array is : " );
		
		for(row = 0 ; row <= 5 ; row++){
			System.out.println("{" + sortArray[row][column] + "," + sortArray[row][column+1] + "}");
		}
	}
}
