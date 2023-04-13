class Rectangle
{
double length;
int breadth;
void setData()
 {
   length=12.48;
   System.out.println("The length of rectangle is: "+length);
   breadth=13;
   System.out.println("The breadth of rectangle is: "+breadth);
  }
  
void getArea()
{
   double area;
   area=length*breadth;
   System.out.println("The area of rectangle: "+area);
}

public static void main(String args[])
{
Rectangle r1=new Rectangle();
r1.setData();
r1.getArea();
}
}
//The length of rectangle i: 12.48
The breadth of rectangle is: 13
The area of rectangle: 162.24
