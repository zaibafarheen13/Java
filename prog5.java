import java.io.*;
import java.lang.*;
interface EmpDetInfo
{
static final String organization="JNC";
void input();
void display();
}
class EmpDet implements EmpDetInfo
{
	String EmpCode,EmpName,EmpDesignation;
	public void input()
	{
		try
		{
			InputStreamReader r=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(r);
			System.out.println("Enter employee code:");
			EmpCode=br.readLine();
			System.out.println("Enter employee name:");
			EmpName=br.readLine();
			System.out.println("Enter employee designation:");
			EmpDesignation=br.readLine();
		}
		catch(Exception e)
		{
			System.out.println("Exception raised is:"+e);
			}
	}
	public void display()
	{
		System.out.println("Employee Details");
		System.out.println("****************");
		System.out.println("Enter employee code:"+EmpCode);
		System.out.println("Employee name:"+EmpName);
		System.out.println("Employee designation:"+EmpDesignation);
		System.out.println("Employee organization:"+organization);
	}
}
class prog5
{
	public static void main(String srgs[])
	{
		EmpDet obj=new EmpDet();
		obj.input();
		obj.display();
	}
}

 