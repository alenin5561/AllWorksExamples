import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtTest {
    @Test
    public void sqrt() {
        //для создания теста необходимо ввести команду *public void* с наименованием проводимого
        // теста, и в теле указать к каким объектам и функциям мы обращаемся, с указанием ожидаемого и фактического результатов,
        // и соответствующей проверки между ними с помощью Assertions.
        SqrtService service = new SqrtService();
        //создали переменную
        int expected = 3;
        //ожидаем
        int actual = service.sqrtService(9);
        //что имеем фактически

        Assertions.assertEquals(expected,actual);
        //делаем проверку совпадает ли результат того что мы ожидаем и того что имеем фактически.
    }

}
