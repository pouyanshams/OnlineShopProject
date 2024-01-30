package View.Manager;

import Model.Product.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class removeProductFrame implements ActionListener {
    JFrame purchaseFrame = new JFrame();
    JButton managerMenu = new JButton("Manager Menu");
    JButton removeProductButton = new JButton("Remove Product");
    JTextField productName = new JTextField();

    public removeProductFrame() {
        purchaseFrame.setSize(420, 420);
        purchaseFrame.setLayout(new FlowLayout());
        managerMenu.addActionListener(this);
        removeProductButton.addActionListener(this);

        productName.setPreferredSize(new Dimension(100, 20));


        //show frame
        purchaseFrame.add(productName);
        purchaseFrame.add(managerMenu);
        purchaseFrame.add(removeProductButton);
        purchaseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        purchaseFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerMenu) {
            purchaseFrame.dispose();
            new ManagerMenu();
        }
        else if (e.getSource() == removeProductButton)
        {
            if (Product.isThereAnyProduct(productName.getText())) {
                Product.removeProduct(productName.getText());
            } else {

                System.out.println("hamchin kalayi vojod nadarad");
            }
        }

    }
}

