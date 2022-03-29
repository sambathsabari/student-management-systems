package Studentdatabaseapp;
import java.util.*;
public class Student 
{
	private String Name;
	private int GradeYear;
	private String StudentId;
	private String courses="";
	private int tutionBalance=0;
	private static int costofCourse=600;
    private static int id=1000;
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Student Name:");
		this.Name=in.nextLine();
		System.out.print("1-Iyear\n2-IIyear\n3-IIIyear\n4-IVyear\nEnter Student Grade Year:");
		this.GradeYear=in.nextInt();
		setStudentId();
		
	}
		public void setStudentId()
		{
			id++;
			this.StudentId=GradeYear+" "+id;	
		}
		public void enroll()
		{
			do 
			{
			System.out.println("Enter course to Enroll(Q to quit):");
			Scanner in=new Scanner(System.in);
			String course=in.nextLine();
			if(!course.equals("Q")) 
			{
				courses=courses+"\n"+course;
				tutionBalance=tutionBalance+costofCourse;
			}	
			else
			{
			
				break;
			}
			}while(1!=0);
			System.out.println("ENROOLED IN:"+courses);
			System.out.println("TUTION BALANCE:"+tutionBalance);
		}
		public void viewBalance()
		{
			System.out.println("Your Balance is:$"+tutionBalance);
		}
		public void payTution()
		{
			viewBalance();
			System.out.println("Enter your Payment:$");
			Scanner in=new Scanner(System.in);
			int payment=in.nextInt();
			tutionBalance=tutionBalance-payment;
			System.out.println("Thank You For Your Payment of$"+payment);
			viewBalance();
		}
		public String tostring()
		{
			return "Name:"+Name+""+
		    "\nGradeYear:"+GradeYear+
		    "\nStudentID:"+StudentId+
		    "\nCourses Enrolled:"+courses+
		    "\nBalance:$"+tutionBalance;
		}
}
