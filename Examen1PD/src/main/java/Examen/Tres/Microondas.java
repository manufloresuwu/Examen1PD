package Examen.Tres;

public class Microondas implements IArtefacto {
    private int precio = 500;

    public Microondas(){}

    @Override
    public void getPrecio(){
        System.out.println("Microondas: " + precio + " bs");
    }

}