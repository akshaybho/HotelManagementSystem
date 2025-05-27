package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {

    Reception()
    {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(250,5,800,820);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBounds(5,5,240,820);
        panel_1.setBackground(new Color(3,45,48));
        add(panel_1);

        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icon/cccc.gif"));
        Image i3 = i111.getImage().getScaledInstance(600,800, Image.SCALE_DEFAULT);
        ImageIcon imageIcon111= new ImageIcon(i3);
        JLabel label_2 = new JLabel(imageIcon111);
        label_2.setBounds(100,20,600,800);
        panel.add(label_2);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i5 = i4.getImage().getScaledInstance(250,200, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i5);
        JLabel label_3 = new JLabel(imageIcon2);
        label_3.setBounds(5,480,250,200);
        panel_1.add(label_3);

        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,180,30);
        btnNCF.setBackground(Color.BLACK);
        btnNCF.setForeground(Color.WHITE);
        panel_1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try
                {

                }
                catch(Exception f)
                {
                    f.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,180,30);
        btnRoom.setBackground(Color.BLACK);
        btnRoom.setForeground(Color.WHITE);
        panel_1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,180,30);
        btnDepartment.setBackground(Color.BLACK);
        btnDepartment.setForeground(Color.WHITE);
        panel_1.add(btnDepartment);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,180,30);
        btnAEI.setBackground(Color.BLACK);
        btnAEI.setForeground(Color.WHITE);
        panel_1.add(btnAEI);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,180,30);
        btnCI.setBackground(Color.BLACK);
        btnCI.setForeground(Color.WHITE);
        panel_1.add(btnCI);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,180,30);
        btnMI.setBackground(Color.BLACK);
        btnMI.setForeground(Color.WHITE);
        panel_1.add(btnMI);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,180,30);
        btnCO.setBackground(Color.BLACK);
        btnCO.setForeground(Color.WHITE);
        panel_1.add(btnCO);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30,310,180,30);
        btnUC.setBackground(Color.BLACK);
        btnUC.setForeground(Color.WHITE);
        panel_1.add(btnUC);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,180,30);
        btnURS.setBackground(Color.BLACK);
        btnURS.setForeground(Color.WHITE);
        panel_1.add(btnURS);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnPUS = new JButton("Pickup Service");
        btnPUS.setBounds(30,390,180,30);
        btnPUS.setBackground(Color.BLACK);
        btnPUS.setForeground(Color.WHITE);
        panel_1.add(btnPUS);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,180,30);
        btnSR.setBackground(Color.BLACK);
        btnSR.setForeground(Color.WHITE);
        panel_1.add(btnSR);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });




        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1050,1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }
}
