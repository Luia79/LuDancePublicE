/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author luise
 */
public class Inventario {
    int id_inventario;
    String tipo_producto;
    String talla;
    String color;
    int stock;

    public int getId_inventario() {
        return id_inventario;
    }

    public String getTipo_producto() {
        return tipo_producto;
    }

    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public int getStock() {
        return stock;
    }

    public void setId_inventario(int id_inventario) {
        this.id_inventario = id_inventario;
    }

    public void setTipo_producto(String tipo_producto) {
        this.tipo_producto = tipo_producto;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
