package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

//문자
public class EchoServer implements Runnable{
	ServerSocket ss = null;
	Socket s = null;
	
	InputStreamReader isr = null;
	BufferedReader br = null;
	
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;
	
	
	public EchoServer() {
		// TODO Auto-generated constructor stub
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중...");
			
			new Thread(this).start();

		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				s = ss.accept();
				isr = new InputStreamReader(s.getInputStream());
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				
				osw = new OutputStreamWriter(s.getOutputStream());
				bw = new BufferedWriter(osw);
				
				//BufferedWriter 사용시 System.lineSeparator() 사용해야함
				//안하면 flush해도 늦게 날아가거나 안날아감
				//Java에는 운영체제 별 개행문자에 대응하기 위해 필요한 메서드를 제공함
				//-> System.lineSeparator()임
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					s.close();
					bw.close();
					osw.close();
					br.close();
					isr.close();
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
