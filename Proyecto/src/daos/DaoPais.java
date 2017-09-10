/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johans
 */
public class DaoPais {

    private final SqlMain sql;
    private final Connection conexion;
    ResultSet result = null;

    public DaoPais() throws IOException {
        sql = new SqlMain();
        conexion = sql.conectar();
    }

    public List<String> listarPais() {
        List<String> nomPais = new ArrayList<>();        
        try {
            PreparedStatement st = conexion.prepareStatement("select * from pais");
            result = st.executeQuery();
            while (result.next()) {
                nomPais.add(result.getString("nombre"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        sql.close();
        return nomPais;
    }
}
