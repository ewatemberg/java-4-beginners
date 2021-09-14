## INTRODUCCIÓN A POO (Programación Orientada a Objetos)

## Temas

* [OOP](#OOP)
* [Terminología orientada a objetos](#Terminologia%20orientada%20a%20objetos)
* [Exercises](#Exercises) 

### OOP
Thinking about Objects
- Class, Object
    - Data (State)
    - Actions (behaviour)

Por ej:
Aeroplane
- airline, make, type, position (data)
- takeoff(), land(), cruise() (acciones)

AirHostess
- name, address (data)
- wish(), serve() (acciones)

Passenger
- name, address (data)
- takeCab(), checkin(), walk() (acciones)

### Terminologia orientada a objetos
```
class Planet {
    name, location, distanceFromSun    //data/state/fields
    revolve(), rotate()                //actions/behavior/methods
}
```

Instancias:
```
Planet earth = new Planet();
Planet venus = new Planet();
```


Terminology
- Class - Template ex : Planet, Person
- Objects/Instances - ex : earth, venus, mahatmaGandhi, nelsonMandela
- Member Data/State/Fields - Data present in each object - name, location, distanceFromSun
- Actions/Methods/Behaviour - What actions can be performed on each object?

## Exercises

Construye una clase de Moto (Bike) que permita ajustar su velocidad (speed).
El objetivo consiste en crear algunos objetos y jugar con ellos. Comprender los conceptos de clase, objeto, estado, comportamiento así también encapsulación y abstracción.


##### Fuente

* [jShell](https://www.adictosaltrabajo.com/2016/03/23/jshell-una-consola-repl-como-novedad-en-java-9/)
* [in28minutes](https://github.com/in28minutes/java-a-course-for-beginners)
