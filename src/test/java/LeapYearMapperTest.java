import org.gregm.year.LeapYearMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LeapYearMapperTest {
    @Test
     public void test(){

        Assertions.assertTrue(LeapYearMapper.checkLeapYear(2000),"true" );
        Assertions.assertFalse(LeapYearMapper.checkLeapYear(1900),"false");
        Assertions.assertFalse(LeapYearMapper.checkLeapYear(2100), "false");
        Assertions.assertTrue(LeapYearMapper.checkLeapYear(2400),"true");
        Assertions.assertTrue(LeapYearMapper.checkLeapYear(2008),"true");
        Assertions.assertFalse(LeapYearMapper.checkLeapYear(2300),"false");

    }

}