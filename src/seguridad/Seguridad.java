/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;
import java.sql.*;
/**
 *
 * @author Ruben
 */
public class Seguridad {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con =new Conexion();
        con.Conexion();
        Login log = new Login();
        log.show();
    }
    
}
