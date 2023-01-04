import RoundedBorder.RoundedBorder;
import User.User;

import javax.swing.*;


public class Login extends javax.swing.JFrame {
    private JPanel mainPanel;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JLabel passwordLabel;
    private JLabel emailLabel;
    private JButton loginButton;
    private JCheckBox showPassword;
    private JButton signupButton;
    private JLabel titleLabel;
    private JLabel errorLabel;

    public Login() {

        setContentPane(mainPanel);
        // Función para establecer administrador de diseño
        setLayoutManager();
        // Función para modificar sus posiciones
        setLocationAndSize();
        //
        setDesign();
        // Función para validar al usuario
        validateUser();
        // Función para mostrar contraseña checkbox
        showPassword();
        // Función para cambar de interface grafica a login
        changeInterfaceSignup();
    }

    public void setLayoutManager() {
        mainPanel.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        titleLabel.setBounds(150, 70, 100, 30);
        emailLabel.setBounds(50, 150, 100, 30);
        emailField.setBounds(150, 150, 150, 30);
        //validateEmail.setBounds(50, 190, 250, 30);
        passwordLabel.setBounds(50, 200, 100, 30);
        passwordField.setBounds(150, 200, 150, 30);
        //validatePassword.setBounds(50, 260, 250, 30);
        showPassword.setBounds(150, 240, 150, 30);
        loginButton.setBounds(50, 290, 250, 30);
        signupButton.setBounds(50, 350, 250, 30);

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

    public void validateUser() {
        loginButton.addActionListener(e -> {
            String user = emailField.getText();
            String password = passwordField.getText();

            // validate campos vacios
            if (user.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            } else {
                // validate user and password
                //boolean userExists = User.validateUser(user, password);
                boolean userExists = false;
                for(User usuario : Usuarios.usuarios.getUsers()) {
                    if (usuario.getEmail().equals(user) && usuario.getPassword().equals(password)) {
                        userExists = true;
                        break;
                    }
                }

                if (userExists) {
                    JOptionPane.showMessageDialog(null, "Login successful");
                    Movies peliculas = new Movies();
                    peliculas.setTitle("Movies");
                    peliculas.setVisible(true);
                    peliculas.setBounds(10, 10, 950, 575);
                    peliculas.setResizable(false);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid user or password");
                }

            }

            {/*

            System.out.println("User: " + user);
            System.out.println("Password: " + password);
            */
            }
        });
    }

    public void setDesign() {
        //loginButton.setBorder(new RoundedBorder(40));
    }

    public void changeInterfaceSignup() {

        signupButton.addActionListener(e -> {
            Signup frame = new Signup();
            frame.setTitle("Signup");
            frame.setVisible(true);
            frame.setBounds(10, 10, 370, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            this.setVisible(false);
        });
    }

}
