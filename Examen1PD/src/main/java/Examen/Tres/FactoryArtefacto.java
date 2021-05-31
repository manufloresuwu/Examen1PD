package Examen.Tres;

public class FactoryArtefacto {

    enum Artefactos {
        Television, Radio, Batidora, Refrigerador, Microondas
    }

    public static IArtefacto make(Artefactos tipo) {
        IArtefacto artefacto;

        switch (tipo) {

            case Television: {
                artefacto = new Television();
                break;
            }

            case Radio: {
                artefacto = new Radio();
                break;
            }

            case Batidora: {
                artefacto = new Batidora();
                break;
            }

            case Refrigerador: {
                artefacto = new Refrigerador();
                break;
            }

            case Microondas: {
                artefacto = new Microondas();
                break;
            }

            default:
                artefacto = new Radio();
                break;
        }

        return artefacto;
    }

}
