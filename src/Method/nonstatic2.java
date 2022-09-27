package Method;

public class nonstatic2 
{
	public static void main(String[]args)
	{
		NonstaticDiff2 Vijay =new NonstaticDiff2();
		 Vijay.V2();
		System.out.println("Welcome to Wardha City");
       nonstatic2 Amar =new nonstatic2();
       Amar.C1();
	System.out.println("...................................");
	nonstatic2 samir =new nonstatic2();
	samir.C2();
	NonstaticDiff2 Ajay =new NonstaticDiff2();
	Ajay.V1();
	}

	public void C1 ()
	{
		System.out.println("My First Billian");
		System.out.println("My First Trilian");
	}
	public void C2()
	{
		System.out.println("My Second Billian");
		System.out.println("My Second Trilian");	
	}
}
