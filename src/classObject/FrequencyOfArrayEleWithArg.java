package classObject;

import java.util.Scanner;

public class FrequencyOfArrayEleWithArg 
{
	public void frequencyOfArrayWithArg(int []a)
	{
		System.out.print("Frequency of array element and thier count: ");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
					c++;
				}
			}
			if(a[i]!=-1)
				System.out.println(a[i]+" = "+c);
		}
		System.out.println("\n-----------------------");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FrequencyOfArrayEleWithArg f = new FrequencyOfArrayEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("-----------------------");
		int a[] = new int[size];
		System.out.print("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("------------------------");
		f.frequencyOfArrayWithArg(a);
	}

}
