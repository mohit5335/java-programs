import java.util.*;
class ArithmeticOperations 
{
	public static void main(String ...k)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Addition is\t"+(a+b));
		System.out.println("Subtraction is\t"+(a-b));
		System.out.println("Multiplication is\t"+(a*b));
		System.out.println("Divisiom is\t"+(a/b));
	}
}