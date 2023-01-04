import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {
    public static void main(String[] args) {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cattleya", "postgres", "k3v1n");
            System.out.println("Conexion exitosa");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from job");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
