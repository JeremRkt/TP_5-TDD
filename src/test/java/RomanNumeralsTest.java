import org.gregm.romanNumber.RomanNumeralsMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {
    @Test
    public void test(){
        Assertions.assertEquals("I", RomanNumeralsMapper.map(1));
        Assertions.assertEquals("II", RomanNumeralsMapper.map(2));
        Assertions.assertEquals("III", RomanNumeralsMapper.map(3));
        Assertions.assertEquals("V", RomanNumeralsMapper.map(5));
        Assertions.assertEquals("VI", RomanNumeralsMapper.map(6));
        Assertions.assertEquals("X", RomanNumeralsMapper.map(10));
        Assertions.assertEquals("XV", RomanNumeralsMapper.map(15));
        Assertions.assertEquals("XVI", RomanNumeralsMapper.map(16));
        Assertions.assertEquals("IX",RomanNumeralsMapper.map(9));
        Assertions.assertEquals("XIX",RomanNumeralsMapper.map(19));
        Assertions.assertEquals("XX",RomanNumeralsMapper.map(20));
        Assertions.assertEquals("XXI",RomanNumeralsMapper.map(21));
        Assertions.assertEquals("XXIV",RomanNumeralsMapper.map(24));
        Assertions.assertEquals("XXIX", RomanNumeralsMapper.map(29));
        Assertions.assertEquals("XXX",RomanNumeralsMapper.map(30));
        Assertions.assertEquals("L",RomanNumeralsMapper.map(50));
        Assertions.assertEquals("LIV",RomanNumeralsMapper.map(54));
        Assertions.assertEquals("LIX",RomanNumeralsMapper.map(59));
        Assertions.assertEquals("XL",RomanNumeralsMapper.map(40));
        Assertions.assertEquals("LX",RomanNumeralsMapper.map(60));
        Assertions.assertEquals("LXX",RomanNumeralsMapper.map(70));
        Assertions.assertEquals("LXXX",RomanNumeralsMapper.map(80));
        Assertions.assertEquals("C",RomanNumeralsMapper.map(100));
        Assertions.assertEquals("XC",RomanNumeralsMapper.map(90));
        Assertions.assertEquals("CX",RomanNumeralsMapper.map(110));
        Assertions.assertEquals("CXX",RomanNumeralsMapper.map(120));
        Assertions.assertEquals("CXL",RomanNumeralsMapper.map(140));
        Assertions.assertEquals("CL",RomanNumeralsMapper.map(150));
        Assertions.assertEquals("CXC",RomanNumeralsMapper.map(190));
        Assertions.assertEquals("CC",RomanNumeralsMapper.map(200));
        Assertions.assertEquals("CCL",RomanNumeralsMapper.map(250));
        Assertions.assertEquals("CCC",RomanNumeralsMapper.map(300));
        Assertions.assertEquals("CCCL",RomanNumeralsMapper.map(350));
        Assertions.assertEquals("D",RomanNumeralsMapper.map(500));
        Assertions.assertEquals("CD",RomanNumeralsMapper.map(400));
        Assertions.assertEquals("DC",RomanNumeralsMapper.map(600));
        Assertions.assertEquals("M",RomanNumeralsMapper.map(1000));
        Assertions.assertEquals("CM",RomanNumeralsMapper.map(900));
        Assertions.assertEquals("MC",RomanNumeralsMapper.map(1100));
        Assertions.assertEquals("MCC",RomanNumeralsMapper.map(1200));
        Assertions.assertEquals("MCD",RomanNumeralsMapper.map(1400));
        Assertions.assertEquals("MLXVI",RomanNumeralsMapper.map(1066));
        Assertions.assertEquals("MCM",RomanNumeralsMapper.map(1900));
        Assertions.assertEquals("MM",RomanNumeralsMapper.map(2000));
        Assertions.assertEquals("MMCD",RomanNumeralsMapper.map(2400));
        Assertions.assertEquals("MMCDXXI",RomanNumeralsMapper.map(2421));
        Assertions.assertEquals("MMCM",RomanNumeralsMapper.map(2900));
        Assertions.assertEquals("MMM",RomanNumeralsMapper.map(3000));
        Assertions.assertEquals("MMMCD",RomanNumeralsMapper.map(3400));
        Assertions.assertEquals("MMMCM",RomanNumeralsMapper.map(3900));
        Assertions.assertEquals("MMMM",RomanNumeralsMapper.map(4000));
        Assertions.assertEquals("MMXXIII",RomanNumeralsMapper.map(2023));


    }

}
