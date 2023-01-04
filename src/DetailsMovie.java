import Pelicula.Pelicula;

import javax.swing.*;
import java.net.URL;

public class DetailsMovie extends javax.swing.JFrame {
    private JButton imageButton;
    private JLabel sinopsisLabel;
    private JLabel sinopsisDescription;
    private JLabel generoLabel;
    private JLabel generoDescription;
    private JLabel directorLabel;
    private JLabel directorDescription;
    private JLabel titleLabel;
    private JPanel mainPanel;

    private Pelicula pelicula;

    public DetailsMovie(Pelicula pelicula) {
        this.pelicula = pelicula;
        setLayoutManager();
        setLocationAndSize();
        setContentPane(mainPanel);
        try{
            imageButton.setIcon(new ImageIcon(new URL(pelicula.getImagen())));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        sinopsisDescription.setText(pelicula.getSinopsis());
        generoDescription.setText(pelicula.getGenero());
        directorDescription.setText(pelicula.getDirector());
        titleLabel.setText(pelicula.getNombre());
    }


    public void setLayoutManager() {
        mainPanel.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        imageButton.setBounds(50, 150, 300, 400);
        titleLabel.setBounds(500, 70, 100, 30);
        sinopsisLabel.setBounds(400, 150, 100, 30);
        sinopsisDescription.setBounds(550, 150, 150, 30);
        generoLabel.setBounds(400, 200, 100, 30);
        generoDescription.setBounds(500, 200, 150, 30);
        directorLabel.setBounds(400, 240, 150, 30);
        directorDescription.setBounds(500, 240, 250, 30);

    }
}
