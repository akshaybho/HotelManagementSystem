package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JTextField tf1;
    JPasswordField jp1;
    JButton jb1, jb2;

    Login()
    {
        JLabel jl1 = new JLabel("Username");
        jl1.setBounds(40,20,100,30);
        //counts from frame boundary
        jl1.setFont(new Font("Tahoma", Font.BOLD,16));
        jl1.setForeground(Color.white);
        add(jl1);

        JLabel jl2 = new JLabel("Password");
        jl2.setBounds(40,70,100,30);
        //counts from frame boundary
        jl2.setFont(new Font("Tahoma", Font.BOLD,16));
        jl2.setForeground(Color.white);
        add(jl2);

        tf1 = new JTextField();
        tf1.setBounds(150,20,150,30);
        tf1.setForeground(Color.white);
        tf1.setFont(new Font("Tahoma",Font.PLAIN,15));
        tf1.setBackground(new Color(26,104,48));
        add(tf1);

        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i1 = ic1.getImage().getScaledInstance(255,300, Image.SCALE_DEFAULT);
        //scale defaultly and fit
        JLabel jl3 = new JLabel(ic1);
        jl3.setBounds(318,-30,255,300);
        add(jl3);
        //canva.com we get gif files

        jp1 = new JPasswordField();
        jp1.setBounds(150,70,150,30);
        jp1.setForeground(Color.white);
        jp1.setBackground(new Color(26,104,48));
        add(jp1);

        jb1 = new JButton("Login");
        jb1.setBounds(40,140,120,30);
        jb1.setFont(new Font("serif", Font.BOLD, 15));
        jb1.setBackground(Color.BLACK);
        jb1.setForeground(Color.white);
        jb1.addActionListener(this);
        add(jb1);

        jb2 = new JButton("Cancel");
        jb2.setBounds(180,140,120,30);
        jb2.setFont(new Font("serif", Font.BOLD, 15));
        jb2.setBackground(Color.BLACK);
        jb2.setForeground(Color.white);
        jb2.addActionListener(this);
        add(jb2);

        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setLocation(400,250);
        setSize(600,300);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == jb1)
        {
            try
            {
                Con c = new Con();
                String user = tf1.getText();
                String pass = jp1.getText();

                String q = "SELECT *FROM Users WHERE username = '"+user+"' and password = '"+pass+"'";
                ResultSet rs = c.statement.executeQuery(q);

                if(rs.next())
                {
                    new Dashboard();
                    setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid");
                }
            }
            catch(Exception f)
            {
                f.printStackTrace();
            }
        }
        else
        {
            System.exit(102);
        }
    }

    public static void main(String[] args) {

        new Login();
    }
}
