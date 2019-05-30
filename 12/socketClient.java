import java.io.*;
import java.net.*;
public class socketClient{
	public static void main(String[] args) {
		try {
			Socket s = new Socket("localhost",1999);
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\eclipse-workspace\\TRY\\src.txt") );
			byte [] b = new byte[30];
			String k = reader.readLine();
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			dos.writeUTF(k);
			System.out.println("file transferred");
		}catch(Exception e) {
			e.printStackTrace();
			
		} 
	}
}