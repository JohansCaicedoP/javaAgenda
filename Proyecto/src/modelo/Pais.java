package modelo;

import java.io.Serializable;

/**
 * 
 * @author Johans
 *
 */
public class Pais implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
        private int departamento;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}
        
        public int getDepartamento() {
		return departamento;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}