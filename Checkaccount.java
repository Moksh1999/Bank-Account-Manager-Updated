package bank.application;
import java.util.*;

public class Checkaccount {
    double balance;
	double number;

	@Override
	public String toString() {
		return "Checkaccount [balance=" + balance + ", Amount=" + number + "]";
	}




	public Checkaccount(double balance, double number) {
		super();
		this.balance = balance;
		this.number = number;
	}





	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getNumber() {
		return number;
	}

	public void setNumber(double number) {
		this.number = number;
	}


	public Checkaccount(double balance)
	{
		super();
		this.balance=balance;
	}

	public void Checkaccount(int i,int number) throws Ex
	{
		this.number=number;
		if(number<=balance)
		{
			if(i==1)
			{
				withdraw(number);
			}
			if(i==2)
			{
				deposit(number);
			}
		}
		else
		{
			System.out.println("You can only withdraw : "+(balance-2000));
			throw new Ex("Insufficient Bal");
		}
	}

	public void withdraw(double number) throws Ex
	{
		this.number=number;
		System.out.println("Thank You");
		System.out.println("Your New Balance is : "+(balance-number));
	}

	public void deposit(double number) throws Ex
	{
		this.number=number;
		if(number<=0)
		{
			throw new Ex("Enter Correct Amount");
		}
		else
		{
		System.out.println("Thank You for Depositing");
		System.out.println("Your New Balance is : "+(balance+number));
		}
	}

}
