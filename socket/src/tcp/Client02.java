package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {

	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1", 12345);

		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		System.out.print("전송 데이터 입력 : ");
		String s = new Scanner(System.in).next();
		
		dos.writeUTF(s);
		System.out.println("전송 완료");
		
		InputStream is = sock.getInputStream();
		DataInputStream ids = new DataInputStream(is);
		
		System.out.println("수신 데이터 : " + ids.readUTF());
		
		dos.close();
		os.close();
		sock.close();
		ids.close();
		is.close();
	}
}
