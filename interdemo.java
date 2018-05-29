package dempackage;
interface demo
{
 public void Test1();
 public void Test2();
 public void Test3();
	
}
interface demo2 extends demo // interface can extend other interfaces
{
	
}
public class interdemo implements demo ,demo2//multiple inheritance
{

	public static void main(String[] args) {
		
	}
		 public void Test1()
		 {
			 System.out.println("secret");
		 }

		 public void Test2()
		 {
			 System.out.println("kavi");
		 }

		 public void Test3()
		 {
			 System.out.println("prabu");
		 }
	

}
