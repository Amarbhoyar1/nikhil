package Method;

public class nonstatic5 
{
	public static void main(String[] args) 
	{
		System.out.println("Good morning");
		nonstatic5 A1=new nonstatic5();
		A1.K1();
		A1.K2();
		System.out.println("..............");
		nonstatic5 A2= new nonstatic5();
		A2.K1();
		A2.K2();
		
		System.out.println("<<<<<<<<<<<>>>>>>>>>>>");
		 
		NonstaticDiff4 S1 =new NonstaticDiff4();
		S1.N1();
		S1.N2();
		
		
		
		
		
	}
public void K1()
{
	System.out.println("KKKKKKKKKKKKKKK");
}
public void K2()
{
	System.out.println("HHHHHHHHHHHHHH");
}
}
