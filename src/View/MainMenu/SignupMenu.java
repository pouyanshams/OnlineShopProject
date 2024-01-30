package View.MainMenu;

import Model.Person.Customer;
import View.MainMenu.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupMenu implements ActionListener {

    String tempuser;
    String temppass;

    JFrame signupFrame = new JFrame();
    JButton signupButton = new JButton("sign up");
    JButton MainMenu = new JButton("MainMenu");
    JTextField usernameTxt = new JTextField();

    JTextField passwordTxt = new JTextField();

    public SignupMenu()
    {
        signupFrame.setSize(420, 420);
        signupFrame.setLayout(new FlowLayout());
        signupButton.addActionListener(this);
        MainMenu.addActionListener(this);


        usernameTxt.setPreferredSize(new Dimension(100,20));
        passwordTxt.setPreferredSize(new Dimension(100,20));

        //show frame
        signupFrame.add(usernameTxt);
        signupFrame.add(passwordTxt);
        signupFrame.add(signupButton);
        signupFrame.add(MainMenu);
        signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==signupButton)
        {
            if (Customer.isThereAnyCustomerUsername(usernameTxt.getText())) {
                System.out.println("this username has been taken");
            } else  {
                Customer customer  = new Customer(usernameTxt.getText(), passwordTxt.getText());
                signupFrame.dispose();
                new MainMenu();
            }

        } else if (e.getSource() == MainMenu) {
            new MainMenu();
            signupFrame.dispose();
        }
    }
}
