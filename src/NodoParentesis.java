/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * Clase que representa operaciones con paréntesis. 
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */ 
public class NodoParentesis extends NodoOperador {

    /**
     *
     */
    public NodoParentesis() {
        super();
        precedence = 4;
    }

    /**
     *
     * @return
     */
    @Override
    public double evalua() {
        throw new UnsupportedOperationException("No se puede evaluar un parentesis"); //To change body of generated methods, choose Tools | Templates.
    }

}
