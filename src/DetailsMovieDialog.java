import Movie.Pelicula;

import javax.swing.*;
import java.awt.event.*;
import java.net.URL;

public class DetailsMovieDialog extends JDialog {
    private JPanel mainPanel;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JButton imageButton;
    private JTextArea sinopsisDescription;
    private JLabel sinopsisLabel;
    private JLabel directorLabel;
    private JLabel directorDescription;
    private JLabel generoDescription;
    private JTextArea titleDescription;
    private JPanel containerPanel;
    private JPanel actionsPanel;
    private JLabel generoLabel;
    private JLabel plusDetails;
    private javax.swing.JScrollPane JScrollPane;

    public DetailsMovieDialog(Pelicula pelicula) {
        setContentPane(mainPanel);
        setLayoutManager();
        setLocationAndSize();

        try{
            imageButton.setIcon(new ImageIcon(new URL(pelicula.getImagen())));
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        sinopsisDescription.setText(pelicula.getSinopsis());
        generoDescription.setText(pelicula.getGenero());

        plusDetails.setText(pelicula.getDuracion() + " | "+ pelicula.getClasificacion());
        directorDescription.setText(pelicula.getDirector());
        titleDescription.setText(pelicula.getNombre());

        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        mainPanel.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        setBounds(10,10,650,650);
        setResizable(false);

    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public void setLayoutManager() {
        containerPanel.setLayout(null);
    }

    public void setLocationAndSize() {
        //Setting location and Size of each components using setBounds() method.
        titleDescription.setBounds(50, 10, 500, 150);
        imageButton.setBounds(50, 150, 300, 400);
        sinopsisLabel.setBounds(400, 150, 200, 30);
        JScrollPane.setBounds(400,200,150,130);
        sinopsisDescription.setBounds(400, 200, 150, 130);
        directorLabel.setBounds(400, 350, 200, 30);
        directorDescription.setBounds(400, 380, 200, 30);
        generoLabel.setBounds(400, 410, 200, 30);
        generoDescription.setBounds(400, 440, 200, 30);
        plusDetails.setBounds(400,520,200,30);

        //Quita los bordes del contenedor scroll
        JScrollPane.setBorder(BorderFactory.createEmptyBorder());

    }


    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El payaso siniestro terrifier 2", "Terror", "138min", "M14", "Damien Leone", "Después de que una entidad siniestra lo resucitase, Art the Clown está de vuelta en el condado de Miles, donde busca cazar a una adolescente y a su hermano menor durante Halloween.", "https://cinemarkmedia.modyocdn.com/pe/300x400/91336.jpg?version=1672790400000");
        DetailsMovieDialog dialog = new DetailsMovieDialog(pelicula1);
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
