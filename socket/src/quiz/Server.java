package quiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static int num;
	
	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("접속 대기중...");
		Socket sock = server.accept();
		System.out.println(sock.getInetAddress() + "님 접속");
		
		num = (int)Math.random()*100;
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("Up & Down Game Start(0~100)\n>>>");
		System.out.println("정답은 : " + num);
		
		InputStream is = sock.getInputStream();
		DataInputStream di = new DataInputStream(is);
		
		System.out.println("수신 대기...");
		String readData = di.readUTF();
		System.out.println("수신 데이터 : " + readData);
		
		if(Integer.parseInt(readData) > num) {
			dos.writeUTF("Down!");
		}else if(Integer.parseInt(readData) < num) {
			dos.writeUTF("Up!");
		}else {
			dos.writeUTF("정답!");
			System.out.println("프로그램 종료");
			di.close();
			is.close();
			sock.close();
			server.close();
			dos.close();
			os.close();
		}
	}
}
