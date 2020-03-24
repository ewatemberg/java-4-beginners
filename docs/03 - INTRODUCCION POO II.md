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

### Modularidad
### Encapsulamiento
### Herencia
### Polimorfismo
### Atributos estáticos
### Métodos estáticos
### Clases estáticas
### Hilos
