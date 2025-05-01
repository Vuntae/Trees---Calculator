/**
 * Clase que representa la operación del Coseno.
 */
public class NodoCoseno extends NodoOperador {
    /**
     * 
     * @param izq
     * @param der
     */
    public NodoCoseno(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }
    /**
     * Evaluación de Coseno. 
     * @exception izq!=null El coseno no puede operar con dos datos.
     */
    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("El coseno es una operacion unaria");
        }
        return Math.cos(der.evalua());
    }
}
