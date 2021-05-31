package Examen.Tres;

public class Refrigerador implements IArtefacto {
    private int precio = 1000;

    public Refrigerador(){}

    @Override
    public void getPrecio(){
        System.out.println("Refrigerador: " + precio + " bs");
    }

}
