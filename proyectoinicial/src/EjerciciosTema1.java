public class EjerciciosTema1 {

public static void main(String [] args){
/*Crea un programa que defina tres variables: nombre, edad y ciudad. Asigna valores a cada una y muestra su contenido en la consola.
Ejemplo de salida por consola:
Ana
25
Madrid
 */
    String nombre="Ana";
    int edad=25;
    String ciudad="Madrid";
    System.out.println(nombre);
    System.out.println(edad);
    System.out.println(ciudad);
    /*Crea un programa que defina una variable llamada puntuación con valor inicial 0. Luego, modifica su valor tres veces y muestra el resultado final.
Ejemplo de salida por consola:
Puntuación inicial: 0
Después de primera modificación: 5
Después de segunda modificación: 10
Puntuación final: 15
     */
    int puntuacion=0;
    System.out.println(puntuacion);
    puntuacion=5;
    System.out.println(puntuacion);
    puntuacion=10;
    System.out.println(puntuacion);
    puntuacion=15;
    System.out.println(puntuacion);
/* Define cinco variables con diferentes tipos de datos (String, int, boolean, double, char) y muestra tanto su valor como su tipo.
Ejemplo de salida por consola:
Nombre: Carlos - Tipo: String
Edad: 30 - Tipo: int
¿Es estudiante?: true - Tipo: boolean
Altura: 1.75 - Tipo: double
Inicial: C - Tipo: char
 */
    String nombre2="Carlos";
    System.out.println(nombre2 + "- Tipo:" + nombre.getClass());
    Integer edad2=24;
    System.out.println(edad2 + "- Tipo:" + edad2.getClass());
/*Crea un programa que simule la información de un libro usando variables con nombres descriptivos. Muestra toda la información del libro en la consola.
Ejemplo de salida por consola:
Título: Don Quijote de la Mancha
Autor: Miguel de Cervantes
Año de publicación: 1605
Número de páginas: 863
¿Disponible en biblioteca?: true
 */
    String titulo= "Don Quijote de la Mancha";
    String autor= "Miguel de Cervantes";
    int año_de_publicación= 1605;
    int numero_de_páginas= 863;
    boolean disponible_en_biblioteca= true;
    System.out.println("Titulo: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Anio de publicacion: " +año_de_publicación);
    System.out.println("Numero de paginas: " + numero_de_páginas);
    System.out.println("Disponible en biblioteca?: "+ disponible_en_biblioteca);
/*Crea un programa que use constantes para almacenar información que no debe cambiar (como el valor de PI o el nombre de una aplicación) y variables para información que puede cambiar. Muestra todos los valores.
Ejemplo de salida por consola:
Aplicación: MiApp
Versión: 1.0.0
Valor de PI: 3.14159
Usuario actual: Laura
Nivel: 1
Puntuación: 0
Usuario actualizado: Miguel
Nivel actualizado: 2
Puntuación actualizada: 150
 */
    final String aplicacion= "MiApp";
    String version= "1.0.0";
    String usuario= "Laura";
    int nivel= 1;
    int puntuación= 0;
    System.out.println("Aplicacion: " + aplicacion);
    System.out.println("Version: " + version);
    System.out.println("Valor de PI: "+ Math.PI);
    System.out.println("Usuario actual: "+ usuario);
    System.out.println("Nivel: " + nivel);
    System.out.println("Puntuación: " + puntuacion);
    usuario= "Miguel";
    nivel= 2;
    puntuacion= 150;
    System.out.println("Usuario actual: "+ usuario);
    System.out.println("Nivel actualizado: " + nivel);
    System.out.println("Puntuación actualizada: " + puntuacion);
/*Escribe un programa que declare dos variables numéricas, realice las operaciones básicas (suma, resta, multiplicación y división) y muestre los resultados por consola.
Ejemplo de salida por consola:
Número 1: 10
Número 2: 5
Suma: 15
Resta: 5
Multiplicación: 50
División: 2
 */
    int numero1=10;
    int numero2=5;
    System.out.println("Número 1: " + numero1);
    System.out.println("Número 2: " + numero2);
    System.out.println("Suma: "+ (numero1+numero2));
    System.out.println("Resta: "+ (numero1-numero2));
    System.out.println("Multiplicacion: "+ (numero1*numero2));
    System.out.println("Division: "+ (numero1/numero2));

/*Crea un programa que almacene tu información personal (nombre, apellido, edad y ciudad) en variables y muestre un mensaje de presentación por consola.
Ejemplo de salida por consola:
¡Hola! Me llamo Elena García.
Tengo 24 años y vivo en Barcelona.
 */
    String nombre3="Elena";
    String apellido3= "Garcia";
    int edad3= 24;
    String ciudad3= "Barcelona";
    System.out.println("¡Hola! Me llamo " +nombre3+" " +apellido3 +". \n" + "Tengo "+edad3+" años y vivo en "+ ciudad3 +".");
/*Desarrolla un programa que calcule el área de un rectángulo. Declara variables para la base y la altura, y muestra el resultado del cálculo.
Ejemplo de salida por consola:
Base del rectángulo: 5
Altura del rectángulo: 3
El área del rectángulo es: 15
 */
    int base= 5;
    int altura= 3;
    int area= base*altura;
    System.out.println(" Base del rectángulo: " +base+"\n Altura del rectángulo: "+altura+"\n El área del rectángulo es: "+area+".");
    /* Escribe un programa que almacene la información de un producto (nombre, precio, código y disponibilidad) y muestre estos datos formateados por consola.
Ejemplo de salida por consola:
INFORMACIÓN DEL PRODUCTO
--------------------------
Nombre: Auriculares Bluetooth
Precio: 29.99€
Código: AUR-2023
Disponible: true
     */



    /* Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit. Usa una variable para la temperatura en Celsius y muestra el resultado de la conversión.
La fórmula para convertir de Celsius a Fahrenheit es:
F = C × 9/5 + 32
Ejemplo de salida por consola:
Temperatura en Celsius: 25
Temperatura en Fahrenheit: 77
     */
    double celsius=25.0;
    final double k=(9.0/5);// si intentamos dividir dos int, obvia los decimales y el calculo da mal.
    double fahrenheit= (celsius*k) +32;
    System.out.println(fahrenheit);



}
}
