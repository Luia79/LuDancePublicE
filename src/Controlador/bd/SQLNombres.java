/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador.bd;

/**
 *
 * @author luise
 */
public class SQLNombres {
    public static String verNombre1(){
        return "SELECT * FROM alumnas WHERE idnivel = 1";
    }
    
    public static String verNombre2(){
        return "SELECT * FROM alumnas WHERE idnivel = 2";
    }
    
    public static String verNombre3(){
        return "SELECT * FROM alumnas WHERE idnivel = 3";
    }
}
