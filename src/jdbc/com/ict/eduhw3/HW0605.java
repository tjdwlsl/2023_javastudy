package jdbc.com.ict.eduhw3;


import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class HW0605 extends JFrame{
	JPanel jp1, jp2, jp3, jp4;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4, jb5, jb6;
	
	public HW0605() {
	super("DB 연동정보");
	
	jp1 = new JPanel(new GridLayout(4,1));
	jp2 = new JPanel(new GridLayout(1,2));
	
	jp1.add(new JLabel("CUSTID :", JLabel.CENTER));
	jp1.add(new JLabel("NAME :", JLabel.CENTER));
	jp1.add(new JLabel("ADDRESS :", JLabel.CENTER));
	jp1.add(new JLabel("PHONE :", JLabel.CENTER));
	
	jp2.add(jp1);
	
	jp3 = new JPanel(new GridLayout(4,1));
	jtf1 = new JTextField(30);
	jtf2 = new JTextField(30);
	jtf3 = new JTextField(30);
	jtf4 = new JTextField(30);
	jp3.add(jtf1);
	jp3.add(jtf2);
	jp3.add(jtf3);
	jp3.add(jtf4);
	jp2.add(jp3);
	
	add(jp2,BorderLayout.NORTH);
	
	jta = new JTextArea();
	jta.setEditable(false);
	jta.setLineWrap(true);
	jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	add(jsp);
	
	jb1 = new JButton("전체보기");
	jb2 = new JButton("삽입");
	jb3 = new JButton("삭제");
	jb4 = new JButton("검색");
	jb5 = new JButton("불러오기");
	jb6 = new JButton("고치기");
	jb6.setEnabled(false); //고치기 버튼 클릭안됨 처리
	
	jp4 = new JPanel();
	jp4.add(jb1);
	jp4.add(jb2);
	jp4.add(jb3);
	jp4.add(jb4);
	jp4.add(jb5);
	jp4.add(jb6);
	
	add(jp4,BorderLayout.SOUTH);
	
	
	//pack();
	setSize(650,500);
	setLocationRelativeTo(null);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	
	jb1.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	
	
	}	
	public static void main(String[] args) {
		new HW0605();
	}
}