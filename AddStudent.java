import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AddStudent extends JFrame {
    JLabel Id;
    JLabel Name;
    JLabel FName;
    JLabel Phone;
    JLabel FPhone;
    JLabel Class;
    JLabel RollNum;
    JLabel Adress;
    JLabel Back;
    JLabel StudReg;
    JLabel all;
    JTextField idT;
    JTextField nameT;
    JTextField fNameT;
    JTextField phoneT;
    JTextField fPhoneT;
    JTextField classT;
    JTextField rollNumT;
    JTextField adressT;
    JButton sub;

    Font f1 = new Font("MV Boli",Font.BOLD,44);
    Font f2 = new Font("Arial", Font.BOLD,25);

    AddStudent() {

            setSize(1550, 800);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(null);

            ImageIcon backg = new ImageIcon(ClassLoader.getSystemResource("AddStudent Background.png"));
            Image img = backg.getImage().getScaledInstance(1550, 800, Image.SCALE_SMOOTH);
            ImageIcon backg1 = new ImageIcon(img);

            all = new JLabel();
            all.setLayout(null);
            all.setSize(1550, 800);

            StudReg = new JLabel("Student's Registration");
            StudReg.setFont(f1);
            StudReg.setBounds(600, 40, 2400, 35);

            Id = new JLabel("ID:");
            Id.setFont(f2);
            Id.setBounds(150, 200, 100, 30);

            idT = new JTextField();
            idT.setBounds(240, 200, 300, 30);
            idT.setFont(f2);

            Name = new JLabel("Name:");
            Name.setFont(f2);
            Name.setBounds(150, 250, 100, 30);

            nameT = new JTextField();
            nameT.setBounds(240, 250, 300, 30);
            nameT.setFont(f2);

            FName = new JLabel("Fathers Name:");
            FName.setFont(f2);
            FName.setBounds(150, 300, 250, 30);

            fNameT = new JTextField();
            fNameT.setBounds(350, 300, 300, 30);
            fNameT.setFont(f2);

            Phone = new JLabel("Phone:");
            Phone.setFont(f2);
            Phone.setBounds(150, 350, 100, 30);

            phoneT = new JTextField();
            phoneT.setBounds(240, 350, 300, 30);
            phoneT.setFont(f2);

            FPhone = new JLabel("Fathers Phone:");
            FPhone.setFont(f2);
            FPhone.setBounds(150, 400, 250, 30);

            fPhoneT = new JTextField();
            fPhoneT.setBounds(350, 400, 300, 30);
            fPhoneT.setFont(f2);

            Class = new JLabel("Class:");
            Class.setFont(f2);
            Class.setBounds(150, 450, 100, 30);

            classT = new JTextField();
            classT.setBounds(240, 450, 300, 30);
            classT.setFont(f2);

            RollNum = new JLabel("Roll Number:");
            RollNum.setFont(f2);
            RollNum.setBounds(150, 500, 250, 30);

            rollNumT = new JTextField();
            rollNumT.setBounds(350, 500, 300, 30);
            rollNumT.setFont(f2);

            Adress = new JLabel("Address:");
            Adress.setFont(f2);
            Adress.setBounds(150, 550, 150, 30);

            adressT = new JTextField();
            adressT.setBounds(280, 550, 300, 30);
            adressT.setFont(f2);

            sub = new JButton("Submit");
            sub.setFont(f2);
            sub.setBounds(900, 600, 150, 40);
            sub.setFocusable(false);

            Back = new JLabel("Back");
            Back.setFont(f1);
            Back.setForeground(Color.RED);
            Back.setBounds(1350, 20, 400, 30);
            Back.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    StudentModule obj = new StudentModule();
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

            all.add(Id);
            all.add(idT);
            all.add(Name);
            all.add(nameT);
            all.add(FName);
            all.add(fNameT);
            all.add(Phone);
            all.add(phoneT);
            all.add(FPhone);
            all.add(fPhoneT);
            all.add(Class);
            all.add(classT);
            all.add(RollNum);
            all.add(rollNumT);
            all.add(Adress);
            all.add(adressT);
            all.add(StudReg);
            all.add(sub);
            all.add(Back);
            all.setIcon(backg1);
            add(all);
            setVisible(true);
        }
        public static void main(String[] args) {
        new AddStudent();
    }

}
