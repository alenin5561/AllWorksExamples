import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringNamesServiceTest {
    @Test
    public void namesLengthTest(){
        StringNamesService service = new StringNamesService();
        String s1 = "Katalina";
        String s2 = "Margarit";

        String expected = s1;
        String actual = service.longestNames(s1,s2);

        Assertions.assertEquals(expected,actual);
    }
}
