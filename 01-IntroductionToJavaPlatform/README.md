#Java Esencial
[#1 Documentación](https://github.com/ewatemberg/java-4-beginners/blob/master/docs/01%20-%20JAVA%20ESENCIAL.md)

![](https://github.com/ewatemberg/java-4-beginners/blob/master/01-IntroductionToJavaPlatform/java-write-once-run-anywhere.png?raw=true)


## JDK vs JRE vs JVM

- JVM (Java Virtual Machine) runs Java bytecode.
- JRE = JVM + Libraries + Other Components 
- JDK = JRE + Compilers + Debuggers



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