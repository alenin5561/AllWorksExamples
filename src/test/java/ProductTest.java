import org.junit.jupiter.api.Test;

public class ProductTest {
    @Test
    public void testProduct(){
        Book prod = new Book();
        //Методы могут быть переписаны и исполняться по той логике, которые описаны внутри того объекта, которого мы используем.

        prod.setPrice(100);
        System.out.println(prod.isTooExpensive());
    }
    @Test
    public void useTest(){
        Product prod = new Book();
        //При создании объектов, мы можем указывать сначала родителя, а затем указать наследника чиь методы мы будем использовать.
        //Будет использоваться именно тот метод, который был указан после new.
        //Для использования определенного метода определенного наследника, нам нужно указать имя наследника в котором лежит нужный нам метод.

        prod.use();
    }
}
