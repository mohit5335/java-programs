/* 
A random function is used to get the random values from the system 
It is in the package java.util.*   
*/
import java.util.*;
public class RandomFunction
{
	public static void main(String...k)
	{
		Random  r = new Random();	//Random class
		int a[] = new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i] = r.nextInt(50); 	//Assigning random values
		}
		for(int i : a)
			System.out.println(i);
	}
}