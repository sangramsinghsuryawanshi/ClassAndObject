package classObject;

import java.util.Scanner;

public class WithReturnTypeWithArgument 
{
	public int add(int a,int b) 
	{
		int c=a+b;
		return c;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WithReturnTypeWithArgument w1 = new WithReturnTypeWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c1=w1.add(a, b);
		System.out.println("Additon of two numbers is: "+c1);
	}

}
