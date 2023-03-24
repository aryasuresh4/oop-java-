public class Products
{
int pcde;
String  pnme;
double prce;
Products(int pcode,String pname,double price)
{
pcde=pcode;
pnme=pname;
prce=price;
}
public static void main(String args[])
{
Products p1= new Products(101,"product1",55.2);
Products p2= new Products(102,"product1",10.3);
Products p3= new Products(103,"product1",25.9);
if(p1.prce <p2.prce && p1.prce < p3.prce)
{
System.out.println("Price of product2 is lowest");
}
else if(p2.prce<p1.prce && p2.prce < p3.prce)
{
System.out.println("Price of product2 is lowest");
}
else if(p3.prce>p2.prce && p3.prce<p1.prce)
{
System.out.println("Price of product3 is lowest");
}
}
}
