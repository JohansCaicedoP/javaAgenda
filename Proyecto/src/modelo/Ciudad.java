package modelo;

import java.io.Serializable;

/**
 * 
 * @author johans
 *
 */
public class Ciudad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nombre;
	private int id_departamento;
	
	public int getDepartamento(){
		return id_departamento;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
