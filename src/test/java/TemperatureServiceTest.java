import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TemperatureServiceTest {

    @Test
    public void tempTest(){
        TemperatureService service = new TemperatureService();

        int [] temper = { 22, 33, 44, 12, 30};

        int expected = 3;
        int actual = service.getMinDay(temper);

        Assertions.assertEquals(expected,actual);


    }
}
