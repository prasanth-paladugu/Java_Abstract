//EXAMPLE ON ABSTRACT CLASS AND METHODS
abstract class Test										//ABSTRACT CLASS
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
	public abstract void m4();
}
abstract class Demo extends Test						//CHILD CLASS FOR ABSTRACT CLASS Test
{
	public void m1()
	{
		System.out.println("M1");
	}
	public void m2()
	{
		System.out.println("M2");
	}
}
class Sample extends Demo								//CHILD CLASS FOR ABSTRACT CLASS DEMO
{
	public void m3()
	{
		System.out.println("M3");
	}
	public void m4()
	{
		System.out.println("M4");
	}
}

public class DEMO3
{
	public static void main(String[]arg)
	{
		Sample ob=new Sample();							//OBJECT CREATION AND ASSIGNING A REFERENCE TO OBJECT
		ob.m1();
		ob.m2();
		ob.m3();
		ob.m4();
	}
}