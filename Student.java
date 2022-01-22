package week1.day1;

public class Student{
	String name = "GOBI";
	int rollNo = 199439;
	public String College()
	{
		String college = "RVS COLLEGE";
		System.out.println("College : "+college);
	}
	void DepartmentName(String name)
	{
		System.out.println("Bsc (Computer Science)");
		
	}
	public void NoOfSubjects(int Subjects)
	{
	System.out.println('5');
	}
	
	private boolean passorfail(boolean pass) 
	{
		return false;
	}

public static void main(String[]args)
{
	Student st = new Student();
	System.out.println("My Details");
	System.out.println("Name  ");
	System.out.println("RollNo ");
	System.out.println("College ");
	System.out.println("DepartmentName");
	System.out.println("No of Subjects");
	System.out.println("pass");
	
	
	
}
	
}
		
