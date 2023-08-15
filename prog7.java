class Threads extends Thread
{
int no;
public Threads(int no)
{
this.no=no;
}
public void run()
{
for(int i=1;i<11;i++)
{
System.out.println(no+"x"+i+"="+i*no);
}
}
}
class prog7
{
public static void main(String args[])
{
Threads t1=new Threads(5);
Threads t2=new Threads(7);
Thread t3=new Threads(13);
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(t1.getPriority()+1);
t3.setPriority(Thread.MAX_PRIORITY);
t1.start();
t2.start();
t3.start();
}
}