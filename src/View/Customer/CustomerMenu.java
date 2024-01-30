package View.Customer;

import Model.Person.Customer;
import Model.Product.Product;
import View.MainMenu.LoginMenu;
import View.MainMenu.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerMenu implements ActionListener {

    JFrame frame = new JFrame();
    JButton purchase = new JButton("Purchase");

    JButton sell = new JButton("Sell");

    JButton store = new JButton("Store");

    JButton deposit = new JButton("Deposit");

    JButton customerInfo = new JButton("CustomerInfo");

    JButton MainMenu = new JButton("Main Menu");


    public CustomerMenu (){
        frame.setSize(420, 420);
        frame.setLayout(null);

        purchase.setBounds(100, 10, 200,40 );
        purchase.setVisible(true);
        purchase.addActionListener(this);

        sell.setBounds(100, 70, 200,40 );
        sell.setVisible(true);
        sell.addActionListener(this);

        store.setBounds(100, 130, 200,40 );
        store.setVisible(true);
        store.addActionListener(this);




        deposit.setBounds(100, 190, 200,40 );
        deposit.setVisible(true);
        deposit.addActionListener(this);
        customerInfo.setBounds(100, 250, 200,40 );
        customerInfo.setVisible(true);
        customerInfo.addActionListener(this);

        MainMenu.setBounds(100, 310, 200,40 );
        MainMenu.setVisible(true);
        MainMenu.addActionListener(this);


        //show frame

        frame.add(store);
        frame.add(sell);
        frame.add(purchase);
        frame.add(deposit);
        frame.add(customerInfo);
        frame.add(MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == purchase) {
            new PurchaseFrame();
            frame.dispose();
        }
        else if (e.getSource() == sell) {
            new SellFrame();
            frame.dispose();

        }
        else if (e.getSource() == store) {
            Product.showProducts();

        }
        else if (e.getSource() == deposit) {
            new DepositFrame();
            frame.dispose();

        }
        else if (e.getSource() == customerInfo) {
            Customer.customerInfo(LoginMenu.currentUsername);

        }
        else if (e.getSource() == MainMenu) {
            new MainMenu();
            frame.dispose();
        }
    }
}
