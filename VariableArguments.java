/* proogram to use variable arguments which passes any number of arguments to the function. if we pass one arg then 
the function having one arg will be invoked
*/

public class VariableArguments
{
	public static void main(String...k)
	{
		Display obj = new Display();
		obj.show(5,6,7);		
	}
}	
	class Display
	{
		public void show(int ...a)		//Variable Arguments
		{
		     for(int i : a)
			System.out.println(i);
		}
		public void show(int a)		       
		{
			System.out.println(a);
		}
	}
