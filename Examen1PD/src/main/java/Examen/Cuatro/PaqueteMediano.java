package Cuatro;

public class PaqueteMediano extends BuilderCombo{

    @Override
    public void buildPipocas(){
        combo.setPipocas("Pipocas Grandes");
    }

    @Override
    public void buildChocolates(){
        combo.setChocolates("1 Chocolate");
    }

    @Override
    public void buildGaseosas(){
        combo.setGaseosas("2 Vasos");
    }


}