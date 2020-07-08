# AprendiendoJavaPOO

Java -version 

Java tiene una herramienta interactiva en dónde puedes ir probando segmentos de código en vez de realizar todo el proceso de creación de un programa en Java. Escribir, compilar y correr.
Su nombre es jshell y está disponible desde la versión 9 de Java.
$ jshell

IDE: IntelliJ IDEA

Archivos JAR:
* Java Archive
* Son un tipo de comprimido que usan el formato Zip
* Contienen código complicado de java (*.class)
* ¿Cómo generar un archivo jar?
    * Abrir IntellijIDE -> File -> Project Structure -> Artifacts -> + -> JAR -> From modules -> Seleccionar la clase que tiene el método Main -> OK -> Build -> Build Artifacts -> Build
    * El archivo fue generado en la carpeta out -> artifacts
    * El archivo generado se ejecuta desde terminal:
        * java -version
        * Poner el path donde se encuentra el .jar
        * java -jar nombreArchivo.jar


JAVA Docs:
Genera documentación en HTML, nos ayuda a comprende que hace el código
Comentario que genera la documentación javadoc:
/** */

/**
 * Descripción: Función que obtiene el area de un círculo
 * @param r Radio de entrada
 * @return Devuelve el Area 
 * */

Activar el tooltip en IntelliJIDE:
IntelliJ IDEA -> Preferences -> Editor -> General -> Code Completion -> Show the documentation popup in () -> OK

Enumerations:

Los enumerations son tipos de datos muy especiales pues este, es el único en su tipo que sirve para declarar una colección de constantes, al ser así estaremos obligados a escribirlos con mayúsculas.
Usaremos enum cada vez que necesitemos representar un conjunto fijo de constantes. Por ejemplo los días de la semana.
Así podemos declarar un enumeration usando la palabra reservada enum.


public enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
	THURSDAY, FRIDAY, SATURDAY
}


Puedo crear referencias de enumerations de la siguiente forma:

Day day;
switch (day) {
	case MONDAY:
		System.out.println(“Mondays are good.”);
		break;
	case FRIDAY:
		System.out.println(“Fridays are nice”);
		break;
	case SATURDAY: case: SUNDAY:
		System.out.println(“Weekends are the best”);
		break;
	default:
		System.out.println(“Midweek are so-so”);
		break;

}
Y puedo llamar un valor del enumeration así:

Day.MONDAY;
Day.FRIDAY;
Day.SATURDAY
Los enumerations pueden tener atributos, métodos y constructores, como se muestra:

public enum Day {
  MONDAY("Lunes");
  TUESDAY("Jueves");
  FRIDAY("Viernes");
  SATURDAY("Sábado");
  SUNDAY("Domingo");

  private String spanish;
  private Day(String s) {
    spanish = s;
  }

  private String getSpanish() {
    return spanish;
  }
}
Y para utilizarlo lo podemos hacer así:
System.out.println(Day.MONDAY);
Imprimirá: MONDAY
System.out.println(Day.MONDAY.getSpanish());

Imprimirá: Lunes


Polimorfismo:
Posibilidad de sobrescribir un método y asignarles comportamientos diferentes.
Nota: los métodos marcados como final o static, no se pueden sobrescribir.


Interfaces:
Es un tipo de referencia similar a una clase que podria contener solo constantes y definiciones de metodos.


Collections:

Otras interfaces que son muy importantes en Java son los llamados Collections
Los Collections nos van a servir para trabajar con colecciones de datos, específicamente y solamente con objetos, para esto recuerda que tenemos disponibles nuestras clases Wrapper que nos ayudan a convertir datos primitivos a objetos.
Los collections se diferencian de los arrays en que su tamaño no es fijo y por el contrario es dinámico.

Las interfaces pueden heredar de otras interfaces utilizando la palabra clave extends, el concepto de herencia se aplicará como naturalmente se practica en clases, es decir, la interfaz heredará y adquirirá los métodos de la interfaz padre.

Una cosa interesante que sucede en caso de herencia con interfaces es que, aquí sí es permitido la herencia múltiple como ves a continuación:

public interface IReadable {
	public void read();
}


public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
}
Además siguiendo las implementaciones de métodos default y private de las versiones Java 8 y 9 respectivamente podemos sobreescribir métodos y añadirles comportamiento, si es el caso.

public interface Visualizable extends IReadable, Serializable {
	public void setViewed();
	public Boolean isViewed();
	public String timeViewed();
	
@Override
	default void read() {
	// TODO Auto-generated method stub
}
}
