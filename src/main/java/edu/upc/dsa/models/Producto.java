package edu.upc.dsa.models;

import java.util.ArrayList;
import java.util.List;
import edu.upc.dsa.util.RandomUtils;


public class Producto {
    String idproducto;
    String descripcion;
    Integer precio;

    public Producto(){}

    public Producto(String idproducto, String descripcion) {

        this.setDescripcion(descripcion);
        this.idproducto= RandomUtils.getId();
        this.setPrecio(precio);
    }

    public String getIdproducto() {
        return idproducto;
    }
    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }












}


