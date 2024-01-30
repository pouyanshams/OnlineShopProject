package View.Customer;

import Model.Person.Customer;
import Model.Person.ShoppingList;
import Model.Product.Product;
import View.MainMenu.LoginMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;

public class PurchaseFrame implements ActionListener {
    String tempItem;
    JFrame purchaseFrame = new JFrame();
    JButton CustomerMenu = new JButton("Customer Menu");
    JButton PurchaseButton = new JButton("Purchase");
    JTextField producttxt = new JTextField();

    public PurchaseFrame()
    {
        purchaseFrame.setSize(420, 420);
        purchaseFrame.setLayout(new FlowLayout());
        CustomerMenu.addActionListener(this);
        PurchaseButton.addActionListener(this);

        producttxt.setPreferredSize(new Dimension(100,20));

        //show frame
        purchaseFrame.add(producttxt);
        purchaseFrame.add(CustomerMenu);
        purchaseFrame.add(PurchaseButton);
        purchaseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        purchaseFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== CustomerMenu)
        {
            purchaseFrame.dispose();
            new CustomerMenu();
        }
        else if (e.getSource() == PurchaseButton)
        {
            if (Product.isThereAnyProduct(producttxt.getText()))
            {
                if (Product.productExist(producttxt.getText())) {

                if (Customer.haveEnoughMoney(LoginMenu.currentUsername,Product.getPrice(producttxt.getText())))
                {
                    Product.decreaseInventory(producttxt.getText());
                    Customer.DrawMoney(LoginMenu.currentUsername,Product.getPrice(producttxt.getText()));
                    System.out.println("Purchase Done Successfully");
                    ShoppingList.add(Customer.customerNumber(LoginMenu.currentUsername),producttxt.getText());


                }
                else
                {
                    System.out.println("Sorry You Don't Have Enough Money To Buy This Product");
                }
                }
                else {System.out.println("Sorry Out Of Inventory");
                }

            }

            else {
                System.out.println("We Don't Have A Product With This Name Please Check The Store");
            }
        }

      }
}