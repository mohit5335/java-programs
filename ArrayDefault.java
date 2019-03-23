/* in this program we will make array where input is 
taken by default */

import java.util.*;
public class ArrayDefault
{
	public static void main(String...k)
	{
		int a[] = new int[6];
		for(int i=0;i<a.length;i++)
		{
			a[0]=1;
			a[1]=2;
			a[2]=3;
			a[3]=4;
			a[4]=5;
			a[5]=6;	
		}
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"]="+a[i]);
	}
}