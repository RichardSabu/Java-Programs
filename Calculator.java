import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		char op;
		double a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		a=scan.nextDouble();
		b=scan.nextDouble();
		do
		{
			System.out.println("1.Addition(+)");
			System.out.println("2.Subtraction(-)");
			System.out.println("3.Multiplication(*)");
			System.out.println("4.Division(/)");
			System.out.println("5.Exit(Click any key)");
			System.out.println("Enter your choice:");
			op=scan.next().charAt(0);
			switch(op)
			{
				case '+':
					double sum;
					sum=a+b;
					System.out.println("Sum is "+sum);
					break;
				case '-':
					double sub;
					sub=a-b;
					System.out.println("Difference is "+sub);
					break;
				case '*':
					double prod;
					prod=a*b;
					System.out.println("Product is "+prod);
					break;
				case '/':
					double q;
					q=a/b;
					System.out.println("Quotient is "+q);
					break;
				default:
					System.exit(0);
					break;
			}
		}while (true);
	}
}	
