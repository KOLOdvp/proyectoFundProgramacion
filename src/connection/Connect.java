package connection;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {
    public static void insertPasaje(int cantidad,float precio){
        Connection conn = null;
        Statement stmt = null;
        try {
            //Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:CobranzaProyecto.db";
            conn = DriverManager.getConnection(url);
            float importe = cantidad * precio;
            stmt = conn.createStatement();
            String values = String.format("VALUES (%s,%4.2f,%4.2f)", cantidad,precio,importe);
            System.out.println("VALUES: "+values);
            String query="INSERT INTO Pasajes (CANTIDAD_PASAJES,PRECIO_PASAJES,IMPORTE) "+values+";";
            System.out.println(query);
            stmt.executeUpdate(query);
            
            stmt.close();
            conn.close();
            System.out.println("Succesfully inserted new Pasaje");
        } catch (SQLException e) {
            System.out.println("An error ocurred while inserting on table Pasajes");
            System.out.println(e.getMessage());
        }
    }
    public static void insertConductor(){
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:CobranzaProyecto.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection established");
            System.out.println("Inserting new Pasaje");
        
        } catch (SQLException ex) {
            System.out.println("An error ocurred");
            System.out.println(ex.getMessage());
        }
    }
    
    public static void testConnect() {
        Connection conn = null;
        try {
            // db parameters	
            //DriverManager.registerDriver(new connection.JDBC());

            String url = "jdbc:sqlite:CobranzaProyecto.db";
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        testConnect();
        //System.out.println("\n");
        //insertPasaje(3, 1.5f);
    }
}
