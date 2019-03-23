/* program to print sum of elements of an array, input taken from user */

import java.util.*;
public class SumofArrayElements
{
	public static void main(String...k)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int sum = 0;
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();	
		}	
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of all elements of array = "+sum);
	}

}