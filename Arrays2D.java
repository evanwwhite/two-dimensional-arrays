//Evan White
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2D {

	public static void main(String[] args) throws IOException{
			
		int counter = 0;
		
      Scanner input = new Scanner(new File("arrInput.txt"));
		
		int r = input.nextInt();
		int c = input.nextInt();
		
		while(input.hasNext())
		{
			
		}
		
		
		
		
		
		
		int[][] data = new int[4][6];

		for(r = 0; r < data.length; r++)
		  {
			
			  for(c = 0; c < data[0].length; c++)
			    {
				    data[r][c] = r + c;
				    System.out.print(data[r][c] + " ");
			    }
		  }  
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
