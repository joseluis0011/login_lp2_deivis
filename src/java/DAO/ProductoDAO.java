/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import DTO.ProductoDTO;
import Interface.Operacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FIA-LAB1D6
 */
public class ProductoDAO implements Operacion<ProductoDTO> {

    private Connection cx;
    private PreparedStatement ps;
    private ResultSet rs;
    private Statement st;
    
    private final String SQL_CREATE = "INSERT INTO producto (id_producto, nombre_producto, descipcion_producto,cantidad_producto,precio_producto)" +
                        "VALUES (NULL, ?, ?, ?, ?);";
    private final String SQL_READALL = "SELECT *FROM producto";
    private final String SQL_READ = "SELECT *FROM producto WHERE id_producto=";
    private final String SQL_DELETE = "DELETE FROM producto WHERE id_producto=";
    private final String SQL_UPDATE = "UPDATE producto SET nombre_producto = ? , descipcion_producto=? , cantidad_producto=? ,precio_producto=?  WHERE id_producto= ?";

    @Override 
    public int create(ProductoDTO e) {
        int p=0;
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_CREATE);
            ps.setString(1, e.getNombreproducto());
            ps.setString(2, e.getDescripcionproducto());
            ps.setInt(3, e.getCantidadproducto());
            ps.setDouble(4, e.getPrecioproducto());
            p = ps.executeUpdate();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return p;
    }

    @Override
    public int update(ProductoDTO e) {
        int p = 0;

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_UPDATE);
            ps.setString(1, e.getNombreproducto());
            ps.setString(2, e.getDescripcionproducto());
            ps.setInt(3, e.getCantidadproducto());
            ps.setDouble(4, e.getPrecioproducto());
            ps.setInt(5, e.getIdproducto());
            p = ps.executeUpdate();
        } catch (Exception ex) {

        }
        return p;
    }

    @Override
    public boolean delete(Object key) {
        boolean p = false;
        try {

            cx = Conexion.getConexion();
            st = cx.createStatement();

            int a = st.executeUpdate(SQL_DELETE + key);

            if (a > 0) {
                p = true;
            }

        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public List<ProductoDTO> readAll() {
        List<ProductoDTO> lista = new ArrayList<>();
        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_READALL);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoDTO u = new ProductoDTO();
                u.setIdproducto(rs.getInt("id_producto"));
                u.setNombreproducto(rs.getString("nombre_producto"));
                u.setDescripcionproducto(rs.getString("descipcion_producto"));
                u.setCantidadproducto(rs.getInt("cantidad_producto"));
                u.setPrecioproducto(rs.getDouble("precio_producto"));
                lista.add(u);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    @Override
    public List<ProductoDTO> read(int id) {
        
        List<ProductoDTO> lista = new ArrayList<>();

        try {
            cx = Conexion.getConexion();
            ps = cx.prepareStatement(SQL_READ+id);
            rs = ps.executeQuery();
            while (rs.next()) {
                ProductoDTO u = new ProductoDTO();
                u.setIdproducto(rs.getInt("id_producto"));
                u.setNombreproducto(rs.getString("nombre_producto"));
                u.setDescripcionproducto(rs.getString("descipcion_producto"));
                u.setCantidadproducto(rs.getInt("cantidad_producto"));
                u.setPrecioproducto(rs.getDouble("precio_producto"));
                lista.add(u);
            }
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
        return lista;
    }

}
