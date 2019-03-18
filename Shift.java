class Shift
{
	public static void main(String...k)
	{
	int a = 8;		//1000
	int b = a << 2;   	//left shift ie; 100000 = 32
	int c = a >> 2;		//right shift ie; 10 = 2
	System.out.println("Value of a = "+a);
	System.out.println("After left shift of 2 = "+b);
	System.out.println("After right shift of 2 = "+c);
	}
}