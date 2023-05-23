package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HW02 extends JFrame{
	public HW02() {
		super("계산기");
		
		JPanel np = new JPanel();
		JTextField jtf1 = new JTextField();
		jtf1.setColumns(40);
		np.add(jtf1);
		
		
		JPanel cp = new JPanel(new GridLayout(5,4));
		
		
		
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
		
	
		
		cp.add(jb1);
		cp.add(jb2);
		cp.add(jb3);
		cp.add(jb4);
		cp.add(jb5);
		cp.add(jb6);
		cp.add(jb7);
		cp.add(jb8);
		cp.add(jb9);
		cp.add(jb10);
		cp.add(jb11);
		cp.add(jb12);
		cp.add(jb13);
		cp.add(jb14);
		cp.add(jb15);
		
		
		
		add(np);
		add(cp);
		
		add(np,BorderLayout.NORTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new HW02();
	}

}
