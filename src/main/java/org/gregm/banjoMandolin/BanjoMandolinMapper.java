package org.gregm.banjoMandolin;

public class BanjoMandolinMapper {


    public static String map(Integer number){

        if (number % BanjoMandolinType.BANJO.getModulo() == 0 && number % BanjoMandolinType.MANDOLIN.getModulo()==0){
            return BanjoMandolinType.BANJO.getLabel() + BanjoMandolinType.MANDOLIN.getLabel();
        }
        if (number % BanjoMandolinType.BANJO.getModulo() == 0){
            return BanjoMandolinType.BANJO.getLabel();
        }
        if (number % BanjoMandolinType.MANDOLIN.getModulo() == 0){
            return BanjoMandolinType.MANDOLIN.getLabel();
        }
        return number.toString();
    }
}
