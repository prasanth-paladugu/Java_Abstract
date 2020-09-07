//EXAMPLE ON ABSTRACT METHODS
abstract class Numbers									//ABSTRACT CLASS
{
	public abstract void compute(int x,int y);			//ABSTRACT METHOD
}
class add extends Numbers								//CHILD CLASS FOR ABSTRACT CLASS
{
	public void compute(int x,int y)					//OVER-RIDING ABSTRACT METHOD
	{
		System.out.println("SUM	"+(x+y));
	}
}
class sub extends Numbers								//CHILD CLASS FOR ABSTRACT CLASS
{
	public void compute(int x,int y)					//OVER-RIDING ABSTRACT METHOD
	{
		System.out.println("DIFF	"+(x-y));
	}
}
class mul extends Numbers								//CHILD CLASS FOR ABSTRACT CLASS
{
	public void compute(int x,int y)					//OVER-RIDING ABSTRACT METHOD
	{
		System.out.println("PROD	"+(x*y));
	}
}
class div extends Numbers								//CHILD CLASS FOR ABSTRACT CLASS
{
	public void compute(int x,int y)					//OVER-RIDING ABSTRACT METHOD
	{
		System.out.println("DIV	"+(x/y));
	}
}
class mdiv extends Numbers								//CHILD CLASS FOR ABSTRACT CLASS
{
	public void compute(int x,int y)					//OVER-RIDING ABSTRACT METHOD
	{
		System.out.println("M.DIV	"+(x%y));
	}
}
public class DEMO2
{
	public static void main(String[]arg)
	{
		add a=new add();
		a.compute(10,20);
		sub s=new sub();
		s.compute(10,20);
		mul m=new mul();
		m.compute(10,20);
		div d=new div();
		d.compute(10,20);
		mdiv p=new mdiv();
		p.compute(10,20);
	}
}