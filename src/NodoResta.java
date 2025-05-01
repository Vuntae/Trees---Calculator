

/**
 * 
 * Clase que representa la operación de la Resta.
 * @author Alejandro Hernández Mora <alejandrohmora@ciencias.unam.mx>
 */
public class NodoResta extends NodoOperador {

    /**
     *
     * @param izq
     * @param der
     */
    public NodoResta(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence=0;
    }

    /**
     * * La evaluación del nodo, resta la evaluación de los hijos izquierdo y derecho.
     * @return
     */
    @Override
    public double evalua() {
        if (izq != null) {
            return izq.evalua() - der.evalua();
        }
        return -der.evalua();
    }
}
