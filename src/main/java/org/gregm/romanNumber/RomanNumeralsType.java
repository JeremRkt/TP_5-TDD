package org.gregm.romanNumber;

public enum RomanNumeralsType {

    IV("IV", 4),
    V("V", 5),
    X("X",10),
    IX("IX", 9),
    XX("XX", 20),
    XL("XL",40),
    L("L",50),
    XC("XC", 90),
    C("C", 100),
    CC("CC", 200),
    CD("CD", 400),
    D("D", 500),
    CM("CM", 900),
    M("M", 1000),
    MM("MM", 2000),
    MMMM("MMMM", 4000),
    ;

    private String label;
    private Integer modulo;

    RomanNumeralsType(String label, Integer modulo) {
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
