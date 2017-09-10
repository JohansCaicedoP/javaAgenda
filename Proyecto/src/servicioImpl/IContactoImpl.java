package servicioImpl;

import java.io.IOException;
import java.sql.SQLException;

import daos.DaoContacto;
import modelo.Contacto;
import servicio.Icontacto;

public class IContactoImpl implements Icontacto {

    private final DaoContacto dao;

    public IContactoImpl() throws IOException {
        dao = new DaoContacto();
    }

    @Override
    public void listaContactos() {
        dao.listarContactos();
    }

    @Override
    public void buscaPorNombreApellido(String nombre, String apellido) {
        dao.buscarPorNombre(nombre);
    }

    @Override
    public void buscaPorCorreo(String correo) {
    }

    @Override
    public void borraPersona(Contacto persona) {
        // TODO Auto-generated method stub
    }

    @Override
    public void actualizaPersona(Contacto persona) {
        // TODO Auto-generated method stub
    }

    @Override
    public void guardaContacto(Contacto contacto) throws SQLException, IOException {
        dao.guardaContacto(contacto);
    }
}
