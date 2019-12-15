import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;


public class SalesSummaryUI {
    public JFrame view;
    public JTextField txtSalesSummary = new JTextField(20);
    public JTable purchaseTable;

    public UserModel user = null;

    public SalesSummaryUI(UserModel user) {
        this.view = new JFrame();
        this.user = user;
        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        view.setTitle("Sales Summary");
        view.setSize(600, 400);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

     //   public JTable purchaseTable;

       // public UserModel user = null;

//    public JButton btnLoad = new JButton("Load Customer");
//    public JButton btnSave = new JButton("Save Customer");
//
//    public JTextField txtCustomerID = new JTextField(20);
//    public JTextField txtName = new JTextField(20);
//    public JTextField txtPhone = new JTextField(20);
//    public JTextField txtAddress = new JTextField(20);


            this.view = new JFrame();

            view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

            view.setTitle("View Purchase History - Manager View");
            view.setSize(600, 400);
            view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

           // JLabel title = new JLabel("Purchase history for " + user.mFullname);

            //title.setFont (title.getFont().deriveFont (24.0f));
            //title.setHorizontalAlignment(SwingConstants.CENTER);
            //view.getContentPane().add(title);


       /** ArrayList<PurchaseModel> list = StoreManager.getInstance().getDataAdapter().loadPurchaseHistory();
           // PurchaseListModel list = StoreManager.getInstance().getDataAdapter().loadPurchaseHistory(123);
//        DefaultListModel<String> data = new DefaultListModel<>();
            DefaultTableModel tableData = new DefaultTableModel();
//        String[] columnNames = {"PurchaseID", "ProductID", "Total"};
//        data.addElement(String.format("PurchaseId: %d, ProductId: %d, Total: %8.2f",
//                purchase.mPurchaseID,
//                purchase.mProductID,
//                purchase.mTotal));

            tableData.addColumn("PurchaseID");
            tableData.addColumn("ProductID");
            tableData.addColumn("Product Name");
            tableData.addColumn("Total");

            for (PurchaseModel purchase : list) {
                Object[] row = new Object[tableData.getColumnCount()];
                row[0] = purchase.mPurchaseID;
                row[1] = purchase.mProductID;
                ProductModel product = StoreManager.getInstance().getDataAdapter().loadProduct(purchase.mProductID);
                row[2] = product.mName;
                row[3] = purchase.mTotal;
                tableData.addRow(row);
            }

//        purchases = new JList(data);

            purchaseTable = new JTable(tableData);

            JScrollPane scrollableList = new JScrollPane(purchaseTable);

            view.getContentPane().add(scrollableList);**/


        }




    public void run() {
        view.setVisible(true);
        ArrayList<PurchaseModel> list = StoreManager.getInstance().getDataAdapter().loadPurchaseHistory();
        // PurchaseListModel list = StoreManager.getInstance().getDataAdapter().loadPurchaseHistory(123);
//        DefaultListModel<String> data = new DefaultListModel<>();
        DefaultTableModel tableData = new DefaultTableModel();
//        String[] columnNames = {"PurchaseID", "ProductID", "Total"};
//        data.addElement(String.format("PurchaseId: %d, ProductId: %d, Total: %8.2f",
//                purchase.mPurchaseID,
//                purchase.mProductID,
//                purchase.mTotal));

        tableData.addColumn("PurchaseID");
        tableData.addColumn("ProductID");
        tableData.addColumn("Product Name");
        tableData.addColumn("Total");

        for (PurchaseModel purchase : list) {
            Object[] row = new Object[tableData.getColumnCount()];
            row[0] = purchase.mPurchaseID;
            row[1] = purchase.mProductID;
            ProductModel product = StoreManager.getInstance().getDataAdapter().loadProduct(purchase.mProductID);
            row[2] = product.mName;
            row[3] = purchase.mTotal;
            tableData.addRow(row);
        }

//        purchases = new JList(data);

        purchaseTable = new JTable(tableData);

        JScrollPane scrollableList = new JScrollPane(purchaseTable);

        view.getContentPane().add(scrollableList);


    }




    //FillTable(MyTable, "select * Customers;");


    public void SummaryBuilder(){
        //txtSalesSummary.setText();

    }


}
