import java.util.Scanner;
public class Integer
{
public static void main(String args[])
{
	int a;
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=Sc.nextInt();
	if(a%2==0)
	{
		System.out.println("The number is even");
	}
	else
	{
 		System.out.println("The number is odd");
	}
}
}
	
