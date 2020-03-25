## INTRODUCCIÓN A POO II 

## Indice

* [Clase Abstracta](#clase-abstracta)
* [Interfaz](#interfaz)
* [Métodos de acceso](#métodos-de-acceso)
* [Modificadores de acceso](#modificadores-de-acceso)
* [Modularidad](#modularidad)
* [Encapsulamiento](#encapsulamiento)
* [Herencia](#herencia)
* [Polimorfismo](#polimorfismo)
* [Atributos estáticos](#atributos-estáticos)
* [Métodos estáticos](#métodos-estáticos)
* [Clases estáticas](#clases-estáticas)
* [Hilos](#hilos)

### Clase Abstracta
Una clase abstracta para Java es una clase de la que nunca se van a crear instancias: simplemente va a servir como superclase a otras clases.
- Declara la existencia de métodos pero no la implementación de dichos métodos (o sea, las llaves { } y las sentencias entre ellas), se considera una clase abstracta.
- Una clase debe ser declarada abstracta si posee al menos un método declarada abstracto.
- Un método abstracto es aquel que no posee implementación.
El resto de clases pueden heredar de una clase abstracta con el modificador **“extends”**

### Interfaz
Una interfaz en Java es una colección de métodos abstractos y propiedades constantes. En las interfaces se especifica qué se debe hacer pero no su implementación. Serán las clases que implementen estas interfaces las que describen la lógica del comportamiento de los métodos.
El resto de clases implementan la interface con el modificador **“implements”**

**¿Cuál es la diferencia entre una Clase Abstracta y una Intefaz?**

Existen varias diferencias entre una clase abstracta y una interfaz:

- Una clase abstracta puede heredar o extender cualquier clase (independientemente de que esta sea abstracta o no), mientras que una interfaz solamente puede extender o implementar otras interfaces.
- Una clase abstracta puede heredar de una sola clase (abstracta o no) mientras que una interfaz puede extender varias interfaces de una misma vez.
- Una clase abstracta puede tener métodos que sean abstractos o que no lo sean, mientras que las interfaces sólo y exclusivamente pueden definir métodos abstractos.
- En una clase abstracta, los métodos abstractos pueden ser public o protected. En una interfaz solamente puede haber métodos públicos.
- En una clase abstracta pueden existir variables static, final o static final con cualquier modificador de acceso (public, private, protected o default). En una interfaz sólo puedes tener constantes (public static final).

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/InterfaceAnimal.png?raw=true)

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/AbstractaAnimal.png?raw=true)

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/ClaseAnimal.png?raw=true)

### Métodos de acceso
Son los métodos o funciones que permiten obtener o modificar los atributos de un objeto. Además, estos métodos tienen la limitación de proveer información acerca del estado de un objeto específicamente sus propiedades.

### Modificadores de acceso
Son palabras claves de los lenguajes de programación orientado a objetos para configurar la accesibilidad a las clases, métodos o propiedades.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/ModificadoresAcceso.png?raw=true)

### Encapsulamiento
*Es la propiedad que permite asegurar que la información de un objeto está oculta del mundo exterior.*
El usuario de una clase en particular no necesita saber cómo están estructurados los datos dentro de ese objeto, es decir, un usuario no necesita conocer la implementación Al evitar que el usuario modifique los atributos directamente y forzándolo a utilizar funciones definidas para modificarlos (llamadas interfaces), se garantiza la integridad de los datos (por ejemplo, uno puede asegurarse de que el tipo de datos suministrados cumple con nuestras expectativas, o icluso que los datos se encuentran dentro del intervalo esperado).

### Herencia
La herencia es específica de la programación orientada a objetos, donde una clase nueva se crea a partir de una clase existente. La herencia (a la que habitualmente se denomina subclase) proviene del hecho de que la subclase (la nueva clase creada) contiene las atributos y métodos de la clase primaria. La principal ventaja de la herencia es la capacidad para definir atributos y métodos nuevos para la subclase, que luego se aplican a los atributos y métodos heredados.
Esta particularidad permite crear una estructura jerárquica de clases cada vez más especializada. La gran ventaja es que uno ya no debe comenzar desde cero cuando desea especializar una clase existente.

**Herencia Simple** 
La relación padre-hijo entre clases puede representarse desde un punto de vista jerárquico, denominado vista de clases en árbol. 

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/HerenciaSimple.png?raw=true)

**Herencia Multiple**
Algunos lenguajes orientados a objetos, como C++ permiten herencias múltiples, lo que significa que una clase puede heredar los atributos de otras dos superclases. Este método puede utilizarse para agrupar atributos y métodos desde varias clases dentro de una sola.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/HerenciaMultiple.png?raw=true) 

### Polimorfismo
Son comportamientos diferentes, asociados a objetos distintos, pueden compartir el mismo nombre; al llamarlos por ese nombre se utilizará el comportamiento correspondiente al objeto que se esté usando.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/Polimorfismo.png?raw=true) 

**Tipos**
- Polimorfismo Ad-Hoc:
Se refiere a funciones que cambian su comportamiento dependiendo del tipo de argumentos que reciben (sobrecarga de métodos o funciones).
La sobrecarga de métodos hace referencia a varios métodos con el mismo nombre pero con diferentes firmas.

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/PolimorfismoAdHoc.jpg?raw=true) 

- Polimorfismo parámetrico:
El polimorfismo paramétrico permite que las funciones y las clases puedan escribirse de forma genérica, de tal manera que pueda manipular los datos de la misma manera sin importar el tipo.Ejemplos:
C++ - Templates
Java - Generics (>> *esto lo vamos a ver mas adelante*)

### Atributos estáticos
- Los atributos y métodos estáticos también se llaman atributos de clase y métodos de clase. 
- No es específico de cada objeto. Solo hay una copia del mismo y su valor es compartido por todos los objetos de la clase.
- Podemos considerarlo como una variable global a la que tienen acceso todos los objetos de la clase.
- Existe y puede utilizarse aunque no existan objetos de la clase.
Para acceder a un atributo de clase se escibe: NombreClase.atributo

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/AtributosEstaticos.png?raw=true)

### Métodos estáticos
- Tiene acceso solo a los atributos estáticos de la clase.
- No es necesario instanciar un objeto para poder utilizarlo.
Para acceder a un método de clase se escribe: NombreClase.método()

![](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/img/MetodosEstaticos.png?raw=true)
