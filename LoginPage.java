import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class LoginPage extends JFrame{


    JLabel sms;
    JLabel user;
    JLabel pass;
    JLabel fpass;
    JLabel escode;
    JLabel lpage;
    JLabel all;
    JTextField userT;
    JTextField escodeT;
    JPasswordField passF;
    JButton sub;
    JButton okay;
    Font f1 = new Font("MV Boli",Font.BOLD,30);
    Font f2 = new Font("Arial", Font.PLAIN,20);
    Font f3 = new Font("Arial", Font.BOLD,25);
    LoginPage(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(1550,800);
        setLayout(null);
        setResizable(true);

        all = new JLabel();
        all.setLayout(null);
        all.setSize(1550,800);

        ImageIcon backg =new ImageIcon(ClassLoader.getSystemResource("Login Page Background.png"));
        Image img=backg.getImage().getScaledInstance(1550,800,Image.SCALE_SMOOTH);
        ImageIcon backg1 =new ImageIcon(img);

        sms = new JLabel("SCHOOL MANAGEMENT SYSTEM");
        sms.setBounds(500,40,2000,30);
        sms.setForeground(Color.CYAN);
        sms.setFont(f1);

        user = new JLabel("User Name:");
        user.setBounds(200,250,2000,30);
        user.setForeground(Color.white);
        user.setFont(f2);

        pass = new JLabel("PassWord:");
        pass.setBounds(200,310,2000,30);
        pass.setForeground(Color.white);
        pass.setFont(f2);

        fpass = new JLabel("Forgot PassWord?");
        fpass.setBounds(200,500,2000,30);
        fpass.setForeground(Color.white);
        fpass.setFont(f2);

        escode = new JLabel("Enter Secrete Code:");
        escode.setBounds(200,560,2000,30);
        escode.setForeground(Color.white);
        escode.setFont(f2);

        lpage = new JLabel("LOGIN PAGE");
        lpage.setBounds(1300,90,300,30);
        lpage.setFont(f3);
        lpage.setForeground(Color.white);
        lpage.setBackground(Color.red);


        userT = new JTextField();
        userT.setBounds(330,250,400,30);
        userT.setFont(f2);
        userT.setBackground(Color.lightGray);
        userT.setForeground(Color.black);

        passF = new JPasswordField();
        passF.setBounds(330,310,400,30);
        passF.setFont(f2);
        passF.setBackground(Color.lightGray);
        passF.setForeground(Color.black);

        escodeT = new JTextField();
        escodeT.setBounds(400,560,400,30);
        escodeT.setFont(f2);
        escodeT.setBackground(Color.lightGray);
        escodeT.setForeground(Color.black);

        sub = new JButton("Submit");
        sub.setBounds(700,360,100,40);
        sub.setFont(f2);
        sub.setBackground(Color.darkGray);
        sub.setForeground(Color.white);
        sub.setFocusable(false);
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                subActionPerformed(e);
            }
        });

        okay = new JButton("Okay");
        okay.setBounds(700,610,100,40);
        okay.setFont(f2);
        okay.setBackground(Color.darkGray);
        okay.setForeground(Color.white);
        okay.setFocusable(false);
        okay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                okayActionPerfomed(e);
            }
        });


        all.add(sms);
        all.add(user);
        all.add(pass);
        all.add(fpass);
        all.add(escode);
        all.add(lpage);
        all.add(userT);
        all.add(passF);
        all.add(escodeT);
        all.add(sub);
        all.add(okay);
        all.setIcon(backg1);
        add(all);
        setVisible(true);
    }

    private void okayActionPerfomed(ActionEvent e) {
        String secret = escodeT.getText();

        if(secret.equals("Nessi@123")){
            JOptionPane.showMessageDialog(this,"The username and password is 'Nessi and 2000'");
        }
    }

    private void subActionPerformed(ActionEvent e) {
        if(e.getSource() == sub){
            String un = userT.getText();
            String p = String.valueOf(passF.getText());
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolmanagementsystem","nessi","20142015");//establishes connection
                Statement st = con.createStatement();
                String sql = "select * from user_login";

                ResultSet rs = st.executeQuery(sql);
                while(rs.next()) {
                    String username = rs.getString("UserName");
                    String password = rs.getString("PassWor");

                    if (un.equals(username) && p.equals(password)) {
                        new Welcome().setVisible(true);
                    }
                    else {
                        JOptionPane.showMessageDialog(this, "Username or Password is incorrect!");
                    }
                }
            }
            catch(Exception ev){
                JOptionPane.showMessageDialog(null,"Error while establishing connection");
            }
        }

    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new LoginPage().setVisible(true);
            }
        });

    }

}
