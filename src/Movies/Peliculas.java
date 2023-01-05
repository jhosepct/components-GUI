package Movies;

import Movie.Pelicula;

import java.util.ArrayList;
import java.util.List;

public class Peliculas {
    private List<Pelicula> peliculas = new ArrayList<Pelicula>();
    public Peliculas() {
        Pelicula pelicula1 = new Pelicula("El payaso siniestro terrifier 2", "Terror", "138min", "M14", "Damien Leone", "Después de que una entidad siniestra lo resucitase, Art the Clown está de vuelta en el condado de Miles, donde busca cazar a una adolescente y a su hermano menor durante Halloween.", "https://cinemarkmedia.modyocdn.com/pe/300x400/91336.jpg?version=1672790400000");
        peliculas.add(pelicula1);
        Pelicula pelicula2 = new Pelicula("Gato con botas el ultimo deseo", "Aventura/Comedia", "102min", "APT(PG)", "Joel Crawford", "El Gato con Botas descubre que su pasión por la aventura le ha pasado factura: ha quemado ocho de sus nueve vidas. Puss emprende un viaje épico para encontrar el último deseo mítico y restaurar sus nueve vidas.", "https://cinemarkmedia.modyocdn.com/pe/300x400/91072.jpg?version=1672790400000");
        peliculas.add(pelicula2);
        Pelicula pelicula3 = new Pelicula("Avatar 2 el camino del agua", "Ciencia ficción/Acción", "195min", "APT(PG)", "James Cameron", "Jake Sully vive con su nueva familia formada en el planeta Pandora. Una vez que una amenaza familiar regresa para acabar con lo que se había iniciado anteriormente, Jake debe trabajar con Neytiri y el ejército de la raza Na'vi para proteger su planeta.", "https://cinemarkmedia.modyocdn.com/pe/300x400/89038.jpg?version=1672790400000");
        peliculas.add(pelicula3);

    }

    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }
}
