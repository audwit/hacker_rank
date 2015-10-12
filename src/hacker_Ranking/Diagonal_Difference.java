package hacker_Ranking;

import java.io.File;
import java.util.Scanner;



public class Diagonal_Difference
{
	public static void main(String[] args)
	{
		File file = null;
		Scanner in = null;
		int[][] matrix;
		
		try{
			file = new File("diagonalDifference.txt");
			in = new Scanner(file);
		}
		catch(Exception ex){
			//ex.printStackTrace();
		}
		
		int n=0,a,diagonalsumlr=0,diagonalsumrl=0,result=0;
		
		
		
		//if(in.hasNextInt())
			n=in.nextInt();

		matrix = new int[n][n];
		//Insert the data into Matrix
		for(int i=0; i<n; i++)
		{
			for(int j=0;j<n;j++)
			{
				if(in.hasNextInt())
				{
					matrix[i][j]=in.nextInt();
					//System.out.print(matrix[i][j] + " ");
				}				
			}
			//System.out.println();

		}

		
		//Calculate the sum of the diagonals
		for(int i=0;i<n;i++)
		{
			a = matrix[i][i];
			diagonalsumlr=diagonalsumlr+a;
		}
		
		for(int i=0;i<n;i++)
		{
			a = matrix[i][n-1-i];
			diagonalsumrl=diagonalsumrl+a;
		}
		
		result= (diagonalsumlr-diagonalsumrl);
		result=Math.abs(result);
		
		System.out.println(result);

	}

}
