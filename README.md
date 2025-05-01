# Calculadora

El programa "Calculadora" es una aplicación de Java con interfaz gráfica que implementa la evaluación de expresiones matemáticas mediante un **árbol de análisis sintáctico** (estructura de nodos). Este enfoque permite manejar expresiones complejas y anidadas de manera eficiente y extensible. 

## Características principales

- **Arquitectura basada en árboles y nodos:**
  - Cada operación matemática (suma, resta, multiplicación, funciones trigonométricas, raíz, etc.) se representa como un nodo en un árbol.
  - Los nodos pueden ser operadores (como `+`, `-`, `*`, `/`, `sen`, `cos`, `tan`, `raíz`) o valores (números).
  - El árbol se evalúa de manera recursiva, donde cada nodo calcula su valor a partir de sus hijos.

- **Extensibilidad:**
  - Es fácil agregar nuevas operaciones matemáticas creando nuevas clases de nodos.
  - La separación de responsabilidades permite mantener y depurar el código de manera más sencilla.

- **Evaluación de expresiones complejas:**
  - Soporta expresiones anidadas y con múltiples operadores.
  - Maneja notaciones como infija, prefija o postfija dependiendo de cómo se construya el árbol.

- **Interfaz gráfica:**
  - Incluye una interfaz gráfica que permite al usuario ingresar expresiones y ver los resultados de manera interactiva.

## Ejemplo de representación en árbol

Una expresión como `sen(2 + 3)` se representaría en el árbol de análisis sintáctico de la siguiente manera:

## Para correr el programa "Calculadora" 
- Compilar con el comando `javac src/*.java`
- Entrar a "src" con `cd src/`
- Correr el programa con el comando `java Calculadora`

## Archivos agregados 
- NodoRaiz.java
- NodoSeno.java
- NodoCoseno.java
- NodoTangente.java

## Archivos modificados 
- Calculadora.java
- Compilador.java
- NodoOperador.java

## Para ver la documentación 
- Ir a la carpeta "docs" con `cd docs/`
- Abrir el archivo "allclasses-index.html" con `firefox allclasses-index.html`
