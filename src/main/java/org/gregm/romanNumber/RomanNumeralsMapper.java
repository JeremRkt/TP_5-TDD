package org.gregm.romanNumber;

public class RomanNumeralsMapper {

    public static final String I = "I";

    public static String map(Integer number){

        StringBuilder result = new StringBuilder();

        if (number >= RomanNumeralsType.MMMM.getModulo()){
            result.append(RomanNumeralsType.MMMM.getLabel());
            number -= RomanNumeralsType.MMMM.getModulo();
        }

        if (number >= RomanNumeralsType.MM.getModulo()){
            result.append(RomanNumeralsType.MM.getLabel());
            number -= RomanNumeralsType.MM.getModulo();
        }

        if (number >= RomanNumeralsType.M.getModulo()){
            result.append(RomanNumeralsType.M.getLabel());
            number -= RomanNumeralsType.M.getModulo();
        }

        if (number >= RomanNumeralsType.CM.getModulo()){
            result.append(RomanNumeralsType.CM.getLabel());
            number -= RomanNumeralsType.CM.getModulo();
        }

        if (number >= RomanNumeralsType.D.getModulo()){
            result.append(RomanNumeralsType.D.getLabel());
            number -= RomanNumeralsType.D.getModulo();
        }
        if (number >= RomanNumeralsType.CD.getModulo()){
            result.append(RomanNumeralsType.CD.getLabel());
            number -= RomanNumeralsType.CD.getModulo();
        }

        if (number >= RomanNumeralsType.CC.getModulo()){
            result.append(RomanNumeralsType.CC.getLabel());
            number -= RomanNumeralsType.CC.getModulo();
        }
        if (number >= RomanNumeralsType.C.getModulo()){
            result.append(RomanNumeralsType.C.getLabel());
            number -= RomanNumeralsType.C.getModulo();
        }
        if (number >= RomanNumeralsType.XC.getModulo()){
            result.append(RomanNumeralsType.XC.getLabel());
            number -= RomanNumeralsType.XC.getModulo();
        }

        if (number >= RomanNumeralsType.L.getModulo()){
            result.append(RomanNumeralsType.L.getLabel());
            number -= RomanNumeralsType.L.getModulo();
        }
        if (number >= RomanNumeralsType.XL.getModulo()){
            result.append(RomanNumeralsType.XL.getLabel());
            number -= RomanNumeralsType.XL.getModulo();
        }

        if (number >= RomanNumeralsType.XX.getModulo()){
            result.append(RomanNumeralsType.XX.getLabel());
            number -= RomanNumeralsType.XX.getModulo();
        }
        if (number >= RomanNumeralsType.X.getModulo()){
            result.append(RomanNumeralsType.X.getLabel());
            number -= RomanNumeralsType.X.getModulo();
        }

        if (number >= RomanNumeralsType.IX.getModulo()) {
            result.append(RomanNumeralsType.IX.getLabel());
            number -= RomanNumeralsType.IX.getModulo();
        }

        if (number >= RomanNumeralsType.V.getModulo()){
            result.append(RomanNumeralsType.V.getLabel());
            number -= RomanNumeralsType.V.getModulo();
        }

        if (number >= RomanNumeralsType.IV.getModulo()){
            result.append(RomanNumeralsType.IV.getLabel());
            number -= RomanNumeralsType.IV.getModulo();
        }


        result.append(I.repeat(number));
        return result.toString();
    }
}
