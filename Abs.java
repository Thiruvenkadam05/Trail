import java.util.*;
abstract class Shape
{
Scanner sc= new Scanner(System.in);
abstract void printArea();
}
class Rectangle extends Shape
{
int l,b;
double area;
void printArea()
{
System.out.println("ENter the LENgTh and BreaDTh OF tHe ReactaNgLE : ");
l = sc.nextInt();
b = sc.nextInt();
area = l*b;
System.out.println("The Area of The Rectangle is: " + area);
}
}
class Circle extends Shape
{
int r;
double area;
void printArea()
{
System.out.println("ENter the radius of the Circle : ");
r=sc.nextInt();
area=3.14*r*r;
System.out.println("The Area of thr Circle is : " + area);
}
}
class Triangle extends Shape
{
int h,b;
double area;
void printArea()
{
System.out.println("ENter the Base and Height OF tHe TRiANgLE : ");
b = sc.nextInt();
h = sc.nextInt();
area = 0.5*b*h;
System.out.println("The Area of The Triangle is: " + area);
}
}
class Abs
{

public static void main(String[]args)

{
int c, cl;
Scanner s = new Scanner(System.in);
Rectangle r= new Rectangle();
Circle o = new Circle();
Triangle t = new Triangle();
do
{
System.out.println("Enter ur choice : \n1.Rectangle\n 2.Circle\n 3.Triangle\n");
c=s.nextInt();
switch(c)
{
case 1 :
r.printArea();
break;
case 2 :
o.printArea();
break;
case 3 :
t.printArea();
break;
default :
System.out.println("ENter a valid Choice !! ");
}
System.out.println("Do u wish to continue ? (1.Yes / 2.No )");
cl= s.nextInt();
}
while(cl==1);
}
}

