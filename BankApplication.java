package bank.application;
import java.util.*;
public class BankApplication {

   public static void main(String []args) throws Ex
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value For current Balance : ");
		int n=s.nextInt();
		Checkaccount m=new Checkaccount(n);
		int i,amount;
		System.out.println("Press 1 for Withdrawing and 2 for Depositing");
		i=s.nextInt();

                switch(i)
                {
                    case 1:
		{
			System.out.println("Enter the amount to withdraw");
			amount=s.nextInt();
			m.Checkaccount(i, amount);
		}
                    case 2:
		{
			System.out.println("Enter amount to Deposit");
			amount=s.nextInt();
			m.Checkaccount(i, amount);
		}
                }
		System.out.println(m);
	}

}
