package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame {
    JPanel pg1;
    CardLayout cardLayout;

    public Ex02_Main() {
        super("카드레이아웃2");

        pg1 = new JPanel();
        cardLayout = new CardLayout();
        pg1.setLayout(cardLayout);

        Ex02_Login login = new Ex02_Login(cardLayout,pg1);
        Ex02_Join join = new Ex02_Join(this);
        Ex02_Login_ok loginok = new Ex02_Login_ok(this);

        pg1.add("login", login);
        pg1.add("join",join);
        pg1.add("loginok",loginok);


        add(pg1);

        //cardLayout.show(pg1, "loginok");
        setLocationRelativeTo(null);
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Ex02_Main();
    }
}