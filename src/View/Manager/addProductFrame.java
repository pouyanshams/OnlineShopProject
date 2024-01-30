package View.Manager;

import Model.Person.Customer;
import Model.Person.ShoppingList;
import Model.Product.Product;
import View.MainMenu.LoginMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addProductFrame implements ActionListener {
    JFrame purchaseFrame = new JFrame();
    JButton managerMenu = new JButton("Manager Menu");
    JButton addProductButton = new JButton("Add Product");
    JTextField productName = new JTextField();
    JTextField productPrice = new JTextField();
    JTextField productDescription = new JTextField();

    public addProductFrame() {
        purchaseFrame.setSize(420, 420);
        purchaseFrame.setLayout(new FlowLayout());
        managerMenu.addActionListener(this);
        addProductButton.addActionListener(this);

        productName.setPreferredSize(new Dimension(100, 20));
        productPrice.setPreferredSize(new Dimension(100, 20));
        productDescription.setPreferredSize(new Dimension(100, 20));

        //show frame
        purchaseFrame.add(productName);
        purchaseFrame.add(productPrice);
        purchaseFrame.add(productDescription);
        purchaseFrame.add(managerMenu);
        purchaseFrame.add(addProductButton);
        purchaseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        purchaseFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerMenu) {
            purchaseFrame.dispose();
            new ManagerMenu();
        } else if (e.getSource() == addProductButton) {
            if (Product.isThereAnyProduct(productName.getText())) {
                System.out.println("This Product Is Currently Available");
            } else {
                System.out.println();
                Product product = new Product(productName.getText(), Double.parseDouble(productPrice.getText()), productDescription.getText());
                System.out.println("The Product Has Been Added To The Store");
            }
        }

    }
}

