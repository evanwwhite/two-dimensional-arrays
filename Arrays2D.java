//Evan White
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2D {

	public static void main(String[] args) throws IOException{
		
		int row = 0;
		int collumn = 0;
		int[][] data = new int[row][collumn];
		int counter = 0;
		
      Scanner input = new Scanner(new File("arrInput.txt"));
		
		int r = input.nextInt();
		int c = input.nextInt();
		
		while(input.hasNext())
		{
			for(r = 0; r < data.length; r++)
			  {
				  for(c = 0; c < data[0].length; c++)
				    {
					    data[r][c] = r + c;
					    data[counter][r] = input.nextInt();
				    }
			  }  
			counter++;
		}
		
		
		  for(int i = 0; i < rows; i++){  
	            sumRow = 0;  
	           for(int j = 0; j < cols; j++){  
	              sumRow = sumRow + a[i][j];  
	            }  
	            System.out.println("Sum of " + (i+1) +" row: " + sumRow);  
	        }  		
		
		  for(int i = 0; i < cols; i++){  
		          sumCol = 0;  
		         for(int j = 0; j < rows; j++){  
		              sumCol = sumCol + a[j][i];  
		            }  
		            System.out.println("Sum of " + (i+1) +" column: " + sumCol);  
		        } 
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
