

public class Example
{
	public static void main(String...k)
	{
		int i=1,j=10;
		do
	   {
		  if(i++>--j)
		{
		continue;
		}
		System.out.println(i+"and"+j);
	   }	
		while(i<5);
		System.out.println(i+"and"+j);
		
	}	
}