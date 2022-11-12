import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class BonusServiceTest {
    @ParameterizedTest
    // Параметризованный тест работает только с 3 параметрами
    //указываем параметры через специальный флаг CsvSource прямо в тесте
     @CsvSource({
           "15,500,true",
           "150,5000,true"
           })

    //указываем путь к параметрам которые мы указали в отдельном файле
    public void bonusTest(int expected, int amount, boolean isRegistered){
        BonusService serviceBonus = new BonusService();

        //int expected = 15;
        int actual = serviceBonus.calcBonus(amount,isRegistered);

        Assertions.assertEquals(expected,actual);

    }
}
