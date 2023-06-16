package network.com.ict.edu6_1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread{
	Socket s;
	ChatServer server;
	//protocol 만들어서 객체 직렬화 해야함
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//ChatServer에 cc.start가 시작할때 run으로옴
	@Override
	public void run() {
		esc:
		while(true) {
			try {
				Object obj = in.readObject();
				if(obj != null) {
					Protocol p = (Protocol)obj; //object로 나오기 때문에 형변환
					switch (p.getCmd()) { //0 or 1 or 2 일수 있다
					//접속종료
					case 0:
						out.writeObject(p);
						break esc;
					//닉네임 받기
					case 1:
						nickName = p.getMsg();
						p.setCmd(2); //다른사람 입장에서는 메세지로 보여주기때문에 2번
						p.setMsg(nickName + "님 입장");
						
						//접속자 모두에게 입장한거 전달해야함
						server.sendMsg(p);
						break;
					//메세지 일반채팅
					case 2:
						p.setCmd(2);
						p.setMsg(nickName + ":" + p.getMsg());
						server.sendMsg(p);
						break;
					}
				}
			} catch (Exception e) {
			}
		}//무한 반복 끝
		try {
			out.close();
			in.close();
			s.close();
			
			server.removeClient(this);
			Protocol p2 = new Protocol();
			p2.setCmd(2);
			p2.setMsg(nickName + "님 퇴장");
			server.sendMsg(p2); //객체를 보내야
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}

}
