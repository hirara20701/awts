import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBill implements ActionListener {

    JFrame bills = new JFrame();
    JLabel welcomemessage = new JLabel();
    JLabel recipientID = new JLabel();
    JLabel dateIssued = new JLabel();
    JLabel Totalamount = new JLabel();
    JButton back = new JButton();

    CheckBill() {
        //welcome message from the window.
        welcomemessage.setText("Hello! This is the bill for the corresponding tenant: ");
        welcomemessage.setBounds(10, 20, 1000, 20);

        //recipient ID.
        recipientID.setText("Recipient ID: ");
        recipientID.setBounds(10, 60, 1000, 20);

        //Date Issued.
        dateIssued.setText("Date Issued: ");
        dateIssued.setBounds(10, 100, 1000, 20);

        //Total Amount.
        Totalamount.setText("Total Amount: ");
        Totalamount.setBounds(10, 140, 1000, 20);

        //Back button
        back.setText("Back");
        back.setBounds(300, 335, 80, 20);
        back.setFocusable(false);
        back.addActionListener(this);

        bills.add(welcomemessage);
        bills.add(recipientID);
        bills.add(dateIssued);
        bills.add(Totalamount);
        bills.add(back);

        bills.setTitle("hakdogdog quack quack draft");
        bills.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bills.setSize(400, 400);
        bills.setLayout(null);
        bills.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            bills.dispose();
            TenantPage tenantPage = new TenantPage();
        }
    }

}
