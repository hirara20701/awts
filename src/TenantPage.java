import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TenantPage implements ActionListener{

    JFrame TenantPage;
    JButton CheckBill = new JButton("CheckBills");
    JButton PayBill = new JButton("PayBills");
    JButton Exit = new JButton("Exit");
    JLabel welcomemessage = new JLabel();
    JLabel ID = new JLabel();
    JLabel Date = new JLabel();
    JLabel TA = new JLabel();
    JLabel AP = new JLabel();
    JLabel STATUS = new JLabel();
    JPanel picturepanel = new JPanel();

    TenantPage() {

        TenantPage = new JFrame();

        welcomemessage.setBounds(55,15,200,20);
        welcomemessage.setText("BILLS ");

        //Setting for profile.
        ImageIcon profile = new ImageIcon("logo.png");
        TenantPage.setIconImage(profile.getImage());
        picturepanel.setLayout(null);
        picturepanel.setBounds(0,0,160,600);
        picturepanel.setBackground(Color.lightGray);


        //Exit button
        Exit.setBounds(555,130,55,20);
        Exit.setFocusable(false);
        Exit.addActionListener(this);

        //Add things.
        TenantPage.add(picturepanel);
        TenantPage.add(welcomemessage);
        TenantPage.add(CheckBill);
        TenantPage.add(PayBill);
        TenantPage.add(Exit);

        //Frame settings.
        TenantPage.setTitle("Hakdog draft quack quack");
        TenantPage.setResizable(false);
        TenantPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TenantPage.setSize(800, 600);
        TenantPage.setLayout(null);
        TenantPage.setVisible(true);

        TenantPage.setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CheckBill) {
            TenantPage.dispose();
            CheckBill myWindow = new CheckBill();
        }
        else if(e.getSource() == PayBill){
            TenantPage.dispose();
            PayBill payBill = new PayBill();
        }
        else if(e.getSource() == Exit){
            System.exit(1);
        }
    }
}
