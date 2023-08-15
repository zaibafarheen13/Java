class bank
{
int GetRateOfInterest()
{
return 0;
}
}
class SBI extends bank
{
int GetRateOfInterest()
{
return 1;
}
}
class AXIS extends bank
{
int GetRateOfInterest()
{
return 2;
}
}
class ICICI extends bank
{
int GetRateOfInterest()
{
return 3;
}
}
class prog4
{
public static void main(String args[])
{
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("Rate of interest of SBI is:"+s.GetRateOfInterest());
System.out.println("Rate of inetrest of ICICI is:"+i.GetRateOfInterest());
System.out.println("Rate of interest of AXIS is:"+a.GetRateOfInterest());
q=SBI.GetRateOfInterest();
System.out.println(q);}
}


