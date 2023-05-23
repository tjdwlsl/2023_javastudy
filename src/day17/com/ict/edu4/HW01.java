package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HW01 extends JFrame{
	public HW01() {
		super("계산기");
		
		JPanel np = new JPanel();
        JLabel jl1 = new JLabel("수1 : ");
        JTextField jtf1 = new JTextField(5);
        JLabel jl2 = new JLabel("수2 : ");
        JTextField jtf2 = new JTextField(5);
        JLabel jl3 = new JLabel("연산자 : ");
        String[] items = {"선택하세요"," + "," - "," * "," / "};
        JComboBox<String> jcom = new JComboBox<>(items);

       
        np.add(jl1);
        np.add(jtf1);
        np.add(jl2);
        np.add(jtf2);
        np.add(jl3);
        np.add(jcom);
		
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); //자동줄바꾸기
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		//편집 불가능하게 만들자
		jta.setEditable(false);
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계	산");
		JButton jb2 = new JButton("종	료");
		JButton jb3 = new JButton("취	소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		
		add(np,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		new HW01();
	}

}
