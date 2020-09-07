//EXAMPLE ON ABSTRACT CLASS RULES
abstract class P										//ABSTRACT CLASS
{
	public abstract void m1();
	protected abstract void m2(String s);
	public abstract void m3();
	abstract public void m4();
}
abstract class D extends P								//CHILD CLASS FOR ABSTRACT CLASS Test
{
	public abstract void m1(int x)						//WE CANNOT CHANGE SIGNATURE OF OVERIDING ABSTRACT METHOD
	{
		System.out.println("M1");
	}
	public void m2(String s)							//WE CAN PROMOTE THE ACESS MODIFIER(PROTECTED==>PUBLIC)
	{
		System.out.println("M2");
	}
	public int void m3()								//WE CANNOT CHANGE RETURN TYPE OF ANY OVERRIDING METHOD
	{
		System.out.println("M3");
	}
	protected void m4()									//WE CAN PROMOTE ACESS MODIFIERS BUT WE CANNOT DEMOTE FROMHIGH TO LOW
	{
		System.out.println("M4");
	}
}

public class DEMO3
{
	public static void main(String[]arg)
	{
	}
}