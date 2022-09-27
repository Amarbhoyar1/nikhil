package Method;

public class Nonstatic1 
{
	public static void main(String[]args)
	{
	    Nonstatic1 Amar=new Nonstatic1();
		Amar.m3();
	    Amar.m4();	
	    NonstaticDiff1 samir=new NonstaticDiff1();
	    samir.D1();
	}	
  public void m3()      //running nonstatic method from same class
	{
    System.out.println("Running Non static m3 from same class"); 
    }
	public void m4()
	{
		System.out.println("Running Non static m4 from same class");
	}
	}

