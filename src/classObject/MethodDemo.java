package classObject;

import java.util.*;

public class MethodDemo 
{
		public void primeNum()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter value:");
			int n = sc.nextInt();
			int c=0;
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println("Number is prime");
			}
			else
			{
				System.out.println("Number is not prime");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo m = new MethodDemo();
		System.out.println("Main method is start...");
		m.primeNum();
		System.out.println("Main method is ended..");
	}

}
