package Examen.Cinco;

public class Cliente {

    public static void main (String[]args){

        String op="1 sumar 2 restar 2 sumar 1 sumar 1";
        Interpreter interpreterOperaciones = new Interpreter(op);
        System.out.println("Operacion: " + op);
        System.out.println("Resultado: " + interpreterOperaciones.interpretar());

    }

}
