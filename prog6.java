class prog6
{
public static void main(String args[])
{
int result,x;
x=10;
try
{
result=x/args.length;
int a[]={1,2,3,4};
System.out.println("a[4] is:"+a[4]);
}
catch(ArithmeticException e)
{
System.out.println("Exception raised is:"+e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Exception rasied is:"+e);
}
}
}