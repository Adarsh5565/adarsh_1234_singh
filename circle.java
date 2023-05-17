import java.util.*;
class circle
{
double r;
double circumference;
double area;
 circle()
 {
  r=5;
 }

 circle (double rp)
 {
  System.out.println("Enter radius of circle");
  Scanner ref=new Scanner(System.in);
  r=ref.nextDouble();
 }

 void circumference()
 {
  circumference=Math.PI*r*2;
  System.out.println("Circumference of circle:"+circumference);
 }

 void area()
 {
  area=Math.PI*r*r;
  System.out.println("Area of circle:-"+area);
 }

 public static void main (String s[])
  {
   circle a= new circle(9);
   
 
   //a=new circle();
   
   a.circumference();
   a.area();
  
   }
}