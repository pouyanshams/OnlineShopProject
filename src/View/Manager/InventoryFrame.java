package View.Manager;

import Model.Product.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InventoryFrame implements ActionListener {

    JFrame purchaseFrame = new JFrame();
    JButton managerMenu = new JButton("Manager Menu");
    JButton increaseProduct = new JButton("Increase");
    JButton decreaseProduct = new JButton("Decrease");

    JTextField productName = new JTextField();

    public InventoryFrame() {
        purchaseFrame.setSize(420, 420);
        purchaseFrame.setLayout(new FlowLayout());
        managerMenu.addActionListener(this);
        increaseProduct.addActionListener(this);
        decreaseProduct.addActionListener(this);

        productName.setPreferredSize(new Dimension(100, 20));

        //show frame
        purchaseFrame.add(productName);
        purchaseFrame.add(managerMenu);
        purchaseFrame.add(increaseProduct);
        purchaseFrame.add(decreaseProduct);
        purchaseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        purchaseFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerMenu) {
            purchaseFrame.dispose();
            new ManagerMenu();
        } else if (e.getSource() == increaseProduct) {
            if (Product.isThereAnyProduct(productName.getText())) {
                Product.increaseInventory(productName.getText());

            } else {
                System.out.println("There is no product with that name");
            }
        }
        else if (e.getSource() == decreaseProduct) {
            if (Product.isThereAnyProduct(productName.getText())) {
                Product.decreaseInventory(productName.getText());

            } else {
                System.out.println("There is no product with that name");
            }
        }
    }
}
