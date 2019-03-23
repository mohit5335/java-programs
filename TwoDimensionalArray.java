/* program to print sum of elements of an array, input taken from user */

import java.util.*;
public class TwoDimensionalArray
{
	public static void main(String...k)
	{
		int a[][] = {
				{1,2,3,4},			    
				{4,5,6,7},
				{5,6,7,8}
			     };	
	 for(int i=0;i<3;i++)
	  {
	    for(int j=0;j<4;j++)
	    {
		System.out.print(a[i][j] + " ");	
	    }
	 System.out.println("");
	   }
	}
}