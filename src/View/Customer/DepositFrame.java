package View.Customer;

import Model.Person.Customer;
import Model.Product.Product;
import View.MainMenu.LoginMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DepositFrame implements ActionListener {
    String tempItem;
    JFrame dipositFrame = new JFrame();
    JButton CustomerMenu = new JButton("Customer Menu");
    JButton DoneButton = new JButton("Done");
    JTextField money = new JTextField();

    public DepositFrame()
    {
        dipositFrame.setSize(420, 420);
        dipositFrame.setLayout(new FlowLayout());
        CustomerMenu.addActionListener(this);
        DoneButton.addActionListener(this);

        money.setPreferredSize(new Dimension(100,20));

        //show frame
        dipositFrame.add(money);
        dipositFrame.add(CustomerMenu);
        dipositFrame.add(DoneButton);
        dipositFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dipositFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== CustomerMenu)
        {
            dipositFrame.dispose();
            new CustomerMenu();
        }
        else if (e.getSource() == DoneButton)
        {
            Customer.Depositmoney(LoginMenu.currentUsername,Double.parseDouble(money.getText()));
        }

    }
}