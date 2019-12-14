import javax.swing.*;
import java.awt.*;

public class SalesSummaryUI {
    public JFrame view;

    public SalesSummaryUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        view.setTitle("Sales Summary");
        view.setSize(600, 400);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));


    }

    public void run() {
        view.setVisible(true);
    }
}
