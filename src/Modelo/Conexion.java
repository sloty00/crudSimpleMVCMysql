package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Conexion
 * Retorna: con
 */
public class Conexion {
    
    private final String base= "mvcjavacrud";
    private final String user="root";
    private final String password="Cass.2022";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    
    private Connection con = null;

    public Connection getConexion(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url,this.user,this.password);
            System.out.println("conexion establecida con exito ");
        }catch(SQLException e){
            System.err.println(e);
        
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
