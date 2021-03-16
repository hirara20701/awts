import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Submit implements ActionListener {

    JFrame submission = new JFrame();
    JButton okay = new JButton();
    JLabel submitted = new JLabel();

    Submit() {

        submitted.setText("Amount Submitted! Thank you!");
        submitted.setBounds(55, 20, 300, 20);

        okay.setText("OKAY");
        okay.setBounds(110, 51, 80, 20);
        okay.setFocusable(false);
        okay.addActionListener(this);

        submission.add(submitted);
        submission.add(okay);
        submission.setTitle("Hakdog draft quack quack");
        submission.setResizable(false);
        submission.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        submission.setSize(300, 120);
        submission.setLayout(null);
        submission.setVisible(true);
        submission.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == okay){
            submission.dispose();
            TenantPage tenantPage = new TenantPage();
        }
    }
}
