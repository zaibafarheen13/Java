class cylinder 
{
final float pi=3.14;
float radius;
float height;
cylinder()
{
radius=10.123;
height=8.123;
}
cylinder(float rad,float hei)
{
radius=rad;
height=hei;
}
float volume()
{
float vol;
vol=pi*radius*radius*height;
return vol;
}
}
class prog1
{
public static void main(String args[])
{
cylinder obj1=new cylinder();
float a=obj1.volume();
System.out.println("Volume of a cylinder using default constructor is:"+a);
cylinder obj2=new cylinder(12.22,5.67);
float b=obj2.volume();
System.out.println("Volume of a cylinder using parameterized constructor is:"+b);
}
}

