import org.gregm.banjoMandolin.BanjoMandolinMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BanjoMandolinTest {
    @Test
    public void test(){
        Assertions.assertEquals("1", BanjoMandolinMapper.map(1));
        Assertions.assertEquals("2", BanjoMandolinMapper.map(2));
        Assertions.assertEquals("Banjo", BanjoMandolinMapper.map(3));
        Assertions.assertEquals("4", BanjoMandolinMapper.map(4));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(5));
        Assertions.assertEquals("Banjo", BanjoMandolinMapper.map(6));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(10));
        Assertions.assertEquals("BanjoMandolin", BanjoMandolinMapper.map(15));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(20));
        Assertions.assertEquals("BanjoMandolin", BanjoMandolinMapper.map(45));
        Assertions.assertEquals("Banjo", BanjoMandolinMapper.map(27));
        Assertions.assertEquals("BanjoMandolin", BanjoMandolinMapper.map(30));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(50));
        Assertions.assertEquals("BanjoMandolin", BanjoMandolinMapper.map(60));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(70));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(80));
        Assertions.assertEquals("BanjoMandolin", BanjoMandolinMapper.map(90));
        Assertions.assertEquals("Mandolin", BanjoMandolinMapper.map(100));

    }

}
