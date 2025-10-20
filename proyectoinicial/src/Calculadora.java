import java.util.Scanner;

public class Calculadora {
    /*EJERCICIO 1
    Crea un programa que pida al usuario dos números enteros por consola y muestre
     el resultado de las cinco operaciones aritméticas básicas: suma, resta, multiplicación,
     división y módulo (resto).
     */
    public void operacionesBasicas() {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Escribe un primer numero");
        int num1 = leerTeclado.nextInt();
        System.out.println("Escribe un segundo numero");
        int num2 = leerTeclado.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es " + suma);
        int resta = num1 - num2;
        System.out.println("La resta es " + resta);
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es " + multiplicacion);
        int division = num1 / num2;
        System.out.println("La division es " + division);
/*EJERCICIO 2
    Escribe un programa que pida dos números al usuario y muestre el resultado
    de todas las comparaciones relacionales entre ellos (mayor que, menor que,
    igual, diferente, mayor o igual, menor o igual).
     */
    }
    public void operacionesRelacionales (){
        Scanner leerTeclado2= new Scanner (System.in);
            System.out.println("Escribe un primer numero");
            int num1= leerTeclado2.nextInt();
            System.out.println("Escribe un segundo numero");
            int num2= leerTeclado2.nextInt();
            boolean mayorque= num1 > num2;
            System.out.println("El primer numero es mayor que el segundo: " +mayorque);
            boolean menorque= num1 < num2;
            System.out.println("El primer numero es menor que el segundo: " +menorque);
            boolean igualque= num1 == num2;
            System.out.println("El primer numero es igual que el segundo: " +igualque);
            boolean diferenteque= num1 != num2;
            System.out.println("El primer numero es diferente que el segundo: " +diferenteque);
            boolean mayoroigualque= num1 >= num2;
            System.out.println("El primer numero es mayor o igual que el segundo: " +mayoroigualque);
            boolean menoroigualque= num1 <= num2;
            System.out.println("El primer numero es menor o igual que el segundo: " +menoroigualque);
    /* EJERCICIO 3
    Crea un programa que declare una variable con valor inicial 100 y aplique diferentes
    operadores de asignación compuesta (+=, -=, *=, /=). Muestra el valor de la variable
    después de cada operación.
     */
    }
    public void operadoresAsignacion(){
        int variable=100;
        variable +=30;
        System.out.println("El valor de la variable tras el primer cambio es "+variable);
        variable -=22;
        System.out.println("El valor de la variable tras el segundo cambio es "+variable);
        variable *=2;
        System.out.println("El valor de la variable tras el tercer cambio es "+variable);
        variable /= 3;
        System.out.println("El valor de la variable tras el cuarto cambio es "+variable);}
    /*EJERCICIO 4
    Desarrolla un programa que pida un número al usuario y determine si es par o impar
    usando el operador módulo. Muestra el resultado por consola.
     */
    public void parImpar() {
        Scanner leerteclado= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1= leerteclado.nextInt();
        boolean par= num1 %2==0;
        System.out.println("El numero es par: " +par);}
    /*EJERCICIO 5
    Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
    Usa operadores lógicos para determinar si puede alquilar un coche (debe tener 21 años
    o más Y tener carnet).
     */
    public void carnetConducir(){
        Scanner leerteclado = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad= leerteclado.nextInt();
        System.out.println("Tienes carnet? Introduce true o false");
        boolean carnet= leerteclado.nextBoolean();
        boolean elegibleAlquiler =edad>21 && carnet== true;
        System.out.println("Puede alquilar?: " + elegibleAlquiler);
    }
    /*EJERCICIO 6
    Escribe un programa que pida el precio de un producto y el porcentaje de descuento.
    Calcula el precio final después del descuento usando operadores aritméticos y muestra
    todos los pasos del cálculo.
     */
    public void descuento (){
        Scanner leerTeclado=new Scanner(System.in);
        System.out.println("Introduce el precio del producto");
        double precio= leerTeclado.nextDouble();
        System.out.println("Introduce el descuento porcentual del producto");
        int descuento= leerTeclado.nextInt();
        double precioFinal= precio -(precio* descuento / 100);
        System.out.println("El precio final del producto es de " + precioFinal+ " euros");
    }
    /* EJERCICIO 7
    Crea un programa que pida al usuario su edad y si es estudiante (true/false). Usa
    operadores lógicos (AND, OR, NOT) para determinar si puede acceder a diferentes
    descuentos: descuento joven (menor de 26 años), descuento estudiante, o descuento
    especial (menor de 26 Y estudiante).
     */
    public void descuentoJoven () {
        Scanner leerTeclado= new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = leerTeclado.nextInt();
        System.out.println("Eres estudiante?");
        boolean estudiante = leerTeclado.nextBoolean();
        boolean descuentoJoven= edad<26 && !estudiante;
        boolean descuentoEstudiante= edad>=26 && estudiante;
        boolean descuentoEspecial= edad<26 && estudiante;
        System.out.println("Tienes descuento joven: " + descuentoJoven);
        System.out.println("Tienes descuento estudiante: " + descuentoEstudiante);
        System.out.println("Tienes descuento especial: " + descuentoEspecial);
    }
    /* EJERCICIO 8
    Desarrolla un programa que pida tres números al usuario y calcule: la suma de los
    tres, el promedio, el resultado de multiplicar el primero por el segundo y dividirlo
    entre el tercero. Usa paréntesis para controlar la precedencia de operadores.
     */
    public void tresNumeros(){
        Scanner leerTeclado= new Scanner(System.in);
        System.out.println("Escribe un numero");
        int num1= leerTeclado.nextInt();
        System.out.println("Escribe otro numero");
        int num2= leerTeclado.nextInt();
        System.out.println("Escribe un tercer numero");
        int num3= leerTeclado.nextInt();
        int suma= num1 + num2 +num3;
        System.out.println("La suma es "+ suma);
        double promedio = ((double)num1 +num2 +num3)/3;
        System.out.println("El promedio es "+ promedio);
        double multiplicacion = (double)num1*num2/num3;
        System.out.println("El resultado de multiplicar el primero por el segundo y dividirlo entre el tercero es "+ multiplicacion);
    }
    /* EJERCICIO 9
    Escribe un programa que pida al usuario la puntuación de tres exámenes. Calcula la
    nota media y usa operadores relacionales para determinar si ha aprobado (>=5), si
    tiene notable (>=7), y si tiene sobresaliente (>=9). Muestra todos los resultados.
     */
    public void puntuacion() {
        Scanner leerTeclado= new Scanner(System.in);
        System.out.println("Introduce la puntuacion del primer examen: ");
        double punt1 = leerTeclado.nextDouble();
        System.out.println("Introduce la puntuacion del segundo examen: ");
        double punt2 = leerTeclado.nextDouble();
        System.out.println("Introduce la puntuacion del tercer examen: ");
        double punt3 = leerTeclado.nextDouble();
        double notaMedia= (punt1 + punt2 + punt3)/3;
        boolean aprobado= notaMedia>5 && notaMedia<7;
        System.out.println("El examen esta aprobado " + aprobado);
        boolean notable= 7<= notaMedia && notaMedia> 9;
        System.out.println("El examen es notable " + notable);
        boolean sobresaliente= notaMedia>=9;
        System.out.println("El examen es sobresaliente " + sobresaliente);}
/* EJERCICIO 10
    Crea un programa que pida el salario base por hora, las horas trabajadas y si ha
    hecho horas extra (true/false). Si ha hecho horas extra y trabajó más de 40 horas,
    las horas que excedan de 40 se pagan al doble. Usa operadores lógicos, relacionales
    y aritméticos para calcular el salario total.
     */
    public void salarioBase(){
        Scanner leerTeclado = new Scanner (System.in);
        System.out.println("Introduce tu salario por hora");
        double salario= leerTeclado.nextDouble();
        System.out.println("Introduce las horas trabajadas");
        int horas= leerTeclado.nextInt();
        System.out.println("Has hecho horas extra?");
        boolean horasExtra= leerTeclado.nextBoolean();
        System.out.println("Cuantas horas extra has hecho este mes?");
        double nhorasExtra= leerTeclado.nextDouble();
        leerTeclado.close();

        }

    }

}
