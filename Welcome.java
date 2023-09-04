import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Welcome extends JFrame {

    JLabel menuPage;
    JLabel all;
    JLabel logout;
    JButton studBut;
    JButton feeBut;
    JButton teachBut;
    JButton studRepCardBut;
    Font f1 = new Font("MV Boli",Font.BOLD,44);
    Font f2 = new Font("Arial", Font.PLAIN,20);
    Font f3 = new Font("Arial", Font.BOLD,25);

    Welcome() {
        setSize(1550, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        all = new JLabel();
        all.setLayout(null);
        all.setSize(1550,800);

        ImageIcon backg =new ImageIcon(ClassLoader.getSystemResource("Login Page Background.png"));
        Image img=backg.getImage().getScaledInstance(1550,800,Image.SCALE_SMOOTH);
        ImageIcon backg1 =new ImageIcon(img);

        menuPage = new JLabel("Menu Page");
        menuPage.setFont(f1);
        menuPage.setBounds(660,30,2400,50);
        menuPage.setForeground(Color.CYAN);

        logout = new JLabel("Logout");
        logout.setFont(f1);
        logout.setBounds(1330,10,2400,50);
        logout.setForeground(Color.RED);
        logout.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                LoginPage obj = new LoginPage();
                obj.setVisible(true);
                dispose();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        studBut = new JButton("Student Module");
        studBut.setFont(f2);
        studBut.setBounds(150,200,200,50);
        studBut.setFocusable(false);
        studBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentModule obj = new StudentModule();
                obj.setVisible(true);
                dispose();
            }
        });

        feeBut = new JButton("Fee Submission Module");
        feeBut.setFont(f2);
        feeBut.setBounds(600,300,300,50);
        feeBut.setFocusable(false);
        feeBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FeeSubmission obj = new FeeSubmission();
                obj.setVisible(true);
                dispose();
            }
        });

        teachBut = new JButton("Teacher Module");
        teachBut.setFont(f2);
        teachBut.setBounds(1200,200,200,50);
        teachBut.setFocusable(false);
        teachBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TeacherModule obj = new TeacherModule();
                obj.setVisible(true);
                dispose();
            }
        });

        studRepCardBut = new JButton("Student Report Card");
        studRepCardBut.setFont(f2);
        studRepCardBut.setBounds(600,480,300,50);
        studRepCardBut.setFocusable(false);
        studRepCardBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReportCard obj = new ReportCard();
                obj.setVisible(true);
                dispose();
            }
        });



        all.add(menuPage);
        all.add(logout);
        all.setIcon(backg1);
        all.add(studBut);
        all.add(feeBut);
        all.add(teachBut);
        all.add(studRepCardBut);
        add(all);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Welcome();
    }
}