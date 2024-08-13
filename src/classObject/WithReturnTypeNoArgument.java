package classObject;

import java.util.Scanner;

public class WithReturnTypeNoArgument 
{
	public int add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int ans=a+b;
		return ans;
	}
	public boolean primeNumber()
	{
		int p=111,c=0;
		for(int i=1;i<=p;i++)
		{
			if(p%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WithReturnTypeNoArgument w = new WithReturnTypeNoArgument();
		int ans=w.add();
		System.out.println("Additon of two number is: "+ans);
		
		boolean ans1=w.primeNumber();
		System.out.println("Prime or not given :"+ans1);

	}

}
