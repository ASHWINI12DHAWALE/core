
public class MyThread extends Thread
{
	public static void main(String[] args) 
	{
		Thread t1=new MyThread();
		t1.setName("Process 1");
		t1.start();
		
		Thread t2=new MyThread();
		t2.setName("Process 2");
		t2.start();
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" is running..");
	}
}
