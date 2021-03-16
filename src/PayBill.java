import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayBill implements ActionListener {

    JFrame bills = new JFrame();
    JLabel welcomemessage = new JLabel();
    JButton submit = new JButton();
    JLabel recipientID = new JLabel();
    JLabel dateIssued = new JLabel();
    JLabel Totalamount = new JLabel();
    JLabel totalpaid = new JLabel();
    JTextField enteramount = new JTextField();

    PayBill() {

        //welcome message from the window.
        welcomemessage.setText("To pay your bills, please indicate what is required.");
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


        //Total Paid Amount.
        totalpaid.setText("Amount: ");
        totalpaid.setBounds(10, 180, 55, 20);
        enteramount.setPreferredSize(new Dimension(20, 30));
        enteramount.setBounds(60, 180, 45, 20);

        //Submit button
        submit.setText("Submit");
        submit.setBounds(300, 335, 80, 20);
        submit.setFocusable(false);
        submit.addActionListener(this);

        bills.add(welcomemessage);
        bills.add(submit);
        bills.add(enteramount);
        bills.add(recipientID);
        bills.add(dateIssued);
        bills.add(Totalamount);
        bills.add(totalpaid);

        //Frame Size.
        bills.setResizable(false);
        bills.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bills.setLayout(null);
        bills.setLocationRelativeTo(null);
        bills.setSize(400, 400);
        bills.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            bills.dispose();
            Submit moneysubmit = new Submit();
        }
    }
}
