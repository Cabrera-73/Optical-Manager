/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.gt.opticalmanager;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class OpticalManager {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         try (Connection conn = BD.getConnection()) {
            if (conn != null) {
                System.out.println("Conexion exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
    }
