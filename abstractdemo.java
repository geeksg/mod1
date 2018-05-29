package dempackage;
abstract class demo1
{
	abstract public void Test1();//abstract or incomplete method
	abstract public void Test3();
     public void Test2()//complete method
{
	System.out.println("Test 2 method");
}
}
public class abstractdemo extends demo1 {

	public static void main(String[] args) 
	{
		
demo1 k=new demo1();
	}

public void Test1()
{
	System.out.println("Test 2 method");
}
public void Test3()
{
	System.out.println("Test 3 method");
}
}
