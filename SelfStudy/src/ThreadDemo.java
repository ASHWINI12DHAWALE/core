
public class ThreadDemo 
{
	public static void main(String[] args) 
	{
		Thread ui=new Thread(new UiThread());
		Thread remote=new Thread(new RemoteThread());
		ui.start();
		remote.start();
	}

}
