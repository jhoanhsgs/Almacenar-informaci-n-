/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;

        
public class conexion {
    
    Connection Rconector = null; 

    public Connection conectar(){
        try{
                Class.forName("com.mysql.jdbc.Driver"); 
                Rconector =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/autom","root","");
                JOptionPane.showMessageDialog(null, "conexion ok");
            }
        catch(ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null, "Error "+e);
            }
            return Rconector;
}
}
