import Users.Users;

import javax.swing.*;

interface Usuarios {
    Users usuarios = new Users();
}

public class Main implements Usuarios {
    public static void main(String[] args) {
        //Iniciamos el programa en el frame Login
        Login frame = new Login();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}