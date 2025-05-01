/**
 * Clase que representa la operación Seno.
 */
public class NodoSeno extends NodoOperador {
    /**
     * 
     * @param izq
     * @param der
     */
    public NodoSeno(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }
    /**
     * Evaluación de Seno.
     * @return 
     * @exception izq!=null El seno no puede operar con dos datos.
     */
    @Override
    public double evalua() {
        if (izq != null) {
            throw new ArithmeticException("El seno es una operacion unaria");
        }
        return Math.sin(der.evalua());
    }
}
