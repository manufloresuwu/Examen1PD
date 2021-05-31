package Examen.Uno;

public class Cliente {

    public static void main(String[]args){
        CabinaSingleton cabina = CabinaSingleton.getInstance();

        Vehiculo v1 = new Vehiculo();
        v1.setPlaca("123EFT");
        v1.setModelo("Renault KWID");

        Vehiculo v2 = new Vehiculo();
        v2.setPlaca("234WDF");
        v2.setModelo("Duster");

        Vehiculo v3 = new Vehiculo();
        v3.setPlaca("765QSE");
        v3.setModelo("Montero");

        Vehiculo v4 = new Vehiculo();
        v4.setPlaca("842ASE");
        v4.setModelo("Celerio");

        Vehiculo v5 = new Vehiculo();
        v5.setPlaca("345KLO");
        v5.setModelo("March");

        Vehiculo v6 = new Vehiculo();
        v6.setPlaca("456HJK");
        v6.setModelo("Sandero");

        cabina.pagar(v1, 12000);
        cabina.pagar(v2, 30000);
        cabina.pagar(v3, 120000);
        cabina.pagar(v4, 16000);
        cabina.pagar(v5, 67000);
        cabina.pagar(v6, 34000);

        cabina.show();

    }

}
