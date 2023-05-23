package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_Main extends JFrame{
	public Ex10_Main() {
		super("JTab_2");
		
		
		//JPanel을 상속한 클래스 객체로 만들기
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex10_Green green = new Ex10_Green();
		Ex10_Pink pink = new Ex10_Pink();
		
		//JPanel을 탭에 집어 넣었음
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("Cyan 탭2", cyan);
		jtab.addTab("Green 탭2", green);
		jtab.addTab("Pink 탭2", pink);
		
		//Jtab을 Jframe에 넣자
		add(jtab);
		
		
		Dimension ds = getToolkit().getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex10_Main();
	}

}
