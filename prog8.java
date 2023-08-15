import java.io.*;
import java.lang.*;
class prog8
{
public static void main(String args[]) 
{
String s;
int count=0;
try
{
FileReader fr=new FileReader("app.txt");
BufferedReader br=new BufferedReader(fr);
while((s=br.readLine())!=null)
{
System.out.println(s);
count++;
}
System.out.println("No of lines in the file app.txt is:"+count);
fr.close();
}
catch(IOException e)
{
System.out.println("Exception raised is:"+e);
}
}
}

