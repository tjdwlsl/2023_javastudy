package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Layout extends JFrame{
	public Ex04_Layout() {
		
		
		
		//JPanel jp = new JPanel();
		//JPanel 을 BorderLayout로 변경하자
		//방법1)
		//JPanel jp = new JPanel(new BorderLayout());
		
		
		//방법2) 
		//JPanel jp = new JPanel();
		//jp
		
		
		
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		JButton jb7 = new JButton("버튼7");
		JButton jb8 = new JButton("버튼8");
		
		//아무것도 하지 않으면 BorderLayout
		//아무것도 하지 않으면 마지막 컴포넌트가 화면을 차지한다/;.
		
		//add(jb1);
		//add(jb2);
		//add(jb3);
		//add(jb4);
		//add(jb5);

		//방향표시
	

		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
			
		}
	
	
	public static void main(String[] args) {
		new Ex04_Layout();
	}

}
