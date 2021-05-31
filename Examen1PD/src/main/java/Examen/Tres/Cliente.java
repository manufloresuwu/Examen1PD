package Examen.Tres;

public class Cliente {

    public static void main(String[] args) {

        FactoryArtefacto.make(FactoryArtefacto.Artefactos.Television).getPrecio();
        FactoryArtefacto.make(FactoryArtefacto.Artefactos.Radio).getPrecio();
        FactoryArtefacto.make(FactoryArtefacto.Artefactos.Batidora).getPrecio();
        FactoryArtefacto.make(FactoryArtefacto.Artefactos.Refrigerador).getPrecio();
        FactoryArtefacto.make(FactoryArtefacto.Artefactos.Microondas).getPrecio();

    }

}