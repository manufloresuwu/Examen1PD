package Cuatro;

public class Cine {

    private BuilderCombo builderCombo;

    public Combo getCombo() {
        return builderCombo.getCombo();
    }

    public void setBuilderCombo(BuilderCombo builderCombo) {
        this.builderCombo = builderCombo;
    }

    public void crearCombo(){
        this.builderCombo.createCombo();
        this.builderCombo.buildChocolates();
        this.builderCombo.buildGaseosas();
        this.builderCombo.buildPipocas();
    }
}
