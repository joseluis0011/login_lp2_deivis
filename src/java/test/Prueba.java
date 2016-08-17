/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Conexion.Conexion;
import DAO.ProductoDAO;
import DTO.ProductoDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 */
public class Prueba {

    private static ProductoDAO pro = new ProductoDAO();

    public static void main(String[] args) {
        // TODO code application logic here
        
        leer(2);
    }

    public static void conex() {
        if (Conexion.getConexion() != null) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }

    public static void listar() {
        List<ProductoDTO> u = new ArrayList<>();
        u = pro.readAll();
        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i).getNombreproducto());
        }

    }
    public static void Eliminar(int id){
        if(pro.delete(id)){
            System.out.println("Eliminado");
        }else{
            System.out.println("Error al eliminar");
        }
    }
    public static void leer(int id) {
        List<ProductoDTO> u = new ArrayList<>();
        u = pro.read(id);
        for (int i = 0; i < u.size(); i++) {
            System.out.println(u.get(i).getNombreproducto());
        }

    }
}
