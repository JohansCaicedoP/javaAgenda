package servicio;

import java.io.IOException;
import java.sql.SQLException;
import modelo.Contacto;

public interface Icontacto {
	public void listaContactos();

	public void buscaPorNombreApellido(String nombre, String apellido);

	public void buscaPorCorreo(String correo);

	public void guardaContacto(Contacto contacto) throws SQLException, IOException;

	public void borraPersona(Contacto persona);

	public void actualizaPersona(Contacto persona);
}
