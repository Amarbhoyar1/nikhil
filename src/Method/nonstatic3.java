package Method;

public class nonstatic3 
{
	public static void main(String[]args)
	{
		System.out.println("Sweet Home");
		nonstatic3 www = new nonstatic3();    //call from Same class
		www.B1();
		www.B2();
		System.out.println("...................................");
	NonstaticDiff3 kkk= new NonstaticDiff3();   //call from Diff class
	      kkk.L1();
	      kkk.L2();
	}
	
	
	
public void B1()
{
	System.out.println("Call From Same Class B1");
}
public void B2()
{
	System.out.println("Call From Same Class B2");
}

}
