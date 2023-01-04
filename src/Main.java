import Pelicula.Pelicula;
import Users.Users;
import Validate.Validate;

import javax.swing.*;
import java.util.Scanner;

interface Usuarios {
    Users usuarios = new Users();
}

public class Main implements Usuarios {
    public static void main(String[] args) {

        {/*
        Scanner entrada = new Scanner(System.in);

        String lastName = "";

        do{

            System.out.print("Ingrese lastName:");
            lastName = entrada.nextLine();
        }while (!Validate.namePerson(lastName));

        */
        }

        Login frame = new Login();
        frame.setTitle("Login");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}