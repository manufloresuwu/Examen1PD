package Cuatro;

public class PaqueteNormal extends BuilderCombo{

    @Override
    public void buildPipocas(){
        combo.setPipocas("Pipocas Normales");
    }

    @Override
    public void buildChocolates(){
        combo.setChocolates("N/A");
    }

    @Override
    public void buildGaseosas(){
        combo.setGaseosas("2 Vasos");
    }


}
