/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import properties.ConfiguracionSql;

public class SqlMain extends ConfiguracionSql {

    Connection conexion;
    private final String path;
    private final String db;
    private final String manejador;

    public SqlMain() throws IOException {
        db = super.bDatos;
        path = super.ruta;
        manejador = super.manejador;
    }

    public Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            conexion = DriverManager.getConnection(manejador + ":" + path);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        System.out.println("Ruta" + ruta);
        return conexion;
    }

    public void close() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(SqlMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
