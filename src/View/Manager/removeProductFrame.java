package View.Manager;

import Model.Product.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class removeProductFrame implements ActionListener {
    JFrame removeProductFrame = new JFrame();
    JButton managerMenu = new JButton("Manager Menu");
    JButton removeProductButton = new JButton("Remove Product");
    JTextField productName = new JTextField();

    public removeProductFrame() {
        removeProductFrame.setSize(420, 420);
        removeProductFrame.setLayout(new FlowLayout());
        managerMenu.addActionListener(this);
        removeProductButton.addActionListener(this);

        productName.setPreferredSize(new Dimension(100, 20));


        //show frame
        removeProductFrame.add(productName);
        removeProductFrame.add(managerMenu);
        removeProductFrame.add(removeProductButton);
        removeProductFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        removeProductFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == managerMenu) {
            removeProductFrame.dispose();
            new ManagerMenu();
        }
        else if (e.getSource() == removeProductButton)
        {
            if (Product.isThereAnyProduct(productName.getText())) {
                Product.removeProduct(productName.getText());
                System.out.println("The Item Has Been Removed");
            }
            else {

                System.out.println("There Is No Product With That Name");
            }

        }
            removeProductFrame.dispose();
            new ManagerMenu();

    }
}

