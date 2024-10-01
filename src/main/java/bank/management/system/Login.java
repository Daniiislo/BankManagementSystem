package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {

    JLabel label1, label2, label3;
    JTextField textField;
    JPasswordField passwordField;
    JButton signInButton, signUpButton, clearButton;

    Login() {
        super("Bank Management System");

        //add bank icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        //add card icon
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        //add label "Welcome to ATM"
        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        add(label1);

        //add label "Card No:"
        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        //add Text Field for Card No:
        textField = new JTextField(15);
        textField.setBounds(300, 190, 230, 30);
        textField.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField);

        //add label "PIN:"
        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        //add Password Field for Pin:
        passwordField = new JPasswordField(15);
        passwordField.setBounds(300, 250, 230, 30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);

        //sign in button
        signInButton = new JButton("SIGN IN");
        signInButton.setFont(new Font("Arial", Font.BOLD, 14));
        signInButton.setForeground(Color.WHITE);
        signInButton.setBackground(Color.BLACK);
        signInButton.setBounds(300, 300, 100, 30);
        signInButton.addActionListener(this);
        add(signInButton);

        //sign up button
        signUpButton = new JButton("SIGN UP");
        signUpButton.setFont(new Font("Arial", Font.BOLD, 14));
        signUpButton.setForeground(Color.WHITE);
        signUpButton.setBackground(Color.BLACK);
        signUpButton.setBounds(300, 350, 230, 30);
        signUpButton.addActionListener(this);
        add(signUpButton);


        //clear button
        clearButton = new JButton("CLEAR");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        clearButton.setBounds(430, 300, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        //add background
        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource() == signInButton) {

            }
            else if (e.getSource() == signUpButton) {

            }
            else if (e.getSource() == clearButton) {
                //clear text box
                textField.setText("");
                passwordField.setText((""));
            }

        }
        catch (Exception E) {
            E.printStackTrace();
        }      
    }
	public static void main(String[] args) {
        new Login();
    }
}
