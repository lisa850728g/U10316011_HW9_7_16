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
		
		sort(sortArray);
	}
	
	public static void sort(int m[][]){
		int row;
		int column = 0;
		boolean change = false;
		
		System.out.println("The two-dimensional array is sorted to : ");
		
		for(row = 0 ; row <= 5 ; row++){
			for(int i = row+1 ; i <= 5 ; i++){
				if(m[row][column] > m[i][column]){
					int temp = m[row][column];
					m[row][column] = m[i][column];
					m[i][column] = temp;
					
					change = true;
				}
				
				while(change == true){
					int temp2 = m[row][column+1];
					m[row][column+1] = m[i][column+1];
					m[i][column+1] = temp2;
					
					change = false;
				}
				
				if(m[row][column] == m[i][column] && m[row][column+1] > m[i][column+1]){
					int temp3 = m[row][column+1];
					m[row][column+1] = m[i][column+1];
					m[i][column+1] = temp3;
				}
			}
		}
		
		for(row = 0 ; row <= 5 ; row++)
			System.out.println("{" + m[row][column] + "," + m[row][column+1] + "}");	
	}
}
