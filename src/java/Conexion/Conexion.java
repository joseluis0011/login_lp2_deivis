/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FIA-LAB1D6
 */
public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/flore";
    private static final String USER = "root";
    private static final String PASS = "12345678";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static Connection cx;

    public static Connection getConexion() {
        try {
            Class.forName(DRIVER);
            if (cx == null) {
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro: " + e);
        }
        return cx;
    }

    public void cerrar() {
        if (cx != null) {
            cx = null;
        }
    }
}
