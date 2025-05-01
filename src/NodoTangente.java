/**
 * Clase que representa la operación Tangente.
 */
public class NodoTangente extends NodoOperador {
    /**
     * 
     * @param izq
     * @param der
     */
    public NodoTangente(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }
    /**
     * Evaluación de Tangente.
     * @return 
     * @exception izqu!=null La tangente no puede operar con dos datos.
     */
    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("La tangente es una operacion unaria");
        }
        return Math.tan(der.evalua());
    }
}
