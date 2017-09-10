package daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import modelo.Contacto;

public class DaoContacto {

	private final SqlMain sql;
	private final Connection conexion;
	ResultSet result = null;

	public DaoContacto() throws IOException {
		sql = new SqlMain();
		conexion = sql.conectar();
	}

	public void listarContactos() {
		try {
			PreparedStatement st = conexion
					.prepareStatement("select * from contacto");
			result = st.executeQuery();
			while (result.next()) {
				System.out.print("ID: ");
				System.out.println(result.getInt("id"));

				System.out.print("Nombre: ");
				System.out.println(result.getString("nombre"));

				System.out.print("Apellidos: ");
				System.out.println(result.getString("apellido"));

				System.out.print("Pais: ");
				System.out.println(result.getString("pais"));
				// try {
				// Pais pais = (Pais) result.getObject("pais");
				// System.out.println(pais.getNombre());
				/*
				 * Blob blob = result.getBlob("pais"); ObjectInputStream ois =
				 * new ObjectInputStream(blob.getBinaryStream()); Pais pais =
				 * (Pais) ois.readObject();
				 * System.out.println(pais.getNombre()); } catch (IOException
				 * ex) { } catch (ClassNotFoundException e) { }
				 */
				System.out.println("=======================");
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		sql.close();
	}

	public List<Contacto> listar(long serialized_id) {
		try {
			PreparedStatement st = conexion
					.prepareStatement("select pais from contactos where pais= ?");
			result = st.executeQuery();
			while (result.next()) {

			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		sql.close();
		return null;
	}

	public void buscarPorNombre(String nombre) {
		try {
			PreparedStatement st = conexion
					.prepareStatement("SELECT * from contactos WHERE nombre='johans' AND apellido='caicedo'");
			result = st.executeQuery();
			if (result.next()) {
				System.out.println("ID: ");
				System.out.println(result.getInt("id"));
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		sql.close();
	}

	public void guardaContacto(Contacto contacto) throws SQLException,
			IOException {
		PreparedStatement st = conexion
				.prepareStatement("insert into contacto (id, nombre, apellido, pais) values (null,?,?,?)");
		st.setString(1, contacto.getNombre());
		st.setString(2, contacto.getApellido());
		st.setInt(3, contacto.getPais());
		st.executeUpdate();
		st.close();
		sql.close();
	}
}
