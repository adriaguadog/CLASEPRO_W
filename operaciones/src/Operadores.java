import java.util.Scanner;

public class Operadores {
    int op1=0;
    public void operadoresAritmeticos () {
        //OPERADORES ARITMETICOS
        //unarios son operandos autoincrementales int op=0, op++ u op--;
        int op1 = 5;
        int op2 = 2;
        double division = op1 / op2;
        System.out.println("La division de " + op1 + " entre " + op2 + " resulta " + division); //resulta 2 y se come los decimales aunque el resultado se guarde en un double, para que
        //la division sea real uno de los operandos tiene que ser también double.
        double operador1 = 5.0;
        double divisionreal = operador1 / op2;
        System.out.println("La division real de " + operador1 + " entre " + op2 + " resulta " + divisionreal);
        //hay que pasar temporalmente mediante casteo el tipo de la variable.
        //EJEMPLO DE CASTEO
        double divisionrea = (double) op1 / op2;
        System.out.println("La division de " + op1 + " entre " + op2 + " resulta " + divisionrea);
        //imaginemos que quiero el resultado con dos decimales, uso System.out.printf (formateado)
        System.out.printf("La division de " + op1 + " entre " + op2 + " resulta %.2f", divisionrea);
        // %.2f son banderas %.2 quiere decir dos decimales, f porque es un float, las banderas se sustituyen por lo que hqy detras de la coma.
        //MODULO
        int resto = op1 % op2;
        System.out.println("\nEl resto o modulo de la division de " + op1 + " entre " + op2 + " resulta " + resto);
        // cosas raras que pueden pasar
        int suma = op1 + op2;
        System.out.println("El resultado de la suma de " + op1 + " y " + op2 + " es " + op1 + op2);
        //no funciona porque concatena los numeros
        System.out.println("El resultado de la suma de " + op1 + " y " + op2 + " es " + (op1 + op2));
        // si funciona
    }
    public void operadoresAsignacion () {
        //OPERADORES DE ASIGNACION
        int op1 = 5;
        op1 += 6; //a lo que ya tenia le sumo 6 y lo guardo como nuevo valor del op1.
        System.out.println("El nuevo valor de op1 es " + op1);
        op1 -= 7;
        System.out.println("El nuevo valor de op1 es " + op1);
        op1 *= 2;
        System.out.println("El nuevo valor de op1 es " + op1);
        op1 /= 4;
        System.out.println("El nuevo valor de op1 es " + op1);
        op1 %= 3;
        System.out.println("El nuevo valor de op1 es " + op1); //el resto es 0.
    }
        //OPERADORES DE COMPARACION: el resultado siempre es un booleano. <,>,<=,>=,!=
    public void operadoresComparacion () {
        int op1 = 5;
        int op2 = 3;
        System.out.println(this.op1);// busca op1 dentro de la clase y fuera del mét odo.
        boolean resultado = op1 < op2;
        System.out.println(resultado);
        //OPERADORES LOGICOS: AND && OR || y NOT
    }
        public void operadoresLogicos() {
            int op1 = 4;
            int op2 = 10;
            int op3 = 17;
            boolean resultado = op1 < op2 && op3 > 0;
            System.out.println(resultado);//sale true si se cumple todo
            boolean resultado2 = op1 < op2 && op3 > 0 && op1 < 0;
            System.out.println(resultado2);
            boolean resultado3 = op1 < op2 || op3 > 0 || op1 < 0 && op1 == 0; //con que una sea true, da true.
            //false || true || false && false si uno es true sale true!
            //funciona como: boolean resultado3= op1<op2 || op3>0 || (op1<0 && op1==0);
            System.out.println(resultado3);
            boolean resultado4 = (op1 < op2 || op3 > 0) && (op1 < 0 && op1 == 0);//false
            System.out.println(resultado4);
            boolean resultadoInverso4 = !resultado4;
            System.out.println(resultadoInverso4);
        }
        public void evaluarCandidato(){
            Scanner leerteclado= new Scanner(System.in);
            System.out.println("Escribe tu nombre y apellidos");
            String nombreApellidos=leerteclado.nextLine(); //nextline lee espacios, Scanner guarda el contenido en la variable nombreApellidos.
            System.out.println("Dime tu edad");
            int edad=leerteclado.nextInt(); //no hace falta crear un nuevo scanner.
            System.out.println("Escribe tu salario actual bruto anual");
            int salario=leerteclado.nextInt();
            System.out.println("Dime tu altura");
            double altura= leerteclado.nextDouble();
            System.out.println("Hola " +nombreApellidos +", tienes " +edad+ " anos, ganas " +salario+ "euros brutos anuales y mides "+altura+" metros");
            System.out.println("Tienes experiencia? Escribe true o false");
            boolean experiencia= leerteclado.nextBoolean();
            boolean resultadoEvaluacion= edad<40 && salario<40000 && experiencia==true;
            System.out.println("El resultado de la evaluacion es positivo: "+ resultadoEvaluacion);
            leerteclado.close();//siempre hay que cerrar el flujo de datos.




    }
}
