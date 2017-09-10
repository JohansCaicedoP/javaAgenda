/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author johans
 */
public class ConfiguracionSql {

    protected String path = "/home/johans/workspace/Proyecto/src/properties/sql.properties";
    protected Properties properties;

    protected final String ruta;
    protected final String bDatos;
    protected final String manejador;

    public ConfiguracionSql() throws IOException {
        properties = new Properties();
        properties.load(new FileInputStream(path));
        ruta = properties.getProperty("ruta");
        bDatos = properties.getProperty("baseDatos");
        manejador = properties.getProperty("manejador");

    }
}
