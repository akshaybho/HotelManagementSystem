package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {

    JButton add, rec;
    Dashboard()
    {
        super("Hotel Management System");

        rec = new JButton("Reception");
        rec.setBounds(325,510,140,30);
        rec.setFont(new Font("Tahoma", Font.BOLD, 15));
        rec.setBackground(new Color(255, 98, 0));
        rec.setForeground(Color.WHITE);
        rec.addActionListener(this);
        add(rec);

        add = new JButton("Admin");
        add.setBounds(680,510,140,30);
        add.setFont(new Font("Tahoma", Font.BOLD, 15));
        add.setBackground(new Color(255, 98, 0));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icon/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(160,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon11= new ImageIcon(i2);
        JLabel label_1 = new JLabel(imageIcon11);
        label_1.setBounds(650,300,200,195);
        add(label_1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/Reception.png"));
        Image i3 = i111.getImage().getScaledInstance(160,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111= new ImageIcon(i3);
        JLabel label_2 = new JLabel(imageIcon111);
        label_2.setBounds(295,300,200,195);
        add(label_2);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1050,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1= new ImageIcon(i1);
        JLabel label= new JLabel(imageIcon1);
        label.setBounds(0,0,1050,1090);
        add(label);

        setLayout(null);
        setSize(1050,1090);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == rec)
        {

        }
    }

    public static void main(String[] args) {
        new Dashboard();
    }


}
