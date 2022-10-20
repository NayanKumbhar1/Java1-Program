import java.util.*;
class Student
{
	int id;
	String name;
	double fees;
	Scanner sc = new Scanner(System.in);

	void setStudent()
	{
		System.out.println("Enter the ID:");
		id = sc.nextInt();
		System.out.println("Enter the Name:");	
		name = sc.next();
		System.out.println("Enter the Fees:");
		fees = sc.nextDouble();
	}

	void getStudent()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Fees:"+fees);
	}

	public static void main(String args[])
	{
		Student student = new Student();
		student.setStudent();
		student.getStudent();
	}	
}







