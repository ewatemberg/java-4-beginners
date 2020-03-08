## INTRODUCCIÓN A POO (Programación Orientada a Objetos)

## Indice

* [Abstracción](#abstracción)
* [Clase](#clase)
* [Atributo](#atributo)
* [Método](#método)
* [Objeto](#objeto)
* [Instancia](#instancia)
* [Diagramas de clases](#diagramas-de-clases)
* [Mensaje](#mensaje)
* [Constructor](#constructor)
* [Destructor](#destructor)
* [Evento](#evento)
* [Sobreescritura](#sobreescritura)

### Abstracción
La abstracción es un proceso de interpretación y diseño que implica reconocer y enfocarse en las características importantes de una situación u objeto, y filtrar o ignorar todas las particularidades no esenciales.
* Dejar a un lado los detalles de un objeto y definir las características específicas de éste, aquellas que lo distingan de los demás tipos de objetos.
* Hay que centrarse en lo que es y lo que hace un objeto, antes de decidir cómo debería ser implementado.
* Se hace énfasis en el qué hace más que en el cómo lo hace.

Ejemplo: Imaginemos que queremos aplicar la abstracción a las aves:

**Objeto:** Pajaro

**Caracteristicas:**
- Pico
- Alas
- Patas
- Plumas

**Funcionalidades:**
- Volar
- Picar
- Aterrizar

### Clase
La clase es un modelo o prototipo que define las variables y métodos comunes a todos los objetos de cierta clase. Es una plantilla genérica para un conjunto de objetos de similares características. Una clase define el estado y el comportamiento que todos los objetos creados a partir de esa clase tendrán.
Ejemplo:


### Atributo
### Método
### Objeto
### Instancia
### Diagramas de clases
### Mensaje
### Constructor
### Destructor
### Evento
### Sobreescritura



##### In the java bin folder, open a Command Shell and run

    javac HelloWorld.java  
    
##### Using JShell
In the java bin folder, open a Command Shell and run
```
jshell> System.out.println("I love JShell");
I love JShell

jshell> class HelloWorld {}
|  created class HelloWorld

jshell> HelloWorld hello = new HelloWorld()
hello ==> HelloWorld@6e06451e

jshell> void sayHelloWorld() { System.out.println("Hello World"); }
|  created method sayHelloWorld()

jshell> void sayHello(String name) { System.out.println("Hello " + name);}
|  created method sayHello()

 
jshell> /methods
|    void sayHelloWorld()
|    void sayHello(string)

jshell> /clear
 
jshell> /exit
```
    

##### Fuente

* [jShell](https://www.adictosaltrabajo.com/2016/03/23/jshell-una-consola-repl-como-novedad-en-java-9/)
* [in28minutes](https://github.com/in28minutes/java-a-course-for-beginners)
