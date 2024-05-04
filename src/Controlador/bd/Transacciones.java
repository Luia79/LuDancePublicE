/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.bd;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author luise
 */
public class Transacciones {
    Statement st;
    int filaAfectada;
    
    public Transacciones() {
        this.st = null;
        this.filaAfectada = 0;
    }
    
    public ResultSet seleccionar(String sql) throws SQLException {
        try {
            //preparando la conexion 
            this.st = ConexionBD.conexion.createStatement();
            //ejecutamos el sql y obtenemos resultados
            return this.st.executeQuery(sql);
        } catch (ClassCastException e) {
            System.err.println("Error al seleccionar: " + e.getMessage());
            return null;
        }
    }
    
     public boolean validarSesion(Usuario usuario){
    
        try {
            
            //si tuvieramos base de datos, aquí ejecutariamos la consulta
            
            //validamos
            return (usuario.getNombreUsuario().equals("User") && usuario.getContrasena().equals("202cb962ac59075b964b07152d234b70"));
                        
        } catch (Exception e) {
            System.out.println("Error al validar la sesión");
            return false;
        }
        
    } //close vaidarSesion
    
}
