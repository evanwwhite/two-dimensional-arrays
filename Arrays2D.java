//Evan White
import java.io.*;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2D {
	public static void main(String[] args) throws IOException{
		
      Scanner input = new Scanner(new File("arrInput.txt"));
		
		int r = input.nextInt();
        int c = input.nextInt();
        int target = 0;
	int[][] data = new int[r][c];
        int rowCount = 0;
        int colCount = 0;
        int[] rowTotal = new int [r];
        int[] colTotal = new int [c];
        int total = 0;
        int[] rowMajor = new int [r * c];
        int[] colMajor = new int [c * r];

		while(input.hasNext()){
            target = input.nextInt();

            data[rowCount][colCount] = target;
            rowTotal[rowCount] += target;
            colTotal[colCount] += target;
            total += target;
           
            rowMajor[rowCount * c + colCount] = target;

         if(colCount < c - 1){
             colCount++;
             
         } else{
           colCount = 0;
           rowCount++;
         }
        }

	         for(int i = 0; i < data[0].length; i++)
			  {
				  for(int j = 0; j < data.length; j++)
				    {
					   colMajor[i * r + j] = data[j][i];
				    }
			  }  
			
        System.out.println("Rows");

        for(int i = 0; i < rowTotal.length; i++){
            System.out.println(i + ": " + rowTotal[i]);
        }

        System.out.println("ColLumns");

        for(int p = 0; p < colTotal.length; p++){
            System.out.println(p + ": " + colTotal[p]);
       }

       System.out.println("Total: " + total);
       
       System.out.println("Row Major: ");

       for(int w = 0; w < rowMajor.length; w++)
       {
           System.out.print(rowMajor[w] + " ");
       }
       System.out.println();
       System.out.println("ColLumn Major: ");

       for(int l = 0; l < colMajor.length; l++)
       {
           System.out.print(colMajor[l] + " ");
       }
	}

}
