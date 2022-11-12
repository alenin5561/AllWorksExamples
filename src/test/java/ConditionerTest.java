import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConditionerTest {
    Conditioner cond = new Conditioner();
    //Указываем создание объекта до проведения тестов, потому что этот объект будет использоваться в каждом тесте.
    //Достаточно будет прописать его один раз перед проведением тестирования.
    @Test
    public void setTemperature(){

        cond.currentTemperature = 15;

        int expected = 15;
        int actual = cond.currentTemperature;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setNewTemperature(){

        cond.setCurrentTemperature(29);

        int expected = 29;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void setMaxTemp() {

        cond.setMaxTemp();

        int expected = 30;
        int actual = cond.getCurrentTemperature();

        Assertions.assertEquals(expected,actual);
    }
}
