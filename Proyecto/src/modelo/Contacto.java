package modelo;

import java.io.Serializable;

/**
 * 
 *@author Johans
 *
 */
public class Contacto implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String apellido;

	private int telefono;
	private String direccion;
	private String email;
	private Grupo grupo;
	private String celular;

	private int id_pais;
	
	public void setPais(int id_pais){
		this.id_pais = id_pais;
	}
	
	public int getPais(){
		return id_pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
}