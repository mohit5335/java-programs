import java.util.*;
public class Palindrome
{
	public static void main(String...k)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to search");
		int n = sc.nextInt(); 
		int r,s=0;
		int temp = n;
		while(n > 0)
		{
			r = n %	10;
			n = n / 10;
			s = s * 10 + r;
		}
		if(temp == s)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}		

	}
}
