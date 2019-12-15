import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Calendar;

public class ManageProfileUI {
    public JFrame view;

    public JButton btnSave = new JButton("Update");
    public JButton btnCancel = new JButton("Cancel");

    public JLabel username = new JLabel();
    public JTextField txtPassword = new JTextField(20);
    public JTextField txtName = new JTextField(20);
    //public JTextField txtUserType = new JTextField(20);
    public JLabel userType = new JLabel();
    public JLabel userID = new JLabel();
    ProductModel product;
    PurchaseModel purchase;
    CustomerModel customer;
    UserModel user;

    public ManageProfileUI(UserModel u) {
        this.view = new JFrame();
        user = u;
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        view.setTitle("Edit Profile for Username: " + user.mUsername);
        view.setSize(600, 400);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnSave);
        view.getContentPane().add(panelButtons);

        JPanel line1 = new JPanel(new FlowLayout());
        line1.add(new JLabel("Username "));
        username.setText(user.mUsername);
        line1.add(username);
        view.getContentPane().add(line1);

        JPanel line2 = new JPanel(new FlowLayout());
        line2.add(new JLabel("Password "));
        txtPassword.setText(user.mPassword);
        line2.add(txtPassword);
        view.getContentPane().add(line2);

        JPanel line3 = new JPanel(new FlowLayout());
        line3.add(new JLabel("Full Name "));
        txtName.setText(user.mFullname);
        line3.add(txtName);
        view.getContentPane().add(line3);

        JPanel line4 = new JPanel(new FlowLayout());
        line4.add(new JLabel("User Type "));
        userType.setText("Manager");

        line4.add(userType);
        view.getContentPane().add(line4);

        JPanel line5 = new JPanel(new FlowLayout());
        line5.add(new JLabel("UserID "));
        userID.setText(Integer.toString(2));
        line5.add(userID);
        view.getContentPane().add(line5);

        btnSave.addActionListener(new SaveButtonListener());
    }

        public void run() {

        view.setVisible(true);
    }

    private class ProductIDFocusListener implements FocusListener {
        @Override
        public void focusGained(FocusEvent focusEvent) {

        }

        @Override
        public void focusLost(FocusEvent focusEvent) {
            process();
        }

        private void process() {
            String s = "test";

            if (s.length() == 0) {
               // labProductName.setText("Product Name: [not specified!]");
                return;
            }

            System.out.println("ProductID = " + s);

            try {
                purchase.mProductID = Integer.parseInt(s);

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,
                        "Error: Invalid ProductID", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            product = StoreManager.getInstance().getDataAdapter().loadProduct(purchase.mProductID);

            if (product == null) {
                JOptionPane.showMessageDialog(null,
                        "Error: No product with id = " + purchase.mProductID + " in store!", "Error Message",
                        JOptionPane.ERROR_MESSAGE);
             //   labProductName.setText("Product Name: ");

                return;
            }

            //labProductName.setText("Product Name: " + product.mName);
            purchase.mPrice = product.mPrice;
            //labPrice.setText("Product Price: " + product.mPrice);

        }

    }


    class SaveButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            String id = "t";

            if (id.length() == 0) {
                JOptionPane.showMessageDialog(null, "PurchaseID cannot be null!");
                return;
            }

            try {
                purchase.mPurchaseID = Integer.parseInt(id);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Full name updated to: ");
                return;
            }

            int res = StoreManager.getInstance().getDataAdapter().savePurchase(purchase);
            if (res == SQLiteDataAdapter.PURCHASE_SAVED_FAILED)
                JOptionPane.showMessageDialog(null, "NOT Updated successfully! ");
            else
                JOptionPane.showMessageDialog(null, "User Updated successfully!" );
        }
    }
}
