package Examen.Tres;

public class Batidora implements IArtefacto {
    private int precio = 120;

    public Batidora(){}

    @Override
    public void getPrecio(){
        System.out.println("Batidora: " + precio + " bs");
    }

}
