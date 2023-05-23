package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Ex09_JTab extends JFrame {
	public Ex09_JTab() {
		super("JTab");
		//컨테이너(XXXPane = 컨테이너 = 다른 컨테이너를 가질 수 있고, 컴포넌트도 가질 수 있)
		JTabbedPane jtab = new JTabbedPane();
		
		
		JPanel jp1 = new JPanel();
		//배경색
		jp1.setBackground(Color.cyan);
		JButton jb1 = new JButton("+");
		JButton jb2 = new JButton("-");
		JButton jb3 = new JButton("*");
		JButton jb4 = new JButton("/");
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
		jtab.addTab("Cyan탭", jp1);
		add(jtab);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.green);
		JRadioButton jrb1 = new JRadioButton("+");
		JRadioButton jrb2 = new JRadioButton("-");
		JRadioButton jrb3 = new JRadioButton("*");
		JRadioButton jrb4 = new JRadioButton("/");
		
		jrb1.setBackground(Color.cyan);
		jrb2.setBackground(Color.cyan);
		jrb3.setBackground(Color.cyan);
		jrb4.setBackground(Color.cyan);
		
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		
		jtab.addTab("Green탭", jp2);
		add(jtab);
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.pink);
		JCheckBox jcb1 = new JCheckBox("+");
		JCheckBox jcb2 = new JCheckBox("-");
		JCheckBox jcb3 = new JCheckBox("*");
		JCheckBox jcb4 = new JCheckBox("/");
		
	
		
		jp3.add(jcb1);
		jp3.add(jcb2);
		jp3.add(jcb3);
		jp3.add(jcb4);
		
		
		
		jtab.addTab("Pink탭", jp3);
		add(jtab);
		
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	
	public static void main(String[] args) {
		new Ex09_JTab();
	}
	

}
