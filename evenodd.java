import java.util.*;
class evenodd
{
public static void main(String args[])
{
   System.out.println("enter the number");
   Scanner n=new Scanner(System.in);
   int num=n.nextInt();
   if(num%2==0)
   {
      System.out.println("the number"+num+"is even");
   }
else
   {
       System.out.println("the number"+num+"is odd");
   }
}
}

