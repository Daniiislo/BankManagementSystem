package bank.management.system;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class Signup extends JFrame implements  ActionListener {

    JRadioButton r1, r2, m1, m2, m3;

    JButton nextButton;

    JTextField textName, textFName, textEmail, textCity, textPin, textState, textAdd;

    JDateChooser dateChooser;

    Random random = new Random();
    
    long first4 = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");
        setSize(850, 800);

        //add bank icon
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        //Title
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        label1.setBounds(getSize().width / 2 - label1.getPreferredSize().width / 2, 20, label1.getPreferredSize().width,
                label1.getPreferredSize().height);
        add(label1);

        //page1
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(getSize().width / 2 - label2.getPreferredSize().width / 2, 70, label2.getPreferredSize().width,
                label2.getPreferredSize().height);
        add(label2);

        //Personal Details
        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(getSize().width / 2 - label3.getPreferredSize().width / 2, 90, label3.getPreferredSize().width,
                label3.getPreferredSize().height);
        add(label3);

        //Name
        JLabel labelName = new JLabel("Name:");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        //Father's Name
        JLabel labelFName = new JLabel("Father's Name:");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 240, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 240, 400, 30);
        add(textFName);

        //Date of Birth
        JLabel labelDOB = new JLabel("Date of Birth:");
        labelDOB.setFont(new Font("Raleway", Font.BOLD, 20));
        labelDOB.setBounds(100, 290, 200, 30);
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        //Gender
        JLabel labelG = new JLabel("Gender:");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setBounds(100, 340, 200, 30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 340, 100, 30);
        r1.setBackground(new Color(222, 255, 228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 340, 100, 30);
        r2.setBackground(new Color(222, 255, 228));
        add(r2);

        ButtonGroup genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(r1);
        genderButtonGroup.add(r2);

        //Email
        JLabel labelEmail = new JLabel("Email address:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 390, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        //Marial Status
        JLabel labelMS = new JLabel("Marital status:");
        labelMS.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMS.setBounds(100, 440, 200, 30);
        add(labelMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBounds(300, 440, 100, 30);
        m1.setBackground(new Color(222, 255, 228));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBounds(450, 440, 100, 30);
        m2.setBackground(new Color(222, 255, 228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBounds(600, 440, 100, 30);
        m3.setBackground(new Color(222, 255, 228));
        add(m3);

        ButtonGroup marialButtonGroup = new ButtonGroup();
        marialButtonGroup.add(m1);
        marialButtonGroup.add(m2);
        marialButtonGroup.add(m3);

        //Adress
        JLabel labelAdd = new JLabel("Address:");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 490, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        //City
        JLabel labelCity = new JLabel("City:");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 540, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        //Pin code
        JLabel labelPin = new JLabel("Pin code:");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 590, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 590, 400, 30);
        add(textPin);

        //State
        JLabel labelState = new JLabel("State:");
        labelState.setFont(new Font("Raleway", Font.BOLD, 20));
        labelState.setBounds(100, 640, 200, 30);
        add(labelState);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        //button Next
        nextButton = new JButton("Next");
        nextButton.setFont(new Font("Raleway", Font.BOLD, 14));
        nextButton.setBackground(Color.BLACK);
        nextButton.setForeground(Color.WHITE);
        nextButton.setBounds(620, 710, 80, 30);
        nextButton.addActionListener(this);
        add(nextButton);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setLocation(360, 40);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fName = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        }
        else if (r2.isSelected()) {
            gender = "Female";
        }

        String email = textEmail.getText();
        String marital = null;
        if (m1.isSelected()) {
            marital = "Married";
        }
        else if (m2.isSelected()) {
            marital = "Unmarried";
        }
        else if (m3.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();
        
        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill al the fields");
            }
            else {
                Connect con1 = new Connect();
                String q = "INSERT INTO signup (formNo, name, fName, dob, gender, email, maritalStatus, address, city, pincode, state) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement pstmt = con1.connection.prepareStatement(q);
                pstmt.setString(1, formNo);
                pstmt.setString(2, name);
                pstmt.setString(3, fName);
                pstmt.setString(4, dob);
                pstmt.setString(5, gender);
                pstmt.setString(6, email);
                pstmt.setString(7, marital);
                pstmt.setString(8, address);
                pstmt.setString(9, city);
                pstmt.setString(10, pincode);
                pstmt.setString(11, state);
                pstmt.executeUpdate();

                new Signup2();
                setVisible(false);

            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Signup();
    }
}
