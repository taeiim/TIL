package socketTCP;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) {
		try {
			String serverIP = "127.0.0.1";
			System.out.println("서버에 연결중입니다. 서버 IP: "+serverIP);
			
			Socket socket = new Socket(serverIP,5000);
			
			InputStream in = socket.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			
			System.out.println("서버로 부터 받은 메세지 : "+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			dis.close();
			socket.close();
		} catch (ConnectException ce) {
			ce.printStackTrace();
		} catch(IOException ie){
			ie.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
