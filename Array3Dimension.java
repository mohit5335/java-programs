/* 3-D Array in java */

import java.util.*;
public class Array3Dimension
{
	public static void main(String[] args)
	{
		//int count = 1;
		Scanner sc = new Scanner(System.in);
		int a[][][] = new int[3][3][3];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
		  for(int j=0;j<a[i].length;j++)
		  {
		    for(int k=0;k<a[j].length;k++) 
		    {
			a[i][j][k] = sc.nextInt();
		    }
		  }
		}
		for(int i=0;i<a.length;i++)
		{
		  for(int j=0;j<a[i].length;j++)
		  {
		    for(int k=0;k<a[j].length;k++) 
		    {
			System.out.println("a[" +i+ "][" +j+ "][" +k+ "] ="+a[i][j][k]);
		    }
		  }
		}
	}	
}