import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CashierUI {
    public JFrame view;

    public JButton btnAddPurchase = new JButton("Add New Purchase");
    public JButton btnManageCustomer = new JButton("Manage Customers");
    public JButton btnUpdatePurchase = new JButton("Update Purchase");
    public JButton btnManageProfile = new JButton("Manage Profile");

    public CashierUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Cashier View");
        view.setSize(400, 300);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnAddPurchase);
        panelButtons.add(btnManageCustomer);
        panelButtons.add(btnUpdatePurchase);
        panelButtons.add(btnManageProfile);


        view.getContentPane().add(panelButtons);


        btnAddPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddPurchaseUI ap = new AddPurchaseUI();
                ap.run();
            }
        });

        btnManageCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageCustomerUI mc = new ManageCustomerUI();
                mc.run();
            }
        });

        btnUpdatePurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UpdatePurchaseUI up = new UpdatePurchaseUI();
                up.run();
            }
        });

        btnManageProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               ManageProfileUI mp = new ManageProfileUI();
                mp.run();
            }
        });

    }
}