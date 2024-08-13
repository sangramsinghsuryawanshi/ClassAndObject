package classObject;

import java.util.Scanner;

public class ArmstrongNumAccesesTheArrayByTheArg 
{
	public void ArmstrongNoReturnTypeWithArg(int[] a)
	{
		System.out.print("Armstrong Number no ReturnType With Argument ");
		for(int i=0;i<a.length;i++)
		{
			int c=0,rev=0,rem=0;
			for(int j=a[i];j!=0;j=j/10)
			{
				rem=j%10;
				rev+=(rem*rem*rem);
			}
			if(rev==a[i])
			{
				System.out.print(rev+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArmstrongNumAccesesTheArrayByTheArg a1 = new ArmstrongNumAccesesTheArrayByTheArg();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.print("------------------------\n");
		System.out.print("Enter size of array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		a1.ArmstrongNoReturnTypeWithArg(a);
	}

}
