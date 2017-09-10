/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicioImpl;

import daos.DaoPais;
import java.io.IOException;
import java.util.List;
import servicio.IPais;

/**
 *
 * @author johans
 */
public class IpaisImpl implements IPais {

    private final DaoPais dao;

    /**
     *
     * @throws IOException
     */
    public IpaisImpl() throws IOException {
        dao = new DaoPais();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> listaPais() {
        List<String> nomPais = dao.listarPais();
        return nomPais;
    }
}
