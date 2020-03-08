## INTRODUCCIÓN A POO

## Indice

* [Abstracción](#abstracción)
* [Clase](#clase)
* [Atributo](#atributo)
* [Método](#método)
* [Objeto](#objeto)
* [Instancia](#instancia)
* [Mensaje](#mensaje)
* [Constructor](#constructor)
* [Métodos](#métodos)

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

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/Clase.png?raw=true)

### Atributo
Es una característica de un objeto, que ayuda a definir su estructura y permite diferenciarlo de otros objetos. Se define con un identificador y un tipo, el cual indica los valores que puede almacenar. El conjunto de valores de los campos definen el estado del objeto

### Método
Los métodos son los comportamientos o conductas de un objeto y permite identificar la forma en que actúa respecto a su entorno o respecto a otros objetos. Además, representa una operación o función que un objeto realiza. El conjunto de los métodos de un objeto determinan el comportamiento general del objeto.

### Objeto
Un objeto es una instancia de una clase, que tiene: identidad, estado(atributos) y comportamiento(metodos)

### Instancia
Es la particularización, realización específica u ocurrencia de una determinada clase.
Una instancia de una clase es un objeto.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/Instancia.png?raw=true)

### Mensaje
Un mensaje es una comunicación dirigida desde un objeto A ordenando a otro objeto B que ejecute uno de sus métodos con ciertos parámetros asociados al evento que lo generó.
Los mensajes permiten la comunicacion entre objetos.

### Constructor
- Método especial con el mismo nombre que la clase
- Es llamado automaticamente cuando el objeto de una clase es creado.
- Se encarga de inicializar las variables del objeto.
- Puede tomar argumentos pero no puede retornar un valor.
- Se puede tener mas de un constructor en una clase.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/Constructor.png?raw=true)
 
### Métodos
Los métodos son subrutinas que manipulan los datos definidos por la clase y, en muchos casos, brindan acceso a esos datos. En la mayoría de los casos, otras partes de tu programa interactuarán con una clase a través de sus métodos.

Ejemplo:
```java
tipo-retorno nombre(lista parámetros){
        //Cuerpo del método
 }
```

* **tipo-retorno** especifica el tipo de datos devueltos por el método. Puede ser cualquier tipo válido, incluidos los tipos de clase que cree. Si el método no devuelve un valor, su tipo de devolución debe ser void.
* El **nombre** del método se especifica por nombre. Puede ser cualquier identificador legal que no sea el que ya utilizan otros elementos dentro del alcance actual.
* La **lista de parámetros** es una secuencia de tipos e identificadores separados por comas. Los parámetros son esencialmente variables que reciben el valor de los argumentos pasados al método cuando se llama. Si el método no tiene parámetros, la lista de parámetros estará vacía


##### Fuente

* [jShell](https://www.adictosaltrabajo.com/2016/03/23/jshell-una-consola-repl-como-novedad-en-java-9/)
* [in28minutes](https://github.com/in28minutes/java-a-course-for-beginners)
