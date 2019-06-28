
public class UiThread implements Runnable 
{
	int a; int b;
	@Override
	public void run() 
	{
		process1();
		process2();
		process3();
	}
	public void process1()
	{
		a=10;
		System.out.println("Process 1 of UiThread.."+a);

	}
	public void process2()
	{
		b=16;
		System.out.println("Process 2 of UiThread.."+b);
	}
	public void process3()
	{
		int c=a+b;;
		System.out.println("Process 3 of UiThread.."+c);
	}

}
