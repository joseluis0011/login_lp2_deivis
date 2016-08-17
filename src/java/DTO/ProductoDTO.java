/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 */

public class ProductoDTO {
    private int idproducto;
    private String nombreproducto;
    private String descripcionproducto;
    private int cantidadproducto;
    private double precioproducto;

    public ProductoDTO() {
    }

    public ProductoDTO(String nombreproducto, String descripcionproducto, int cantidadproducto, double precioproducto) {
        this.nombreproducto = nombreproducto;
        this.descripcionproducto = descripcionproducto;
        this.cantidadproducto = cantidadproducto;
        this.precioproducto = precioproducto;
    }

    public ProductoDTO(int idproducto, String nombreproducto, String descripcionproducto, int cantidadproducto, double precioproducto) {
        this.idproducto = idproducto;
        this.nombreproducto = nombreproducto;
        this.descripcionproducto = descripcionproducto;
        this.cantidadproducto = cantidadproducto;
        this.precioproducto = precioproducto;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public String getDescripcionproducto() {
        return descripcionproducto;
    }

    public void setDescripcionproducto(String descripcionproducto) {
        this.descripcionproducto = descripcionproducto;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void setCantidadproducto(int cantidadproducto) {
        this.cantidadproducto = cantidadproducto;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }

   
    
    
}
