
public class RemoteThread implements Runnable {

	@Override
	public void run() 
	{
		process3();
		process4();
	}
	public void process3()
	{
		System.out.println("Process 3 of RemoteThread..");
	}
	public void process4()
	{
		System.out.println("Process 4 of RemoteThread..");
	}
}
