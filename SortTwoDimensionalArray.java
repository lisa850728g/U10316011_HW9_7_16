import java.util.*;

/**This program will sort a two-dimensional array
 * and show the array in coordinate way.
 */
public class SortTwoDimensionalArray{
	/*Main method*/
	public static void main(String[] args){
		int row;
		int column = 0;
		//Create a two-dimensional array and set specific numbers
		int[][] sortArray = { {4,2} , {1,7} , {4,5} , {1,2} , {1,1} , {4,1} };
		
		System.out.println("The initial two-dimensional array is : " );
		
		//Print the two-dimensional array
		for(row = 0 ; row <= 5 ; row++){
			System.out.println("{" + sortArray[row][column] + "," + sortArray[row][column+1] + "}");
		}
		
		//invoke sort method
		sort(sortArray);
	}
	
	public static void sort(int m[][]){
		int row;
		int column = 0;
		boolean change = false;
		
		System.out.println("The two-dimensional array is sorted to : ");
		
		/*Sort the tow-dimensional array*/
		for(row = 0 ; row <= 5 ; row++){//列數
			for(int i = row+1 ; i <= 5 ; i++){//行數
				//比較第一行的數字，如果比較大就互換
				if(m[row][column] > m[i][column]){
					int temp = m[row][column];
					m[row][column] = m[i][column];
					m[i][column] = temp;
					
					//如果有互換，change就變成true
					change = true;
				}
				
				//第一行有互換時，第二行也跟著互換
				while(change == true){
					int temp2 = m[row][column+1];
					m[row][column+1] = m[i][column+1];
					m[i][column+1] = temp2;
					
					//change轉回false
					change = false;
				}
				
				//當第一行某列和另一列的值相同，且第二行某列比另一列的值大時執行
				if(m[row][column] == m[i][column] && m[row][column+1] > m[i][column+1]){
					//第二行的某列和另一列的值互換
					int temp3 = m[row][column+1];
					m[row][column+1] = m[i][column+1];
					m[i][column+1] = temp3;
				}
			}
		}
		
		//Print the sorted two-dimensional array
		for(row = 0 ; row <= 5 ; row++)
			System.out.println("{" + m[row][column] + "," + m[row][column+1] + "}");	
	}
}
