package dempackage;

class superclass
{ 
	
	public void Test1() 
	{
		System.out.println("Executing Test1 method from superclass");
	}
	public void Test2()
	{
		System.out.println("Executing Test2 method from superclass");
	}
	}
class subclass extends superclass
{
	public void Test1() 
	
	{
		System.out.println("Executing Test1 method from subclass__--------=-");
	}
    public void Test3()
		{ 
			super.Test1();
		
			System.out.println("Executing Test3 method from subclass");
	}
}

public class superkey {

	public static void main(String[] args) {
	subclass k= new subclass();
	k.Test1();
	k.Test2();
	k.Test3();
	
	
 
	}

}
