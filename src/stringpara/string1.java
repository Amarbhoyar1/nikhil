package stringpara;

public class string1 
{
public static void main(String[]args)
{
	studentinfo ("Rahul",101,'A',54.5f);
	System.out.println(".......................");
	studentinfo ("Amar",201,'B',65.5f);
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
