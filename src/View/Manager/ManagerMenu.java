package View.Manager;

import Model.Person.Customer;
import Model.Product.Product;
import View.MainMenu.LoginMenu;
import View.MainMenu.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerMenu implements ActionListener {

    JFrame frame = new JFrame();
    JButton addProduct = new JButton("add product");

    JButton removeProduct = new JButton("remove product");

    JButton store = new JButton("Store");

    JButton inventory = new JButton("Inventory");


    JButton MainMenu = new JButton("Main Menu");


    public ManagerMenu (){
        frame.setSize(420, 420);
        frame.setLayout(null);

        addProduct.setBounds(100, 40, 200,40 );
        addProduct.setVisible(true);
        addProduct.addActionListener(this);

        removeProduct.setBounds(100, 100, 200,40 );
        removeProduct.setVisible(true);
        removeProduct.addActionListener(this);

        store.setBounds(100, 160, 200,40 );
        store.setVisible(true);
        store.addActionListener(this);


        inventory.setBounds(100, 220, 200,40 );
        inventory.setVisible(true);
        inventory.addActionListener(this);

        MainMenu.setBounds(100, 280, 200,40 );
        MainMenu.setVisible(true);
        MainMenu.addActionListener(this);


        //show frame

        frame.add(store);
        frame.add(removeProduct);
        frame.add(addProduct);
        frame.add(inventory);
        frame.add(MainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addProduct) {
            new addProductFrame();
            frame.dispose();
        }
        else if (e.getSource() == removeProduct) {
            new removeProductFrame();
            frame.dispose();

        }
        else if (e.getSource() == store) {
            Product.showProducts();

        }
        else if (e.getSource() == inventory) {
            new InventoryFrame();
            frame.dispose();

        }
        else if (e.getSource() == MainMenu) {
            new MainMenu();
            frame.dispose();
        }
    }
}