package Inheritance;

public class Teacher {

	String designation = "Teacher";
    String college = "Beginers Book";
    void m()
    {
    	System.out.println("is Teaching Physics");
 
	}

}
public class PhysicsTeacher extends Teacher
{
	String x = "Physics";
	public static void main(String args[])
	{
		PhysicsTeacher PT = new PhysicsTeacher();
		System.out.println("PT.college");
		System.out.println("PT.designation");
		PT.m();
		
	}
			
}
