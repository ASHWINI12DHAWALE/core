
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class serverCode 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket server=new ServerSocket(300);	
			Socket receiver=server.accept();
			DataInputStream serverIncoming=new DataInputStream(receiver.getInputStream());
			String value=serverIncoming.readUTF();
			System.out.println("The server received: "+value);
			
			Scanner sc=new Scanner(System.in);
			DataOutputStream clientOutgoing=new DataOutputStream(receiver.getOutputStream());
			String dataToSend=sc.nextLine();
			clientOutgoing.writeUTF(dataToSend);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
