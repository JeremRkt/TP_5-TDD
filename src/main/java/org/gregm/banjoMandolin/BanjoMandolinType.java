package org.gregm.banjoMandolin;

public enum BanjoMandolinType {

    BANJO("Banjo",3),
    MANDOLIN("Mandolin",5),
    BANJO_MANDOLIN(BANJO.label + MANDOLIN.label, BANJO.modulo + MANDOLIN.modulo)
    ;

    private String label;
    private Integer modulo;

    BanjoMandolinType(String label, Integer modulo) {
        this.label = label;
        this.modulo = modulo;
    }

    public String getLabel() {
        return label;
    }

    public Integer getModulo() {
        return modulo;
    }
}
