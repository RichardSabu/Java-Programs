import java.util.*;
class BankAccount
{
	int accno;
	double balance;
	String cname;
	
	void setData(int a,String c,double b)
	{
		accno=a;
		balance=b;
		cname=c;
	}
	
	void getData()
	{
		System.out.println("Account Number is "+accno);
		System.out.println("Customer Name is "+cname);
		System.out.println("Balance is "+balance);
	}
	
	void withdraw(double amnt)
	{
		if (amnt<=balance)
		{
			balance=balance-amnt;
		}
		else 
		{
			System.out.println("Insufficient balance");
		}
	}
	
	void deposit(double amnt)
	{
		balance=balance+amnt;
		checkBalance();
	}
	
	void checkBalance()
	{
		System.out.println("Balance is "+balance);
	}

	void updateName(String nname)
	{
		cname=nname;
	}
}

class BankAccountDemo
{
	public static void main(String args[])
	{
		System.out.println("Name: Richard Sabu\nRoll no: 34");
		Scanner scan=new Scanner(System.in);
		int acc;
		double bn;
		String cn;
		System.out.println("Enter account number:");
		acc=scan.nextInt();
		System.out.println("Enter customer name:");
		cn=scan.nextLine();
		cn=scan.nextLine();
		System.out.println("Enter balance:");
		bn=scan.nextDouble();
		
		BankAccount b1=new BankAccount();
		b1.setData(acc,cn,bn);
		b1.getData();
		
		System.out.println("Enter amount to be withdrawn:");
		double wn=scan.nextDouble();
		b1.withdraw(wn);
		
		System.out.println("Enter amount to be deposited:");
		double dp=scan.nextInt();
		b1.deposit(dp);
		
		System.out.println("Enter new name:");
		String nn=scan.nextLine();
		nn=scan.nextLine();
		b1.updateName(nn);
		b1.getData();
	}
}
