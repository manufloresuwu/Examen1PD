package Cuatro;

public class Combo {

    private String pipocas;
    private String gaseosas;
    private String chocolates;

    public String getPipocas() {
        return pipocas;
    }

    public void setPipocas(String pipocas) {
        this.pipocas = pipocas;
    }

    public String getGaseosas() {
        return gaseosas;
    }

    public void setGaseosas(String gaseosas) {
        this.gaseosas = gaseosas;
    }

    public String getChocolates() {
        return chocolates;
    }

    public void setChocolates(String chocolates) {
        this.chocolates = chocolates;
    }

    public void mostrarInfo(){

        System.out.println("Pipocas : " + pipocas);
        System.out.println("Gaseosas : " + gaseosas);
        System.out.println("Chocolates : " + chocolates);


    }
}
