//EXAMPLE ON ABSTRACT CLASS
abstract class One										//ABSTRACT CLASS
{
	public void greet()
	{
		System.out.println("I AM GREET");
	}
}
class Two extends One									//CHILD CLASS FOR ABSTRACT CLASS
{
	public void wish()
	{
		System.out.println("I AM WISH");
	}
}
public class DEMO1
{
	public static void main(String[]arg)
	{
		/*One ob1=new One();*/							//ABSTRACT CLASS CAN NOT BE INSTANTIATED
		Two ob=new Two();								//OBJECT CREATION AND ASSIGNING A REFERENCE TO OBJECT
		ob.greet();
		ob.wish();
	}
}