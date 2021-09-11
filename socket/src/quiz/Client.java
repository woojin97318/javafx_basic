package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);

		InputStream is = sock.getInputStream();
		DataInputStream ids = new DataInputStream(is);
		
		System.out.print(ids.readUTF() + " ");
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		String s = new Scanner(System.in).next();
		dos.writeUTF(s);
		
		System.out.println(ids.readUTF());
		
		dos.close();
		os.close();
		sock.close();
	}
}
