//EXAMPLE ON ABSTRACT CLASS
abstract class He										//ABSTRACT CLASS
{
	static												//STATIC BLOCK
	{
		System.out.println("Static Block");
	}
	public He()											//CONSTRUCTER
	{
		System.out.println("CONSTRUCTER");
	}
	public static void wish()							//STATIC METHOD
	{
		System.out.println("I AM WISH");
	}
	public void greet()									//METHOD
	{
		System.out.println("I AM GREET");
	}
	public final void m1()								//FINAL METHOD
	{
		System.out.println("FINAL M1");
	}
	abstract public void m2();							//ABSTRACT METHOD
}
public class DEMO5 extends He							//CHILD CLASS AND MAIN CLASS
{
	public void m2()
	{
		System.out.println("M2");
	}
	public static void main(String[]arg)
	{
		DEMO5 ob=new DEMO5();							//OBJECT CREATION AND ASSIGNING A REFERENCE TO OBJECT
		ob.greet();
		ob.wish();
		ob.m1();
		ob.m2();
		He.wish();
	}
}