package View.MainMenu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu implements ActionListener {
    JFrame frame = new JFrame();
    JButton login = new JButton("login");
    JButton signup = new JButton("signup");
    JButton exit = new JButton("exit");

    JButton loginAsManager = new JButton("login as Manager");


    public MainMenu (){
        frame.setSize(420, 420);
        frame.setLayout(null);

        exit.setBounds(100, 280, 200,40 );
        exit.setVisible(true);
        exit.addActionListener(this);
        login.setBounds(100, 120, 200,40 );
        login.setVisible(true);
        login.addActionListener(this);
        signup.setBounds(100, 40, 200,40 );
        signup.setVisible(true);
        signup.addActionListener(this);
        loginAsManager.setBounds(100, 200, 200,40 );
        loginAsManager.setVisible(true);
        loginAsManager.addActionListener(this);
        //show frame
        frame.add(login);
        frame.add(signup);
        frame.add(exit);
        frame.add(loginAsManager);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            new LoginMenu();
            frame.dispose();
        } else if (e.getSource() == signup) {
            new SignupMenu();
            frame.dispose();
        }
        else if (e.getSource() == exit) {
            frame.dispose();
        }
        else if (e.getSource() == loginAsManager) {
            frame.dispose();
            new ManagerLoginFrame();
        }
    }
}
