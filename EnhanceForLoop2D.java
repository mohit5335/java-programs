/* program for enhance for loop in 2-D array */

import java.util.*;
public class EnhanceForLoop2D
{
	public static void main(String...k)
	{
		int a[][] = {
				{1,2,3,4},			    
				{4,5,6,7},
				{5,6,7,8}
			     };	
	 	for(int i[] : a)
		{
		    for(int j : i)
			{
			System.out.print(j +" ");
			}
		System.out.println("");
		}
	}	
}