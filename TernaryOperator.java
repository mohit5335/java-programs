public class TernaryOperator
{
	public static void main(String[] args)
	{	
		int a = 10;		
		Object obj;
		if(true)
		{
			a = 10;
		}
		else
		{
			a = 20;
		}
		System.out.println(a);		//it will print 10
		
		obj = true?10:15.0;
		System.out.println(obj);	/*it will print 10.0 because here it checks both datatypes
						 and replaces the higher one */
	}
}