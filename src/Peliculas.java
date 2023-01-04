import javax.swing.*;

public class Peliculas extends javax.swing.JFrame {
    private JPanel panel1;
    private JButton elPayasoSiniestroButton;
    private JButton avatarButton;
    private JButton gatoConBotasButton;
    private JLabel titleMovie;

    public Peliculas() {
        setContentPane(panel1);

        elPayasoSiniestroButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "El payaso siniestro");
        });
        avatarButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Avatar");
        });
        gatoConBotasButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Gato con botas");
        });

    }


    public void setLayoutManager() {
        panel1.setLayout(null);
    }

    {/*
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
    */}
}
