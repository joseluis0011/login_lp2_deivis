/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author FIA-LAB1D6
 */
public class MovimientoDTO {
    private int idmovimiento;
    private int idproducto;
    private int tipomovimiento;
    private String fechamovimiento;
    private int facturamovimiento;

    public MovimientoDTO() {
    }

    public MovimientoDTO(int idproducto, int tipomovimiento, String fechamovimiento, int facturamovimiento) {
        this.idproducto = idproducto;
        this.tipomovimiento = tipomovimiento;
        this.fechamovimiento = fechamovimiento;
        this.facturamovimiento = facturamovimiento;
    }

    public MovimientoDTO(int idmovimiento, int idproducto, int tipomovimiento, String fechamovimiento, int facturamovimiento) {
        this.idmovimiento = idmovimiento;
        this.idproducto = idproducto;
        this.tipomovimiento = tipomovimiento;
        this.fechamovimiento = fechamovimiento;
        this.facturamovimiento = facturamovimiento;
    }

    public int getIdmovimiento() {
        return idmovimiento;
    }

    public void setIdmovimiento(int idmovimiento) {
        this.idmovimiento = idmovimiento;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(int tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getFechamovimiento() {
        return fechamovimiento;
    }

    public void setFechamovimiento(String fechamovimiento) {
        this.fechamovimiento = fechamovimiento;
    }

    public int getFacturamovimiento() {
        return facturamovimiento;
    }

    public void setFacturamovimiento(int facturamovimiento) {
        this.facturamovimiento = facturamovimiento;
    }
    
    
}
