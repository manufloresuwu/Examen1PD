package Cuatro;

public class Cliente {

    public static void main(String[] args) {

        Cine cami = new Cine();

        MegaPaquete megaPaquete = new MegaPaquete();
        PaqueteMediano paqueteMediano = new PaqueteMediano();
        PaqueteNormal paqueteNormal = new PaqueteNormal();

        System.out.println("----------------------");
        cami.setBuilderCombo(megaPaquete);
        cami.crearCombo();
        cami.getCombo().mostrarInfo();
        System.out.println("----------------------");
        cami.setBuilderCombo(paqueteMediano);
        cami.crearCombo();
        cami.getCombo().mostrarInfo();
        System.out.println("----------------------");
        cami.setBuilderCombo(paqueteNormal);
        cami.crearCombo();
        cami.getCombo().mostrarInfo();
    }

}
