import java.util.*;
public class PrimeNumber
{
	public static void main(String...k)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int n = sc.nextInt();
		int s = 0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
				s++;			
			}
		}
		if(n==1 || n==0)
			System.out.println(n +" is not a Prime number");
		else if(s == 0)
			System.out.println(n +" is a Prime number");
		else
			System.out.println(n +" is not a Prime number");
	}
}