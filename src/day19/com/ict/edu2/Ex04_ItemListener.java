package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

//JCheckBox, JRadioButton, JToggleButton => ItemListener
public class Ex04_ItemListener extends JFrame implements ItemListener, ActionListener {
	JPanel jp1, jp2;
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;

	public Ex04_ItemListener() {
		super("체크박스");
		jp1 = new JPanel();
		jcb1 = new JCheckBox("축구");
		jcb2 = new JCheckBox("야구");
		jcb3 = new JCheckBox("농구");
		jcb4 = new JCheckBox("배구");
		
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		
		jta = new JTextArea(10,0);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		
		jp2 = new JPanel();
		jb1 = new JButton("exit");
		jb2 = new JButton("clear");

		jp2.add(jb1);
		jp2.add(jb2);
		
		add(jp1, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp2, BorderLayout.SOUTH);
		
		
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//체크박스에 ItemListener를 달자
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		//버튼에 ActionListener을 달자
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
	
	}
	//ItemListener 해결하는 추상 메서드(체크박스)
	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox obj = (JCheckBox)e.getSource();
		if(e.getStateChange() == e.SELECTED) {
			jta.append(obj.getText() + "선택\n");
		}else if(e.getStateChange() == e.DESELECTED) {
			jta.append(obj.getText() + "해제\n");
		}
	}
	//ActionListener 해결해 주는 추상 메서드(버튼)
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if(obj == jb1) {
			System.exit(0);
		}else if (obj == jb2) {
			//clear(초기화)
			//체크박스에 선택된 것을 모두 지우기
			jcb1.setSelected(false); //내가 선택하는거니 set
			jcb2.setSelected(false); //내가 선택하는거니 set
			jcb3.setSelected(false); //내가 선택하는거니 set
			jcb4.setSelected(false); //내가 선택하는거니 set
			jta.setText(""); //글자없이 세팅해야하니까
		}
		
	}
	public static void main(String[] args) {
		new Ex04_ItemListener();
	}

}
