
package View.Customer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellFrame implements ActionListener {
    String tempItem;
    JFrame sellFrame = new JFrame();
    JButton CustomerMenu = new JButton("Customer Menu");
    JButton sellButton = new JButton("Sell");
    JTextField producttxt = new JTextField();

    public SellFrame()
    {
        sellFrame.setSize(420, 420);
        sellFrame.setLayout(new FlowLayout());
        CustomerMenu.addActionListener(this);

        producttxt.setPreferredSize(new Dimension(100,20));

        //show frame
        sellFrame.add(producttxt);
        sellFrame.add(CustomerMenu);
        sellFrame.add(sellButton);
        sellFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sellFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== CustomerMenu)
        {
            sellFrame.dispose();
            new CustomerMenu();
        }
//        else if (e.getSource() == sellButton)
//        {
//            if (Product.isThereAnyProduct(producttxt.getText()))
//            {
//                System.out.println("in kala mojode");
//            }
//
//            else {
//                System.out.println("hamchin kalayi nadarim");
//            }
//        }

    }
}