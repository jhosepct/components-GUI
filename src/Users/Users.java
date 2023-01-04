package Users;

import Pelicula.Pelicula;
import User.User;

import java.util.ArrayList;
import java.util.List;

public class Users {

    private List<User> usuarios = new ArrayList<User>();
    public Users(){
        User user1 = new User("kevin", "curiñaua", "e_2019200649G@uncp.edu.pe", "K3v1njhosepct");
        usuarios.add(user1);
        User user2 = new User("usuario2", "ct", "e_2019200648G@uncp.edu.pe", "K3v1njhosepct");
        usuarios.add(user2);
        User user3 = new User("usuario3", "ct", "e_2019200647G@uncp.edu.pe", "K3v1njhosepct");
        usuarios.add(user3);

    }

    public void addUser(User user){
        usuarios.add(user);
    }

    public List<User> getUsers(){
        return usuarios;
    }
}
