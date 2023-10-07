import java.util.*;
class OddEven
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		int arr[]=new int[50];
		int n,i,ecount=0,ocount=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of elements of array:");
		n=scan.nextInt();
		System.out.println("Enter elements of array:");
		for (i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for (i=0;i<n;i++)
		{	
			if (arr[i]%2==0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		System.out.println("Number of even elements are "+ecount);
		System.out.println("Number of odd elements are "+ocount);
	}
}
