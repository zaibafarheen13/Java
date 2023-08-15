class StaticClass
{
static int a=10;
static int b=10;
static void incrbyten()
{
a+=10;
b+=10;
System.out.println("Value of a now is:"+a);
}
}
class prog2
{
public static void main(String args[])
{
StaticClass q=new StaticClass();
//StaticClass.incrbyten();
System.out.println("Vlaue of b now is:"+q.b);
}
}

