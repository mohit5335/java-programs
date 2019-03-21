import java.util.*;
public class Armstrong
{
	public static void main(String...k)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int n = sc.nextInt();
		int temp = n;
		int r,sum = 0;
		while(n>0)
		{
			r = n%10;
			n = n/10;
			sum = sum + r*r*r; 
		}
		if(temp == sum)
			System.out.println("It is an Armstrong number");
		else
			System.out.println("It is not an Armstrong number");	
	}
}