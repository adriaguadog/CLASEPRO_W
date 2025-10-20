public class MainCreated {
    String miNombre="Godofreda"; //variable global a la que vamos a llamar con this.

    public static void main(String[] args){

        System.out.println("este es mi primer programa en java");
        System.out.println("este es mi segundo programa en java");
        System.out.print("este es mi primer programa en java");
        System.out.print("este es mi segundo programa en java\n");
// si pongo ln tras el print, me hace salto de linea.
//\n hace un salto de linea y solo funciona dentro de las comillas.
// public quiere decir que to.do el mundo lo puede ver, static porque es obligatorio y no se mueve, void porque no genera un resultado.
// TODO para cosas pendientes de terminar. Si luego ledoy a view-tool-TODO me sale una ventana con todo lo pendiente
//cuando le doy a run, se crea una carpeta out con un archivo.class del mismo nombre, que es lo que recibe la JVM para leer.
        String miNombre="Adriana";
        miNombre= "Adri";//para redefinir una variable, no poner el string.
            System.out.println(miNombre);
        char letraDni='b';
        char otraLetraDni=109; // tambien se pueden poner numeros que el ordenador traduce a letra.
            System.out.println(letraDni);
            System.out.println(otraLetraDni);
        int edad=41;
        edad++;//suma uno.
            System.out.println(edad);
    //double guarda muchos decimales. Float tiene menos precision.
        double altura=1.71;
        float peso=54.72f;//siempre poner la f.
            System.out.println(altura);
            System.out.println(peso);
        boolean experiencia=false; //solo se puede guardar true o false sin comillas.
            System.out.println(experiencia);
        /*VARIABLES COMPLEJAS: vienen de una clase, por eso String va con mayusculas, pueden ejecutar sus metodos especificos.
        VARIABLES PRIMITIVAS: guardan un dato, simples.
        Para anadir funcionalidad a una variable primitiva, existen las variables envolventes.
        Character, Boolean, Float, Double, Integer, descienden de Object que tiene funciones mas genéricas. Ocupan mas memoria pero tienen funcionalidades a las que puedes acceder escribiendo un .
         */
        Integer edad2=21;
            System.out.println(edad2.doubleValue());//funcionalidad
        /* tambien hay variables mutables (que se pueden reasignar) y no mutables (ej:final String= "DNI" se marca como constante).
         */
            System.out.println(Math.PI);//libreria math
        /*variables de clase global o de bloque: las de bloque solo son accesibles desde el método en el que se hqn creado.
         */
        nombreMetodo();//llamo al metodo dentro de main para que se ejecute, esta definido mas abajo.

    }
    public static void nombreMetodo (){
      String miNombre= "Laura"; //las variables que he creado antes ya no existen en este nuevo metodo. Laura también es local.
        System.out.println(miNombre); //java prioriza la local, Laura
        //System.out.println(this.miNombre); //this llama a la variable dentro de la clase y fuera de los métodos, Godofreda.
        saludar("Adriana");
    }
    public static void saludar(String nombre){
            System.out.println("enhorabuena "+nombre+", has llamado a tu primer método");
        }// estoy definiendo un mét odo saludar que puede ser llamado antes o despues de definirse.
    /* los metodos nombreMetodo y saludar son de instancia mientras que main es estatico. No se puede llamar a un metodo no estatico desde uno estatico.
    Para arreglarlo, pongo static delante de metodo.
    No se puede usar this en un metodo estatico.
     */


}
