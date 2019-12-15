import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminUI {
    public JFrame view;

    public JButton btnSysConfig = new JButton("System Configuration");
    public JButton btnAddUser = new JButton("Add New User");
    public JButton btnManageUser = new JButton("Update User");
    public JButton btnManageProfile = new JButton("Manage Profile");

    public AdminUI(UserModel user) {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Admin View");
        view.setSize(400, 300);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelUser = new JPanel(new FlowLayout());
        panelUser.add(new JLabel("Fullname: " + user.mFullname));
        panelUser.add(new JLabel("CustomerID: " + user.mCustomerID));

        view.getContentPane().add(panelUser);


        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSysConfig);
        panelButtons.add(btnAddUser);
        panelButtons.add(btnManageUser);
        panelButtons.add(btnManageProfile);


        view.getContentPane().add(panelButtons);


        btnSysConfig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SysConfigUI sc = new SysConfigUI();
               // sc.run();
            }
        });

        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddUserUI AU = new AddUserUI();
                AU.run();
            }
        });

        btnManageUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               ManageUserUI mu = new ManageUserUI();
                mu.run();
            }
        });

        btnManageProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserModel u = new UserModel();
                ManageProfileUI mp = new ManageProfileUI(u);
                mp.view.setVisible(true);
            }
        } );
    }
}