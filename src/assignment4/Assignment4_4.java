package assignment4;	//package declaration
import java.util.Scanner;
public class Assignment4_4 
{
	static void printAliquotSum(int n)
    {
		int sum=0;	//integer variable sum to store aliquot sum
		System.out.println("Aliquot Divisors");
        for (int i=1;i<n;i++)
        {
        	if (n%i==0)		//condition to check for divisor of given number
        	{
                	System.out.print(i+ " ");
                	sum+=i;		//add all aliquot divisor
        	}
        }
        System.out.println("");
        System.out.println("Aliquot Sum="+sum);		//print aliquot sum
        if(n==sum)		//condition to check if the given number is perfect number or not
        	System.out.println(n + " is Perfect no.");
        else
        	System.out.println(n + " is not a perfect no.");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a no.");
		Scanner in= new Scanner(System.in);	
		printAliquotSum(in.nextInt());
		System.out.println("PERFECT NUMBERS BETWEEN 1 TO 100");//passing command line argument to the method
		for(int j=1;j<=100;j++)		//check perfect number between 1 to 100
		{
			int k;
			int s1=0;
	        for (k=1;k<j;k++)
			{
	        	if (j%k==0)
				{
	        		s1+=k;
				}
			}
			if(j==s1)
				System.out.println(j+ " is Perfect no.");
			
		 }
	}
}