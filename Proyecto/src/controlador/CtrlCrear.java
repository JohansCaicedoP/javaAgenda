/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.Button;
import java.awt.Choice;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import modelo.Contacto;
import servicioImpl.IContactoImpl;
import servicioImpl.IpaisImpl;

/**
 *
 * @author Johans
 */
public class CtrlCrear extends CtrlBoton {
	IpaisImpl paisSrv;
	IContactoImpl contactoSrv;

	/**
	 * 
	 * @throws IOException
	 */
	public CtrlCrear() throws IOException {
		paisSrv = new IpaisImpl();
		contactoSrv = new IContactoImpl();
	}

	/**
	 *
	 * @param botones
	 */
	public void valida(Button[] botones) {
		btnNovacio(null);
	}
	
	/**
	 * 
	 * @param choice
	 */
	public void cargarPais(Choice choice) {
		List<String> paises = paisSrv.listaPais();
		for (int i = 0; i < paises.size(); i++) {
			String nombre = paises.get(i);
			choice.add(nombre);
		}
	}
	
	/**
	 * 
	 * @param contacto
	 * @throws SQLException
	 * @throws IOException
	 */
	public void crearContacto(Contacto contacto) throws SQLException, IOException {
		contactoSrv.guardaContacto(contacto);
	}
	
	/**
	 * 
	 */
	public void listarContactos(){
		contactoSrv.listaContactos();
	}
}