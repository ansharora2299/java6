import java.io.*;
import java.net.*;

public class Server{
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(1999);
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream(s.getInputStream());
			String k = dis.readUTF();
			System.out.println("file transferred");
			FileOutputStream fos = new FileOutputStream("C:\\Users\\Lenovo\\eclipse-workspace\\TRY\\dest.txt");
			byte [] b = k.getBytes();
			fos.write(b);
		}catch (IOException ie) {
			ie.printStackTrace();
		}
	}
}