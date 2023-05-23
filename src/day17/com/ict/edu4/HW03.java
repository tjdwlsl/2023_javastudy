package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HW03 extends JFrame {
	public HW03() {
		super("성적계산");
		JPanel jp = new JPanel();
        JLabel jl1 = new JLabel("이름 : ");
        JTextField jtf1 = new JTextField(5);
        
        
        JLabel jl2 = new JLabel("국어 : ");
        JTextField jtf2 = new JTextField(5);
        JLabel jl3 = new JLabel("영어 : ");
        JTextField jtf3 = new JTextField(5);
        JLabel jl4 = new JLabel("수학 : ");
        JTextField jtf4 = new JTextField(5);
        
        jp.add(jtf1);
        jp.add(jl1);
        
        jp.add(jtf2);
        jp.add(jl2);
        jp.add(jtf3);
        jp.add(jl3);
        jp.add(jtf4);
        jp.add(jl4);
        
        add(jp);
        
        
        
        
		
	
		
		

		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동줄바꾸기
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setEditable(false);

		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계	산");
		JButton jb2 = new JButton("종	료");
		JButton jb3 = new JButton("취	소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);

		
		
		add(sp, BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
	}
	public static void main(String[] args) {
		new HW03();
	}

}
