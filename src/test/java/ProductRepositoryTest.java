import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ProductRepositoryTest {
    //создаем объект товара которые мы хотим добавить в массив
    PurchaseItem item1 = new PurchaseItem(12, 1, "хлеб", 130, 1);
    PurchaseItem item2 = new PurchaseItem(14, 2, "булка", 120, 12);

    @Test
    public void RepoTestSave() {
        ProductRepository repo = new ProductRepository();
        //создаем объект репозитория, с функциями которые будут тестироваться

        //Репозиторий пустой, потому что в нем ничего не лежит, а для того, чтобы в нем находился объект необходимо создать объект,
        //и вызвать функцию save для сохранения в массив объекта.
        repo.save(item1);
        repo.save(item2);
        //используем метод добавления товара, и используем объект товара который указали до тестирования
        PurchaseItem[] expected = {item1, item2};
        //(массив который мы создали в репозитории)
        //для проверки ожидаемого результата указываем массив, и то что мы ожидаем от выполнения метода
        PurchaseItem[] actual = repo.getItems();
        //для проверки фактического результата так же указываем массив и вызываем метод, который вернет все что лежит в массиве.

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void RepoTestRemove() {
        ProductRepository repo = new ProductRepository();
        //создаем объект репозитория, который хранит методы
        repo.save(item1);
        repo.save(item2);
        //выполняем сохранение товара в массив
        repo.removeById(12);
        //выполняем удаление товара по id
        PurchaseItem[] expected = {item2};
        PurchaseItem[] actual = repo.getItems();
        //выполняем проверку
        Assertions.assertArrayEquals(expected, actual);

    }


}
