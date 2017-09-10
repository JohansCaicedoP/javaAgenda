/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.awt.TextField;

/**
 *
 * @author johans
 */
public class CtrlBoton {
    /**
     * 
     * @param textField 
     */
    public void btnNovacio(TextField textField){
        String valor = textField.getText();
        if(valor.isEmpty()){
            System.out.println("El campo esta vacio");
        }
    }
    
    public void btnSoloLetras(){
    
    }
    
    public void btnSoloNumeros(){
    
    }
}
