package dempackage;



public class overloading {

	public static void main(String[] args) {
overloading s=new overloading();
s.Test1(10.3,20);

}
    void Test1(int a,double b) 
		{
		System.out.println("Parameter1");	
		}
		void Test1(double a, int b)
		{
			System.out.println("Parameter2");	
		}
		void Test1(int a, int b,int c)
		{
			System.out.println("Parameter3");	
		}	

	}