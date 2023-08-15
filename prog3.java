import java.io.*;
import java.lang.*;
class BoxDim
{
double height,width,depth;
void InputDim()
{
try
{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
System.out.println("Enter the height of the box:");
height=Double.parseDouble(br.readLine());
System.out.println("Enter the width of the box:");
width=Double.parseDouble(br.readLine());
System.out.println("Enter the depth of the box:");
depth=Double.parseDouble(br.readLine());
}
catch(Exception e)
{
System.out.println("Exception is raised is:"+e);
}
}
}
class BoxVol extends BoxDim
{
void display()
{
double vol=height*width*depth;
System.out.println("Volume of the bos is:"+vol);
}
}
class prog3
{
public static void main(String args[])
{
BoxVol obj=new BoxVol();
obj.InputDim();
obj.display();
}
}


