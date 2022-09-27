package stringpara;

public class string2 
{
	public static void main(String[] args) 
	{
	studentinfo ("Akshay",121,'C',56.5f);
    System.out.println("****************************");
    studentinfo ("Amol",241,'B',62.5f);	
  }
	

public static void
studentinfo(String name,int rollno,char grade,float percent) 
{
	System.out.println(name);
	System.out.println(rollno);
	System.out.println(grade);
	System.out.println(percent);
}
}