package View.MainMenu;

import Model.Person.Customer;
import View.Customer.CustomerMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class LoginMenu implements ActionListener {
    public static String currentUsername;
    public static String currentPassword;

    JFrame loginFrame = new JFrame();
    JButton loginButton = new JButton("Log in");
    JButton MainMenu = new JButton("MainMenu");

    JTextField passwordTxt = new JTextField();
    JTextField usernameTxt = new JTextField();

    public LoginMenu()
    {
        loginFrame.setSize(420, 420);
        loginFrame.setLayout(new FlowLayout());
        loginButton.addActionListener(this);
        MainMenu.addActionListener(this);


        usernameTxt.setPreferredSize(new Dimension(100,20));
        passwordTxt.setPreferredSize(new Dimension(100,20));
        //show frame
        loginFrame.add(usernameTxt);
        loginFrame.add(passwordTxt);
        loginFrame.add(loginButton);
        loginFrame.add(MainMenu);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loginButton)
        {
            if (Customer.isThereAnyCustomer(usernameTxt.getText(), passwordTxt.getText())) {
                new CustomerMenu();
                currentUsername = usernameTxt.getText();
                currentPassword = passwordTxt.getText();
                loginFrame.dispose();
            } else  {
                System.out.println("wrong Username or password");
            }

        } else if (e.getSource() == MainMenu) {
            new MainMenu();
            loginFrame.dispose();
        }
    }
}



