package Studentdatabaseapp;
import java.util.*;
public class StudentDatabaseApp
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number of new students to Enroll:");
		Scanner in=new Scanner(System.in);
		int numberOfStudents=in.nextInt();
		Student[] students=new Student[numberOfStudents];
		for(int n=0;n<numberOfStudents;n++)
		{
			students[n]=new Student();
			students[n].enroll();
			students[n].payTution();
		
		}
		for(int n=0;n<numberOfStudents;n++)
		{
			System.out.println(students[n].toString());
		}
}
}