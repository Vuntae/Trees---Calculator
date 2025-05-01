/**
 * Clase que representa la operación Raiz cuadrada.
 */
public class NodoRaiz extends NodoOperador {
    /**
     * 
     * @param izq
     * @param der
     */
    public NodoRaiz(CompositeEA izq, CompositeEA der) {
        super(izq, der);
        precedence = 3; // Ajusta la precedencia según la jerarquía de operadores
    }
    /**
     * Evaluación de la Raiz cuadrada
     * @return 
     * @exception r<0 No se puede hacer la raiz cuadrada de un número negativo.
     * @exception izq!=null La raiz cuadrada no puede operar con dos datos. 
     */
    @Override
    public double evalua() {
        double r = der.evalua();
        if (r < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
        } else if (izq != null) {
            throw new ArithmeticException("La raiz es una operacion unaria");
        }
        return Math.sqrt(der.evalua());
    }
}
