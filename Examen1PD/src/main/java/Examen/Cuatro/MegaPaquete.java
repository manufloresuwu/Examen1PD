package Cuatro;

public class MegaPaquete extends BuilderCombo{

    @Override
    public void buildPipocas(){
        combo.setPipocas("Pipocas Extragrandes");
    }

    @Override
    public void buildChocolates(){
        combo.setChocolates("2 Chocolates Grandes");
    }

    @Override
    public void buildGaseosas(){
        combo.setGaseosas("3 Vasos Grandes RI");
    }


}
