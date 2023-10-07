import java.util.*;
class Grade
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		double mark;
		System.out.print("Enter your marks:");
		Scanner scan=new Scanner(System.in);
		mark=scan.nextDouble();
		if (mark>=90)
		{
			System.out.println("Grade is S");
		}
		else if (mark>=80 && mark<=89)
		{
			System.out.println("Grade is A");
		}
		else if (mark>=70 && mark<=79)
		{
			System.out.println("Grade is B");
		}
		else if (mark>=60 && mark<=69)
		{
			System.out.println("Grade is C");
		}
		else if (mark>=50 && mark<=59)
		{
			System.out.println("Grade is D");
		}
		else if (mark>=40 && mark<=49)
		{
			System.out.println("Grade is E");
		}
		else
		{
			System.out.println("Grade is F");
		}
	}
}
