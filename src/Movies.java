import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;

import Pelicula.Pelicula;
import Peliculas.Peliculas;

public class Movies extends javax.swing.JFrame {
    private JLabel titleLabel;
    private JPanel mainPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton[] buttons = {button1, button2, button3};

    public Movies() {
        this.setLocationRelativeTo(this);
        setContentPane(mainPanel);
        setLayoutManager();
        setLocationAndSize();


        //setImageButton(button1, "https://cinemarkmedia.modyocdn.com/pe/300x400/91072.jpg?version=1672790400000");

        {/*
        try {
            button1.setIcon(new ImageIcon(new URL("https://cinemarkmedia.modyocdn.com/pe/300x400/91072.jpg?version=1672790400000")));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        */
        }


        Peliculas peliculas = new Peliculas();


        int i = 0;
        for (JButton button : buttons) {
            try {
                Pelicula pelicula = peliculas.getPeliculas().get(i);
                //setImageButton(button, pelicula.getImagen());
                button.setIcon(new ImageIcon(new URL(pelicula.getImagen())));
                button.addActionListener(e -> {
                    DetailsMovie frame = new DetailsMovie(pelicula);
                    frame.setTitle("DetailsMovie");
                    frame.setVisible(true);
                    frame.setBounds(10, 10, 700, 800);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setResizable(false);
                });
                i++;
                //button.setIcon(new ImageIcon(new URL("https://cinemarkmedia.modyocdn.com/pe/300x400/91072.jpg?version=1672790400000")));
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setLayoutManager() {
        mainPanel.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        int x = 50;
        int y = 150;
        for (JButton button : buttons) {
            button.setBounds(x, y, 250, 350);
            x += 250; //Separación de buttons
            x += 50; //Espaciado entre buttons
        }
        titleLabel.setBounds(300, 70, 350, 30);

    }

    private void setImageButton(JButton button, String url) {
        ImageIcon image = new ImageIcon(url);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(button.getWidth(), button.getHeight(), Image.SCALE_DEFAULT));
        button.setIcon(icon);
        this.repaint();
    }

}
