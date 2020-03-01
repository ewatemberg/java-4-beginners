# JAVA Esencial
Indice:
* Revisando algunos conceptos.
* JRE - JDK - JIT
* Implementación de la JVM
* HelloWorld.java
* Java Code Conventions
* [Repositorio](https://github.com/ewatemberg/java-4-beginners/tree/master/01-IntroductionToJavaPlatform)

## Revisando algunos conceptos

* ¿Qué es un programa?
```
- Es una secuencia de instrucciones, escritas para realizar una tarea específica en una computadora. 
- Descripción de una solución a un problema
```
* ¿Cómo implementamos una solucion a un problema?
```
1. Escribimos el código fuente.
2. Compilamos.
3. Obtenemos la solución ejecutable
```
* ¿Donde ejecutamos la solución?
```
En la JVM (Java Virtual Machine). 
```
* ¿Qué es la JVM?
```
 Es una máquina virtual de proceso nativo, capaz de interpretar y ejecutar instrucciones expresadas en un código binario especial, generado por el compilador del lenguaje Java.
```
* ¿Qué es la JRE?
```
 Es el Entorno de Ejecución de Java. Contiene a la JVM y otras herramientas que permiten la ejecución de las aplicaciones Java.
```
* ¿Qué es la JDK?
```
Sirve para construir programas usando el lenguaje de programación Java. Una instalación de JDK ya contiene un JRE dentro de las carpetas.
```
* ¿Qué es JIT? 
```
 Un compilador Just-In-Time compila a código nativo parte del bytecode que el intérprete va procesando. Normalmente lo que hace el compilador JIT es observar qué partes del bytecode se ejecutan más a menudo y compilar ésas para ejecutarlas más rápidamente la próxima vez que se necesiten. ¿Y porqué no todas? Pues porqué la compilación en sí también tarda un tiempo con lo que si se compila mucho bytecode que después no se usa nunca o casi nunca.
```
mas info [AOT vs JIT](https://ingenieriadesoftware.es/compilacion-ahead-of-time-vs-just-in-time/)

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/JRE-JDK-JVM-JIT.png?raw=true)  

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/JavaConceptualDiagram.png?raw=true)  

### Tips
+ El bytecode es el formato intermedio que permite que Java sea multiplataforma.
+ Hay tres maneras (más múltiples combinaciones entre ellas) de convertir bytecode a código ensamblador nativo de la máquina/arquitectura donde estamos ejecutando el programa Java:
  - Interpretando el código bytecode línea a línea
  - Compilándolo a medida que lo vamos necesitando (compilación Just-in-Time)
  - Precompilándolo antes de la ejecución (compilación Ahead-of-Time)

## Hello World
```java
class HelloWorld {

    public static void main(String[] args) {
    	System.out.println("Hello World");
    }
}
```
[Repositorio](https://github.com/ewatemberg/java-4-beginners/tree/master/01-IntroductionToJavaPlatform)

## Java Code Conventions
Las convenciones de código son importantes para los programadores por un gran número de razones: 
- El 80% del costo de por vida de una pieza de software se destina al mantenimiento. 
- Casi ningún software es mantenido durante toda su vida por el autor original.
- Las convenciones de código mejoran la legibilidad del software, permitiendo a los ingenieros comprender el nuevo código de manera más rápida y exhaustiva.
- Si envía su código fuente como producto, debe asegurarse de que esté tan bien empaquetado y limpio como cualquier otro producto que cree.

[info](https://www.oracle.com/technetwork/java/codeconvtoc-136057.html)  
