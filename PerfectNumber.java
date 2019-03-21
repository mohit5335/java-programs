import java.util.*;
public class PerfectNumber
{
	public static void main(String[] args)
	{
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int n = sc.nextInt();
		
	boolean b = isPerfect(n);
	if(b)
		System.out.print("It is a perfect number");
	else
		System.out.print("It is not a perfect number");
	
	}
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum += i;
			}
		}
			if(n==sum)
				return true;
		return false;	
	}
}