
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerUI {
    public JFrame view;

//    public JButton btnManageCustomer = new JButton("Manage Customers");
    public JButton btnManageProduct = new JButton("Manage Products");
    public JButton btnSalesSummary = new JButton("Sales Summary");
    public JButton btnManageProfile = new JButton("Update Profile");

    public ManagerUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System - Manager View");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProduct);
       // panelButtons.add(btnManageCustomer);
        panelButtons.add(btnSalesSummary);
        panelButtons.add(btnManageProfile);

        view.getContentPane().add(panelButtons);


        btnManageProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageProductUI ui = new ManageProductUI();
                ui.run();
            }
        });

       // btnManageCustomer.addActionListener(new ActionListener() {
         //   @Override
           // public void actionPerformed(ActionEvent actionEvent) {
             //   ManageCustomerUI ui = new ManageCustomerUI();
               // ui.run();
            //}
        //});

        btnSalesSummary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UserModel u = new UserModel();
                SalesSummaryUI ss = new SalesSummaryUI(u);
                ss.run();
            }
        });

    }
}
