import User.User;
import Validate.Validate;

import javax.swing.*;

public class Signup extends javax.swing.JFrame {
    private JPanel mainPanel;
    private JTextField emailField;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JLabel titleLabel;
    private JPasswordField passwordField;
    private JButton signupButton;
    private JLabel validateEmail;
    private JLabel validatePassword;
    private JCheckBox showPassword;
    private JButton loginButton;
    private JTextField lastNameField;
    private JTextField firstNameField;
    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel birthDateLabel;


    public Signup() {

        setContentPane(mainPanel);
        // Función para establecer administrador de diseño
        setLayoutManager();
        // Función para modificar sus posiciones
        setLocationAndSize();
        // Función para registrar usuario
        registerUser();
        // Función para mostrar contraseña checkbox
        showPassword();
        // Función para cambar de interface grafica a login
        changeInterfaceLogin();
    }

    public void setLayoutManager() {
        mainPanel.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.


        titleLabel.setBounds(130, 70, 150, 30);

        firstNameLabel.setBounds(50, 150, 100, 30);
        firstNameField.setBounds(150, 150, 150, 30);

        lastNameLabel.setBounds(50, 200, 100, 30);
        lastNameField.setBounds(150, 200, 150, 30);

        emailLabel.setBounds(50, 250, 100, 30);
        emailField.setBounds(150, 250, 150, 30);


        //validateEmail.setBounds(50, 190, 250, 30);
        passwordLabel.setBounds(50, 300, 100, 30);
        passwordField.setBounds(150, 300, 150, 30);

        //validatePassword.setBounds(50, 260, 250, 30);
        showPassword.setBounds(150, 340, 150, 30);
        signupButton.setBounds(50, 390, 250, 30);

        loginButton.setBounds(50, 450, 250, 30);
        //resetButton.setBounds(200,300,100,30);

    }

    public void showPassword() {
        showPassword.addActionListener(e -> {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('•');
            }
        });
    }

    public void registerUser() {
        signupButton.addActionListener(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();
            String lastName = lastNameField.getText();
            String firstName = firstNameField.getText();

            String error = "";
            // validar firstName
            if (!Validate.namePerson(firstName) || firstName.equals("")) {
                error += "- Ingrese un nombre valido\n";
            }
            // validar lastName
            if (!Validate.namePerson(lastName) || lastName.equals("")) {
                error += "- Ingrese un apellido valido\n";
            }
            // validar correo
            if (!Validate.emailStudent(email)) {
                error += "- Ingrese un correo valido (example@uncp.edu.pe)\n";
            }
            // validar password
            if (!Validate.password(password)) {
                error += "- Ingrese una contraseña seguro\n";
            }

            if (!error.equals("")) {
                JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                User newUser = new User(firstName, lastName, email, password);
                Usuarios.usuarios.addUser(newUser);
                JOptionPane.showMessageDialog(null, "Registro exitoso");
                System.out.println(newUser.getFirstName() +"" +newUser.getLastName());
                this.interfaceLogin();
            }


        });
    }

    public void changeInterfaceLogin() {
        loginButton.addActionListener(e -> {
            this.interfaceLogin();
        });
    }

    public void interfaceLogin() {
        Login frame = new Login();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        this.setVisible(false);
    }
}
