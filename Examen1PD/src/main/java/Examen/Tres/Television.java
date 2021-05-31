package Examen.Tres;

public class Television implements IArtefacto {
    private int precio = 1200;

    public Television(){}

    @Override
    public void getPrecio(){
        System.out.println("Television: " + precio + " bs");
    }

}
