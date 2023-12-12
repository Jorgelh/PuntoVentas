/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clas;

/**
 *
 * @author jluis
 */
public class Productos {
    
    private int id_producto;
    private String descripcion;
    private String precio;
    private int codigo;
    private int cantidad;
    private double cantidad2;
    private String Fecha;
    private double Cantidadinicial;
    private double Cantidadfinal;

    public double getCantidadinicial() {
        return Cantidadinicial;
    }

    public void setCantidadinicial(double Cantidadinicial) {
        this.Cantidadinicial = Cantidadinicial;
    }
    
    public double getCantidadfinal() {
        return Cantidadfinal;
    }

    public void setCantidadfinal(double Cantidadfinal) {
        this.Cantidadfinal = Cantidadfinal;
    }
    
    
    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }
    
    public double getCantidad2() {
        return cantidad2;
    }

    public void setCantidad2(double cantidad2) {
        this.cantidad2 = cantidad2;
    }
    
    

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
}
