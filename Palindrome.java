import java.util.*;
class Palindrome
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		int num,rev=0,r,i;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter a number:");
		num=scan.nextInt();
		for (i=num;i>0;i=i/10)
		{
			r=i%10;
			rev=rev*10+r;
		}
		System.out.println("Reversed number is "+rev);
		if (num==rev)
		{
			System.out.println("Number is palindrome");
		}
		else
		{
			System.out.println("Number is not a palindrome");
		}
	}
}			
