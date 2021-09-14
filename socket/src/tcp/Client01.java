package tcp;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client01 {

	public static void main(String[] args) throws Exception {
		// 서버와 접속 시도
		Socket sock = new Socket("124.54.116.228", 10000);
		
		OutputStream out = sock.getOutputStream();
		System.out.print("전송할 숫자 입력 : ");
		int num = new Scanner(System.in).nextInt();
		out.write(num);
		
		out.close();
		sock.close();
	}
}
