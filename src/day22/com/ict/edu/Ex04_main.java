package day22.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class Ex04_main extends JFrame{
	JPanel jp;
	ButtonGroup bg;
	JRadioButton jrb1, jrb2;
	Ex04_Canvas canvas = new Ex04_Canvas();
	
	public Ex04_main() {
		super("라디오 버튼을 이용해서 그림 선택");
		jp = new JPanel();
		bg = new ButtonGroup();
		jrb1 = new JRadioButton("그림1");
		jrb2 = new JRadioButton("그림2");
		bg.add(jrb1);
		bg.add(jrb2);
		jp.add(jrb1);
		jp.add(jrb2);
		
		add(jp, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		setSize(300, 300);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		jrb1.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == e.SELECTED) { //선택되었는지 물음
					canvas.image = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
					canvas.repaint();
				}
			}
		});
		jrb2.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				canvas.image = Toolkit.getDefaultToolkit().getImage("src/images/java2.png");
				canvas.repaint();
			}
		});
	
	}
	public static void main(String[] args) {
		new Ex04_main();
	}
}
