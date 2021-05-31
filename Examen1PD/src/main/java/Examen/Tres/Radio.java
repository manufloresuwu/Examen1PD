package Examen.Tres;

public class Radio implements IArtefacto {
    private int precio = 50;

    public Radio(){}

    @Override
    public void getPrecio(){
        System.out.println("Radio: " + precio + " bs");
    }

}
