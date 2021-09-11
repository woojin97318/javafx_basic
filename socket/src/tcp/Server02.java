package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server02 {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		System.out.println("서버 대기중...");
		Socket sock = server.accept();
		
		InputStream is = sock.getInputStream();
		DataInputStream di = new DataInputStream(is);
		
		System.out.println("수신 대기...");
		String readData = di.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		System.out.print("서버에서 전송할 데이터 입력 : ");
		String s = new Scanner(System.in).next();
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF(s);
		
		di.close();
		is.close();
		sock.close();
		server.close();
		dos.close();
		os.close();
	}
}
