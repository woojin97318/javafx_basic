package tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
	
	public static void main(String[] args) throws Exception {
		// port : 2byte의 크기를 가지고 있으며, 특정 프로그램(App)을 구분 지어줌
		// 서버 : 서비스를 제공해주는 대상(컴)
		// 클라이언트 : 서비스를 제공받는 대상(컴)
		
		// 자신의 IP주소와 포트번호(12345)로 서버를 구동시켜준다.
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("접속 대기");
		Socket sock = server.accept();
		
		System.out.println("접속 완료");
		System.out.println(sock.getInetAddress());
		
		InputStream in = sock.getInputStream();
		int readData = in.read();
		System.out.println("수신 데이터 : " + readData);
		
		in.close();
		sock.close();
	}
}
